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
public class Aula4_exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Moto moto = new Moto();
        
        moto.marca = "Suzuki";
        moto.modelo = "ZY084";
        moto.cor = "Azul";
        moto.marcha = 4;
        
        moto.imprimir();
    }
    
}
