/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg1_lpoo;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Administrador extends Caixa{
    
    Scanner scanner = new Scanner(System.in);
    
    public void consultarTotalEmCaixa(int notas50, int notas20, int notas10, int notas5, int notas2){
        
        String imprimir;        
        int totalEmCaixa = ((notas50*50)+(notas20*20)+(notas10*10)+(notas5*5)+(notas2*2));
        
        imprimir = "===================================";
        imprimir += "\n        << Consulta Caixa >>       ";
        imprimir += "\n Total disponível: R$ " + totalEmCaixa + ",00";
        imprimir += "\n Quantidade de cédulas disponíveis:";
        imprimir += "\n          R$ 50,00 x "     + notas50;
        imprimir += "\n          R$ 20,00 x "     + notas20;
        imprimir += "\n          R$ 10,00 x "     + notas10;
        imprimir += "\n          R$ 5,00 x "       + notas5;
        imprimir += "\n          R$ 2,00 x "       + notas2;
        imprimir += "\n===================================";
                
        System.out.println(imprimir);
    }
    
    // Reposição de Cédulas
    public int reporNotas50(int quantidade){
        this.notas50 = quantidade;
        this.notas50 += scanner.nextInt();         
        return this.notas50;
    }
     
    public int reporNotas20(int quantidade){
        this.notas20 = quantidade;
        this.notas20 += scanner.nextInt();        
        return this.notas20;
    }
    
    public int reporNotas10(int quantidade){
        this.notas10 = quantidade;
        this.notas10 += scanner.nextInt();     
        return this.notas10;
    }
     
    public int reporNotas5(int quantidade){
        this.notas5 = quantidade;
        this.notas5 += scanner.nextInt();        
        return this.notas5;
    }
    
    public int reporNotas2(int quantidade){
        this.notas2 = quantidade;
        this.notas2 += scanner.nextInt();        
        return this.notas2;
    }
    
}