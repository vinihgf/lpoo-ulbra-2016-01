/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio6;

import java.util.Scanner;

/**
 *
 * @author Elton
 */
public class Aula4_exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int menu = 1;
        
        Moto moto = new Moto("Suzuki", "ZY084", "Azul", 0);
        
        while (menu != 3){
            
            System.out.printf("(1)Subir Marcha \n");
            System.out.printf("(2)Descer Marcha \n");
            System.out.printf("(3)Sair \n");
            menu = ler.nextInt();
        
            if (menu == 1) {
            
                moto.marchaAcima();
            
            } else if (menu == 2){
            
                moto.marchaAbaixo();
            
            } else if (menu == 3){
            
                System.out.printf(" saindo... ");
            
            } else {
            
                System.out.printf(" -------------------------- \n");
                System.out.printf("      Menu Inválido! \n");
                System.out.printf(" -------------------------- \n");
            
            }
            
        }
     
    }
    
}
