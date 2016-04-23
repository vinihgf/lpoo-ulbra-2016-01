/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

/**
 *
 * @author leogi
 */
public class Quadrado {
    public double lado;
    public double area;
    public double perimetro;
    
    public double area(){
        return area = lado * lado;
    }
    
    public double perimetro(){
        return perimetro = lado * 4;
    }
    public String imprime(){
        String retorno = "Área: "+ area + "\n";
        retorno += "Perímetro: " + perimetro + "\n";
    
        return retorno;
    }
}
