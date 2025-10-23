package com.bootcamp.canifetes;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
    
    private Timer timer;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Numver of times to ring");
        int nrRings = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ring interval in seconds?");
        int interval = Integer.parseInt(scanner.nextLine());
        
        Alarm alarm1 = new Alarm();
        Alarm alarm2 = new Alarm();
        alarm1.start(nrRings, interval);
        alarm2.start(nrRings, interval);
        
        
    }
    
    public void start(int nrRings, int interval) {
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(nrRings), 0, interval * 1000);
        
    }
    
    private class Ring extends TimerTask {
        
        int rings;
        
        public Ring(int rings) {
            this.rings = rings;
        }
        
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": alarm is ringing");
            rings--;
            if(rings == 0) {
                System.out.println("Alarm stopped");
                stop();
            }
        }
        
        public void stop() {
            timer.cancel();
        }
    }
    
    
}
