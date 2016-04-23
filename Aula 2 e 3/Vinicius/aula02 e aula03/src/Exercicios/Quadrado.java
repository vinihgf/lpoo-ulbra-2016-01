package Exercicios;

import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CL_Quadrado objQuadrado = new CL_Quadrado();
        
        System.out.println("Digite o tamando do lado do quadrado");
        objQuadrado.lado = input.nextInt();
        
        boolean sai = false;
        while(!sai)
        {
            System.out.println("Digite a opçao");
            System.out.println("1 - Calcular Area\n2 - Calcular Perimetro\n 3 - Alterar Valor do Lado\n 4 - Sair");
            int opcao = input.nextInt();
            
            if(opcao == 1)
            {
                System.out.println(objQuadrado.area(objQuadrado.lado));
            }
            else if(opcao == 2)
            {
                System.out.println(objQuadrado.perimeto(objQuadrado.lado));
            }
            else if(opcao == 3)
            {
                System.out.println("Digite o tamando do lado do quadrado");
                objQuadrado.lado = input.nextInt();
            }
            else if(opcao == 4)
            {
                sai = true;
            }
            else
            {
                System.out.println("Opção Inválida. Tente Novamente");
            }
        }
    }
}
