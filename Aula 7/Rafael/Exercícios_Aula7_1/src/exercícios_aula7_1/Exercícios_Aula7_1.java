package exercícios_aula7_1;

import java.util.Scanner;

public class Exercícios_Aula7_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CL_Urna objUrna = new CL_Urna();
        int escolha = 0;
        
        while(escolha != 4)
        {
            System.out.println("1-Votar;\n2-Votar em Branco;\n3-Anular Voto;\n4-Apurar Eleição.");
            escolha = input.nextInt();
            
            if(escolha==1)
            {
                System.out.println("Qual candidato deseja votar?");
                objUrna.candidato = input.nextInt();
                objUrna.votar();
            }
            else if(escolha==2)
            {
                objUrna.votarbranco();
            }
            else if(escolha==3)
            {
                objUrna.votarnulo();
            }
            else if(escolha==4)
            {
                objUrna.apurareleicao();
                objUrna.caculcarpaciais();
                objUrna.imprimirresultados();
            }
        }
    }
}