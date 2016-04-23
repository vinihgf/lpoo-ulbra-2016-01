
package Exercicio9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma letra: ");
        String let = input.nextLine();
        
        Letra letra = new Letra();
        letra.ehVogal(let);
        letra.ehConsoante(let);
    }
}
