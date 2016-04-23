/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_aula6;

/**
 *
 * @author Elton
 */
class Ingresso {
    double valor = 100.00;
    int camarote = 1;
    
    public void imprimir (int menu){
        
        if (menu == 1){
            
            System.out.println(" ----------------------------------------- \n");  
            System.out.println("       INGRESSO NORMAL! VALOR " + this.valor + "   \n");
            System.out.println(" ------------------------------------------- ");  
            
        } else {
            
            if (this.camarote == 1){
                
                System.out.println(" --------------------------------------------------------------------------- \n");  
                System.out.println("             INGRESSO VIP CAMAROTE SUPERIOR! VALOR " + this.valor + "        \n");
                System.out.println(" ---------------------------------------------------------------------------   "); 
                
            } else if (this.camarote == 2){
                
                System.out.println(" --------------------------------------------------------------------------- \n");  
                System.out.println("             INGRESSO VIP CAMAROTE INFERIOR! VALOR " + this.valor + "        \n");
                System.out.println(" ---------------------------------------------------------------------------   "); 
                
            } else {
                
                System.out.println(" ----------------------------------------- \n");  
                System.out.println("           INGRESSO INVÁLIDO!              \n");
                System.out.println(" ------------------------------------------- "); 
                
            }
            
        }
        
    }
    
}
