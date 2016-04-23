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
public class Velho extends Imovel {
    
    public void desconto(double desconto){
    
        desconto = ((this.preco * desconto)/100); 
        this.preco = this.preco - desconto;
        
    }
    
}
