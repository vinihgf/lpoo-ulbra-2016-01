/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercício2;

/**
 *
 * @author Elton
 */
class Lampada {
    boolean ligada;
    
    public void liga(){
        ligada = true;
    }
    
    public void desliga(){
        ligada = false;
    }
    
    public String observa(){
        if (ligada){
            return "Lâmpada ligada";
        }
        else {
            return "Lâmpada desligada";
        }
    }
}
