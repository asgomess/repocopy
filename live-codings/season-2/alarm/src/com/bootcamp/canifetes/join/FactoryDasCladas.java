package com.bootcamp.canifetes.join;

public class FactoryDasCladas {
    
    public static void main(String[] args) {
        
        System.out.println("GERENTE: `A espera que o trabalhador acabe.");
        Thread worker = new Thread(new TrabalhadorDasCaldas());
        worker.start();
        
        try {
            worker.join();
        } catch (InterruptedException e) {
            System.out.println("TRABALHADOR: Estava a trabalhar mas interromperam-me...");
        }
        
        
        System.out.println("GERENTE: O trabalho tá feito, vou pra casa");
        
        
        
    }
}
