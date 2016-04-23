/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author Vinicius
 */
public class CL_Lampada {
    boolean ligada;
    
    
    public void setLampada(boolean ligada)
    {
        this.ligada = ligada;
    }
    
    public void liga()
    {
        this.ligada = true;
    }
    public void desliga()
    {
        this.ligada = false;
    }
    
    public String observa()
    {
        String retorno;
        if(this.ligada == true)
        {
            retorno = "A lampada esta ligada!";
        }
        else
        {
            retorno = "A lampada esta desligada!";
        }
        return retorno;
    }
}
