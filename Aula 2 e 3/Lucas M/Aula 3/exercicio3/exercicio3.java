
package exercicio3;

import java.util.Scanner;


public class exercicio3 {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado();
        System.out.println("Insera o valor do Lado.");
        Scanner lado1 = new Scanner(System.in);
        quadrado.lado = lado1.nextDouble();
        quadrado.area();
        quadrado.perimetro();
        System.out.println(quadrado.area());
        System.out.println(quadrado.perimetro());
    }
}
