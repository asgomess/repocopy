package com.bootcamp.canifetes.join;

public class TrabalhadorDasCaldas implements Runnable{
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("TRABALHADOR: Estou aqui a fazer uns...");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Estava a dormir, mas acordaram-me");
            }
        }
        
    }
}
