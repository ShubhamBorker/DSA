package org.example.Queue.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class LogProducer implements Runnable {

    private BlockingQueue<String> logQueue;

    public LogProducer(BlockingQueue<String> logQueue){
        this.logQueue = logQueue;
    }

    @Override
    public void run() {
        try {
            for (int i=1; i<=5; i++){
                String logMessage = "Log message " + i;
                System.out.println("Produced " + logMessage);
                logQueue.put(logMessage);//waits if queue is full
                Thread.sleep(300);
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class LogConsumer implements Runnable {
    private BlockingQueue<String> logQueue;

    public LogConsumer(BlockingQueue<String> logQueue) {
        this.logQueue = logQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String log = logQueue.take(); // waits if empty
                System.out.println("Consumed (writing to file): " + log);
                Thread.sleep(800); // simulate slow file writing
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}



