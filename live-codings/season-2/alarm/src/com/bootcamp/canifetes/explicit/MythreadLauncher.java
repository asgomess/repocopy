package com.bootcamp.canifetes.explicit;

public class MythreadLauncher {
    
    public static void main(String[] args) {
        
        Runnable runnable = new MyRunnable();
        //runnable.run();
        
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(runnable);
            thread.setName("Canifetes " + i);
            thread.start();
        }
        
        Thread thread = new Thread(runnable);
        thread.start();
        
    }
}
