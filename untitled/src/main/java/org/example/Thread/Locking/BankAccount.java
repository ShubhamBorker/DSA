package org.example.Thread.Locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance =100;

    private final Lock lock =new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "Thread attempting to withdraw " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + "Proceding with the withdraw");
                        Thread.sleep(4000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName() + "Completed the Withdrawal, remaining balance " + balance);
                    }
                    catch (Exception e){
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + "Insufficent balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + "could not accquire lock ");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
