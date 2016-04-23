/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio7;

/**
 *
 * @author Elton
 */
class Moto {
    
    String marca, modelo, cor;
    int marcha, passagem = 0;
    
    public Moto(String marca, String modelo, String cor, int marcha){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        
    }
    
    public void marchaAcima(int passagem){
        
        this.passagem = this.marcha + passagem;
        
        if (this.passagem < 5){
           
            this.marcha = this.passagem;
            imprimir();
         
        } else if (this.passagem == 5){
            
            this.marcha = this.passagem;
            imprimir();
            
            System.out.println("         Marcha máxima!       ");
            System.out.println(" ---------------------------- ");  
        
        } else {
            
            System.out.println(" ---------------------------- ");
            System.out.println("         Marcha Inválida!     ");
            System.out.println(" ---------------------------- ");
            
        }
        
    }
    
    public void marchaAbaixo(int passagem){
        
        this.passagem = this.marcha - passagem;
        
        if (this.passagem > 0){
            
            this.marcha = this.passagem;
            imprimir();
            
        } else if (this.passagem == 0){
            
            this.marcha = this.passagem;
            imprimir();
            
            System.out.println("         Ponto Neutro!        ");
            System.out.println(" ---------------------------- ");  
        
        } else {
            
            System.out.println(" ---------------------------- ");
            System.out.println("         Marcha Inválida!     ");
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
