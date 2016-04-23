package aula07;

import java.util.Scanner;

public class Aula07 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        CL_Urna objUrna = new CL_Urna();
        int opcao = 0;
        boolean sai = false;
        while(!sai)
        {
            System.out.println("SELECIONE A OPÇÃO");
            System.out.println("\n 1 - VOTAR");
            System.out.println("\n 2 - VOTAR NULO");
            System.out.println("\n 3 - VOTAR BRANCO");
            System.out.println("\n 4 - APURAR ELEIÇÃO");
            opcao = input.nextInt();
            if(opcao == 1)
            {
                System.out.println("QUAL CANDIDATO DESEJA VOTAR");
                if(input.nextInt() > 5)
                {
                    System.out.println("CANDIDATO INVALIDO");
                }
                else
                {
                    objUrna.candidato = input.nextInt();
                    objUrna.votar();
                }
            }
            else if(opcao == 2)
            {
                objUrna.votarNulo();
            }
            else if(opcao == 3)
            {
                objUrna.votarBranco();
            }
            else if(opcao == 4)
            {
                objUrna.apurarEleicao();
                objUrna.calcularPorc();
                objUrna.imprimirResult();
                sai = true;
            }
        }
    }
}
