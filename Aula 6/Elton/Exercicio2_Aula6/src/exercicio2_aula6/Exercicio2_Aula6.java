/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_aula6;

import java.util.Scanner;

/**
 *
 * @author Elton
 */
public class Exercicio2_Aula6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double valor = 2.0;
        double desconto = 5.0;
        int menu = 1;
        int camarote = 0;
        String localizacao = "teste";
        
        
        Novo novo = new Novo();
        Velho velho = new Velho();
        Ingresso ingresso = new Ingresso();
        Vip vip = new Vip();
        Normal normal = new Normal();
        CamaroteInferior camaroteInf = new CamaroteInferior();
        CamaroteSuperior camaroteSup = new CamaroteSuperior();
        
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
                
                normal.imprime();
                
            } else if (menu == 2){
            
                System.out.printf("MENU \n");
                System.out.printf("(1) Camarote superior \n");
                System.out.printf("(2) Camarote inferior \n");
                camarote = ler.nextInt();
                
                System.out.printf(" \n ");
                    
                if (camarote == 1){
                    
                    ingresso.imprimeValor();
                    System.out.println("                            VIP camarote superior  R$ " + camaroteSup.adicional() + "\n");
                    System.out.println(" ---------------------------------------------------------------------------- ");
                    
                } else if (camarote == 2){
                    
                    System.out.printf("Informe a localização do ingresso: ");
                    localizacao = ler.next();
                    
                    ingresso.imprimeValor();
                    System.out.println("                            VIP camarote inferior  R$ " + vip.adicional());
                    camaroteInf.imprimirLocalizacao(localizacao);
                    System.out.println(" ---------------------------------------------------------------------------- ");
                    
                } else {
                    
                    System.out.println(" ---------------------------------------------------------------------------- ");
                    System.out.println("                            Menu Inválido!                                    ");
                    System.out.println(" ---------------------------------------------------------------------------- ");
                    
                }
                
            } else if (menu == 3){
          
                novo.adicional(valor);
                novo.Imprimir();
            
            } else if (menu == 4){
        
                velho.desconto(desconto);
                velho.Imprimir();
            
            } else if (menu == 5){
            
                System.out.println(" ---------------------------------------------------------------------------- ");
                System.out.println("                            Saindo...                                         ");
                System.out.println(" ---------------------------------------------------------------------------- ");
                
            } else {
            
                System.out.println(" ---------------------------------------------------------------------------- ");
                System.out.println("                            Menu Inválido!                                    ");
                System.out.println(" ---------------------------------------------------------------------------- ");
            
            }
            
            System.out.printf(" \n ");
        }
    }

}
