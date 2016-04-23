/*
    Escreva uma classe Quadrado com atributo lado do tipo double. 
    A classe deve ter os métodos area() e perimetro() que retornam 
    respectivamente a área e o perímetro do quadrado, cuja as formulas 
    são as seguintes.
    Área = lado ²
    Perímetro = 4 x lado
 */
package exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 7;
        
        System.out.println("Área: " + quadrado.area());
        System.out.println("Perímetro: " + quadrado.perimetro());
    }
    
}
