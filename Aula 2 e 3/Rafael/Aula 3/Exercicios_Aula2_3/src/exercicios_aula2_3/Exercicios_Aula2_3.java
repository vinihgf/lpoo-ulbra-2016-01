package exercicios_aula2_3;

import java.util.Scanner;

public class Exercicios_Aula2_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CL_Quadrado objQuadrado = new CL_Quadrado();
        int escolha = 0;
        
        while(escolha != 4)
        {
            System.out.println("1-Informar o lado do quadrado;\n2-Calcular a area do quadrado;;\n3-Calcular o primetro do quadrado;\n4-Sair.");
            escolha = input.nextInt();
            
            if(escolha == 1)
            {
                objQuadrado.lado = input.nextDouble();
            }
            else if(escolha == 2)
            {
                objQuadrado.area();
                System.out.println(objQuadrado.area());
            }
            else if(escolha == 3)
            {
                objQuadrado.perimetro();
                System.out.println(objQuadrado.perimetro());
            }
        }
    }
}