/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_aula6;

import java.util.Scanner;

/**
 *
 * @author Elton
 */
public class Exercicio1_Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double valor = 2.0;
        double desconto = 5.0;
        int menu = 1;
        
        Novo novo = new Novo();
        Velho velho = new Velho();
        Ingresso ingresso = new Ingresso();
        
        while (menu != 5){
            
            System.out.printf("MENU \n");
            System.out.printf("(1) Ingresso normal \n");
            System.out.printf("(2) Ingresso VIP \n");
            System.out.printf("(3) Novo valor \n");
            System.out.printf("(4) Velho valor \n");
            System.out.printf("(5) Sair \n");
            menu = ler.nextInt();
        
            System.out.printf(" \n ");
        
            if (menu == 1){
                
                ingresso.imprimir(menu);
                
            } else if (menu == 2){
            
                System.out.printf("MENU \n");
                System.out.printf("(1) Camarote superior \n");
                System.out.printf("(2) Camarote inferior \n");
                int camarote = ler.nextInt();
                
                System.out.printf(" \n ");
                
                ingresso.camarote = camarote;
                ingresso.imprimir(menu);
                
            } else if (menu == 3){
          
                novo.adicional(valor);
                novo.Imprimir();
            
            } else if (menu == 4){
        
                velho.desconto(desconto);
                velho.Imprimir();
            
            } else if (menu == 5){
            
                System.out.printf("Saindo... \n");
                
            } else {
            
                System.out.printf("Menu inválido! \n");
            
            }
            
            System.out.printf(" \n ");
        }
        
    }
    
}
