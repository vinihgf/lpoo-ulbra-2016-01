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
public class Novo extends Imovel{
    
    public void adicional (double adicional){
        
        adicional = ((this.preco * adicional)/100); 
        this.preco = this.preco + adicional;
        
    }
    
     
    
}
