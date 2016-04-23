/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio4;

/**
 *
 * @author Elton
 */
class Moto {
    
    String marca;
    String modelo;
    String cor;
    int marcha;
    
    
    public void imprimir(){
        
        String retorno = "-------------------------------";
        retorno += "\n Marca: " + this.marca + "\n Modelo: " + this.modelo + "\n Cor: " + this.cor + "\n Marcha: " + this.marcha + "\n";
        retorno += "-------------------------------";
        System.out.println(retorno);
        
    }
    
}
