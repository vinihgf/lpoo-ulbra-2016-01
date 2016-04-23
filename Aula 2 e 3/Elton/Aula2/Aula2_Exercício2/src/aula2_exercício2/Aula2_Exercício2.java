/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercício2;

import java.util.Scanner;

/**
 *
 * @author Elton
 */
public class Aula2_Exercício2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe o estado da lâmpada! \n");
        System.out.printf("(false) Ligada \n");
        System.out.printf("(true) Desligada \n");
        lampada.ligada = ler.nextBoolean(); 
        
        
        if (lampada.ligada == true){
            lampada.liga();
        } 
        else if (lampada.ligada == false){
            lampada.desliga();
        }
        
        System.out.println(lampada.observa());
    }
    
}
