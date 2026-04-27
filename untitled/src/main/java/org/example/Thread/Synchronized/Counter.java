package org.example.Thread.Synchronized;

public class Counter {

    private int count =0;

    public synchronized void increment(){//syncronized keyword
        count++;
    }

    public int getCount(){
        return count;
    }
}
