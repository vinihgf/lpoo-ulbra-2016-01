/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg1_lpoo;

/**
 *
 * @author Lucas
 */
public class Cliente extends Caixa{
    
    public int quant50 = 0, quant20 = 0, quant10 = 0, quant5 = 0, quant2 = 0;
    
    public Cliente(int notas50, int notas20, int notas10, int notas5, int notas2){
        this.notas50 = notas50;
        this.notas20 = notas20;
        this.notas10 = notas10;
        this.notas5 = notas5;
        this.notas2 = notas2;
    }
    
    public void imprimirSaque(){        
       if (this.quant50 > 0){
           System.out.println("R$ 50,00 - " + this.quant50 + " cédulas");
       }
       
       if (this.quant20 > 0){
           System.out.println("R$ 20,00 - " + this.quant20 + " cédulas");
       }
       
       if (this.quant10 > 0){
           System.out.println("R$ 10,00 - " + this.quant10 + " cédulas");
       }
       
       if (this.quant5 > 0){
           System.out.println("R$ 5,00 - " + this.quant5 + " cédulas");
       } 
       
       if (this.quant2 > 0){
           System.out.println("R$ 2,00 - " + this.quant2 + " cédulas");
       }
    }
    
    public void imprimirCedulasDisponiveis(){        
        String imprimir;
        imprimir = "Cédulas disponíveis para saque: \n";
        
        if (this.notas50 > 0){
            imprimir += "R$ 50,00,";
        }
        
        if (this.notas20 > 0){
            imprimir += " R$ 20,00,";
        }
        
        if (this.notas10 > 0){
            imprimir += " R$ 10,00,";
        }
        
        if (this.notas5 > 0){
            imprimir += " R$ 5,00,";
        }
        
        if (this.notas2 > 0){
            imprimir += " R$ 2,00";
        }
         
        if ((this.notas50 == 0)&&(this.notas20 == 0)&&(this.notas10 == 0)&&(this.notas5 == 0)&&(this.notas2 == 0)){
            imprimir += "O caixa está vazio! :( ";
        }
        
        System.out.println(imprimir);
    }
    
    public int realizarSaque(int valorSaque, int cedula) {        
        if (cedula == 50){      
            valorSaque -= 50;            
        } 
        
        else if (cedula == 20){            
            valorSaque -= 20;            
        } 
        
        else if (cedula == 10){                
            valorSaque -= 10;            
        }
        
        else if (cedula == 5){        
            valorSaque -= 5;            
        }
        
        else if (cedula == 2){                
            valorSaque -= 2;            
        }
        
        return valorSaque;
    }
    
    public int retirarCedulas(int quantidade, int cedula) {        
        if (cedula == 50){
            quantidade--;
            this.quant50++;            
        }
        
        else if (cedula == 20){            
            quantidade--;
            this.quant20++;            
        }
        
        else if (cedula == 10){            
            quantidade--;
            this.quant10++;
        } 
        
        else if (cedula == 5){            
            quantidade--;
            this.quant5++;
        }
        
        else if (cedula == 2){            
            quantidade--;
            this.quant2++;
        }
        
        return quantidade;        
    }
    
    public int devolverCedulas(int quantidade, int cedula){
        
        if (cedula == 50){
            quantidade = quantidade + this.quant50;
            this.quant50 = 0;
        }
        
        if (cedula == 20){
           quantidade = quantidade + this.quant20;
           this.quant20 = 0;
        }
        
        if (cedula == 10){
            quantidade = 10 * this.quant10;
            this.quant10 = 0;
        }
        
        if (cedula == 5) {
            quantidade = quantidade + this.quant5;
            this.quant5 = 0;
        }
        
        if (cedula == 2) {
            quantidade = quantidade + this.quant2;
            this.quant2 = 0;
        }        
        return quantidade;
    }

}