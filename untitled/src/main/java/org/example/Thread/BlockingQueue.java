package org.example.Thread;

import java.util.concurrent.*;

public class BlockingQueue {

    static class Producer implements Runnable {
        private final java.util.concurrent.BlockingQueue<Integer> queue;

        public Producer(java.util.concurrent.BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i); // blocks if queue is full
                    System.out.println("Produced: " + i);
                    Thread.sleep(100); // small delay for demo clarity
                }
                // signal consumer(s) to stop
                queue.put(-1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Consumer implements Runnable {
        private final java.util.concurrent.BlockingQueue<Integer> queue;

        public Consumer(java.util.concurrent.BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                while (true) {
                    Integer item = queue.take(); // blocks if queue is empty
                    if (item == -1) {
                        // put the sentinel back for other consumers (if any) and exit
                        queue.put(-1);
                        break;
                    }
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3); // capacity 3
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Producer(queue));
        executor.execute(new Consumer(queue));
        executor.shutdown();
        try {
            boolean terminated = executor.awaitTermination(1, TimeUnit.MINUTES);
            if (!terminated) {
                executor.shutdownNow();
                System.out.println("Executor did not terminate in time; forced shutdown executed.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
