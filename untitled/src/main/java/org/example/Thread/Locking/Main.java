package org.example.Thread.Locking;

public class Main {
    public static void main(String[] args){
        BankAccount hdfc= new BankAccount();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                hdfc.withdraw(50);
            }
        };
        Thread t1= new Thread(runnable,"Thread 1 ");
        Thread t2= new Thread(runnable,"Thread 2 ");
        t1.start();
        t2.start();
    }
}
