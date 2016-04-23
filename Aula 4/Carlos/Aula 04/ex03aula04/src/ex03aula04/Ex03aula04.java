/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03aula04;

/**
 *
 * @author roberto
 */
public class Ex03aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Retangulo retangulo = new Retangulo(5.55, 6.66); 
        // retangulo.area ="";
        
      retangulo.calcularArea();
      retangulo.calcularPerimetro();
      retangulo.calcularTudo();
      
      retangulo.imprimir();
         //System.out.print(string);
        //pessoa.imprimir();
        //System.out.println(retangulo.calcularArea() + "\n");
          // System.out.print(retangulo.calcularPerimetro() + "\n");
    }
    
}
