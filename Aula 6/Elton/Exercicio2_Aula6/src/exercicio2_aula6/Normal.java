/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_aula6;

/**
 *
 * @author Elton
 */
class Normal extends Ingresso{
    
    public void imprime() {
        
        this.imprimeValor();
        System.out.println("                                 NORMAL  R$ " + this.valor + "\n");
        System.out.println(" ----------------------------------------------------------------------------- ");
        
    }
    
}
