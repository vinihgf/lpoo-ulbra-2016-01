/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercício3;

/**
 *
 * @author Elton
 */
class Quadrado {
    public double lado;
    
    public double area(){
        return lado * lado;
    }
    
    public double perimetro(){
        return 4 * lado;
    }
}
