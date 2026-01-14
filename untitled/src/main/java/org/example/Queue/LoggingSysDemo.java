package org.example.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LoggingSysDemo{
    public static void main(String[]args){
        BlockingQueue<String> logq= new LinkedBlockingQueue<>(3);

        Thread producerThread = new Thread(new LogProducer(logq));
        Thread consumerThread = new Thread(new LogConsumer(logq));

        producerThread.start();
        consumerThread.start();


    }
}
