/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

/**
 *
 * @author roberto
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      	Porta p1 = new Porta();

	p1.dimensaoX = 9;
	p1.dimensaoY = 19;
	p1.dimensaoZ = 24;

	p1.pinta();
	p1.abre();
	p1.fecha();

	System.out.println("Sua cor é " + p1.cor + ", suas dimensões XYZ são : " + p1.dimensaoX + ","+ p1.dimensaoY +  ","+ p1.dimensaoZ );
}
    }
    

