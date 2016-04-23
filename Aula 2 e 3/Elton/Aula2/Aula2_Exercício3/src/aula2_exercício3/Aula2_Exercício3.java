/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercício3;

import java.util.Scanner;

/**
 *
 * @author Elton
 */
public class Aula2_Exercício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        
        System.out.printf("Informe o valor do lado do quadrado! \n");
        quadrado.lado = ler.nextDouble(); 
        
        System.out.println("\n");
        
        System.out.println("Area: " + quadrado.area() + " metros quadrados \n");
        System.out.println("Perimetro: " + quadrado.perimetro() + " metros \n");
    }
    
}
