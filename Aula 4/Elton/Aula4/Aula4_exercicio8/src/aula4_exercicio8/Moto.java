/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio8;

/**
 *
 * @author Elton
 */
class Moto {
    
    String marca, modelo, cor;
    int marcha = 0, passagem = 0, marchaMaior, marchaMenor;
    
    public Moto(String marca, String modelo, String cor, int marchaMenor, int marchaMaior){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marchaMenor = marchaMenor;
        this.marchaMaior = marchaMaior;
        
    }
    
    public void marchaAcima(int passagem){
        
        this.passagem = this.marcha + passagem;
        
        if (this.passagem < this.marchaMaior){
           
            this.marcha = this.passagem;
            imprimir();
         
        } else if (this.passagem == this.marchaMaior){
            
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
        
        if (this.passagem > this.marchaMenor){
            
            this.marcha = this.passagem;
            imprimir();
            
        } else if (this.passagem == this.marchaMenor){
            
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
