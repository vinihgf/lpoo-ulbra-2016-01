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
class Vip extends Ingresso{
    double adicional = 50.0;
    
    public double adicional (){
        
        adicional = ((this.valor * adicional)/100); 
        this.valor = this.valor + adicional;
        
        return this.valor;
    }
    
}
