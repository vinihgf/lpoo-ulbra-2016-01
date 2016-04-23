package trabalho_g1;

import java.util.Scanner;

/**
 *
 * @author LEONARDO GIULIANE / ELTON GIOVANE / GUILHERME PURPER
 */
public class Usuario_Banco extends Caixa{
    
    Scanner input = new Scanner(System.in);
    public int soma = 0;
    
    public int reposicaoNotasCinquenta(int valor){
        this.cinquenta = valor;
        this.cinquenta += input.nextInt();
         
        return this.cinquenta;
    }
     
    public int reposicaoNotasVinte(int valor){
        this.vinte = valor;
        this.vinte += input.nextInt();
        
        return this.vinte;
    }
    
    public int reposicaoNotasDez(int valor){
        this.dez = valor;
        this.dez += input.nextInt();
     
        return this.dez;
    }
     
    public int reposicaoNotasCinco(int valor){
        this.cinco = valor;
        this.cinco += input.nextInt();
        
        return this.cinco;
    }
    
    public int reposicaoNotasDois(int valor){
        this.dois = valor;
        this.dois += input.nextInt();
        
        return this.dois;
    }
    
    public void visualizar(int cinquenta, int vinte, int dez, int cinco, int dois){
        String imprimir;
        
        this.soma =  ((cinquenta*50)+(vinte*20)+(dez*10)+(cinco*5)+(dois*2));
        
        imprimir = " --------------------------------------------------   ";
        imprimir += "\n            Notas de 50: " + cinquenta + "         ";
        imprimir += "\n            Notas de 20: " + vinte + "             ";
        imprimir += "\n            Notas de 10: " + dez + "               ";
        imprimir += "\n            Notas de 5: " + cinco + "              ";
        imprimir += "\n            Notas de 2: " + dois + "             \n";
        imprimir += "-------------------------------------------------  \n";
        imprimir += " Total disponível em caixa: R$ " + this.soma + "        \n";
        imprimir += "-------------------------------------------------    ";
        
        System.out.println(imprimir);
    }
    
}

