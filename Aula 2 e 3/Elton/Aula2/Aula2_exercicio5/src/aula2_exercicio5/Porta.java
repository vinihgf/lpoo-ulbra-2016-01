/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercicio5;

/**
 *
 * @author Elton
 */
class Porta {
    
    boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;
    
    public void abre(){
        
        this.aberta = true ;
        
    }
    
    public void fecha(){
        
        this.aberta = false;
        
    }
    
    public void pinta(String s){
        
        
        
    }
    
    String estaAberta(){
        
        String retorno = null;
        
        if (aberta){
            
            retorno += "-------------------------------";
            retorno += "        PORTA ABERTA       ";
            retorno += "-------------------------------";
            
            
        } 
        else
        {
            
            retorno += "-------------------------------";
            retorno += "        PORTA FECHADA       ";
            retorno += "-------------------------------";
            
        }
        
        return retorno;
    }
    
}
