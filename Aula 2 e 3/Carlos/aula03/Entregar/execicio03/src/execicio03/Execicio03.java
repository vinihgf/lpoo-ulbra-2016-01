/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio03;

/**
 *
 * @author roberto
 */
public class Execicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        quadrado quadrado1 = new quadrado();
        quadrado1.lado = 5;
        quadrado1.area();
        quadrado1.perimetro();
       
        
        System.out.print(quadrado1.area() + "\n");
        System.out.print(quadrado1.perimetro()+ "\n");
    }
    
}
