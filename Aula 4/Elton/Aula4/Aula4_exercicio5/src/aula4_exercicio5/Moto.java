/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio5;

/**
 *
 * @author Elton
 */
class Moto {
    
    String marca, modelo, cor;
    int marcha = 0;
    
    public Moto(String marca, String modelo, String cor){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        
    }
    
    public void imprimir(){
        
        String retorno = "-------------------------------";
        retorno += "\n Marca: " + this.marca + "\n Modelo: " + this.modelo + "\n Cor: " + this.cor + "\n Marcha: " + this.marcha + "\n";
        retorno += "-------------------------------";
        System.out.println(retorno);
        
    }
    
}
