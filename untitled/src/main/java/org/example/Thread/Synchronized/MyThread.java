package org.example.Thread.Synchronized;

public class MyThread extends Thread{

    Counter counter= new Counter();

    public MyThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
