package com.bootcamp.canifetes.explicit;

public class MyRunnable implements Runnable{
    
    
    @Override
    public void run() {
        System.out.println("This is the thread: " + Thread.currentThread().getName());
    }
}
