/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercicio5;
import java.util.Scanner;
/**
 *
 * @author Elton
 */
public class Aula2_exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int menu = 0;
        int porta = 0;
        
        Porta porta1 = new Porta();
        porta1.dimensaoX = 1;
        porta1.dimensaoY = 0;
        porta1.dimensaoZ = 10;
        
        Porta porta2 = new Porta();
        porta2.dimensaoX = 1;
        porta2.dimensaoY = 0;
        porta2.dimensaoZ = 10;
        
        Porta porta3 = new Porta();
        porta3.dimensaoX = 1;
        porta3.dimensaoY = 0;
        porta3.dimensaoZ = 10;
        
        Casa casa = new Casa();
        
        Edificio edificio = new Edificio();
        
        System.out.printf(" MENU \n");
        System.out.printf(" (1) ABRIR PORTA \n");
        System.out.printf(" (2) FECHAR PORTA \n");
        menu = ler.nextInt();
        
        System.out.printf(" \n ");
        
        if (menu == 1){
            
            System.out.printf(" ABIR PORTA: \n");
            System.out.printf(" (1) PORTA 1 \n");
            System.out.printf(" (2) PORTA 2 \n");
            System.out.printf(" (3) PORTA 3 \n");
            porta = ler.nextInt();
            
            System.out.printf(" \n ");
             
            if (porta == 1){
                
                porta1.abre();
                
            } else if (porta == 2){
                
                porta2.abre();
                
            } else if (porta == 3){
                
                porta3.abre();
                
            } else {
                
                System.out.printf("-------------------------\n");
                System.out.printf("       MENU INVÁLIDO!    \n");
                System.out.printf("-------------------------\n");
                
            }
            
            System.out.printf(" I: \n");
        } else if (menu == 2){
            
            System.out.printf(" FECHAR PORTA: \n");
            System.out.printf(" (1) PORTA 1 \n");
            System.out.printf(" (2) PORTA 2 \n");
            System.out.printf(" (3) PORTA 3 \n");
            porta = ler.nextInt();
            
            if (porta == 1){
                
                porta1.fecha();
                
            } else if (porta == 2){
                
                porta2.fecha();
                
            } else if (porta == 3){
                
                porta3.fecha();
                
            } else {
                
                System.out.printf("-------------------------\n");
                System.out.printf("       MENU INVÁLIDO!    \n");
                System.out.printf("-------------------------\n");
                
            }
            
        } else {
            
            System.out.printf("-------------------------\n");
            System.out.printf("       MENU INVÁLIDO!    \n");
            System.out.printf("-------------------------\n");
            
        }
    }
    
}
