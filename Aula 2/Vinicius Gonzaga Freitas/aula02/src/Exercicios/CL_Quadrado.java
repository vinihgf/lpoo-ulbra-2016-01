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
public class CL_Quadrado {
    double lado;
    
    public void getLado(double lado)
    {
        this.lado = lado;
    }
    public String area(double lado)
    {
        double area = lado * lado;
        String retorno = "A area do quadrado é: " + area;
        return retorno;
    }
    public String perimeto(double lado)
    {
        double perimetro = lado * 4;
        String retorno = "O perimetro do quadrado é: " + perimetro;
        return retorno;
    }
}
