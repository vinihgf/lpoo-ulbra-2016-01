/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execicio2;

/**
 *
 * @author Machado23
 */
public class Lampada {
    public boolean ligada;
    
    public void liga(){
    this.ligada = true;
}
    public void desliga(){
        this.ligada =false;
    }
    public String observa(){
        String retorno;
        if(this.ligada == true)
        {
            retorno = "A lampada está ligada";
        }
        else
        {
            retorno = "A lampada está desligada";
        }
        return retorno;
    }
}
