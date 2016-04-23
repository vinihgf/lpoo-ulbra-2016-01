/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio6;

/**
 *
 * @author Elton
 */
class Moto {
    
    String marca, modelo, cor;
    int marcha;
    
    public Moto(String marca, String modelo, String cor, int marcha){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        
    }
    
    public void marchaAcima(){
        
        if (this.marcha < 5){
           
            this.marcha = this.marcha + 1;
            imprimir();
         
        } else if (this.marcha == 5){
            
            imprimir();
            
            System.out.println("         Marcha máxima!       ");
            System.out.println(" ---------------------------- ");  
        
        }
    }
    
    public void marchaAbaixo(){
        
        if (this.marcha > 0){
            
            this.marcha = this.marcha - 1;
            imprimir();
            
        } else if (this.marcha == 0){
            
            imprimir();
            
            System.out.println("         Ponto Neutro!        ");
            System.out.println(" ---------------------------- ");  
        
        }
        
    }
    
    public void imprimir(){
        
        String retorno = "-------------------------------";
        retorno += "\n Marca: " + this.marca + "\n Modelo: " + this.modelo + "\n Cor: " + this.cor + "\n Marcha: " + this.marcha + "\n";
        retorno += "-------------------------------";
        System.out.println(retorno);
        
    }
}
