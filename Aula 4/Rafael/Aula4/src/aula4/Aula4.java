package aula4;

import java.util.Scanner;

public class Aula4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*CL_Pessoa objPessoa = new CL_Pessoa();
        
        /*objPessoa.nome = "Rafael Felix";
        objPessoa.endereco = "João Antônio de Barcelos, 433";
        objPessoa.telefone = "(51)9778-3139";
        
        objPessoa.imprimir();
        
        //Exercicio 3
        CL_Retangulo objRetangulo = new CL_Retangulo();
        
        objRetangulo.calcularTudo();
        objRetangulo.imprimir();*/
      
        CL_Letra objLetra = new CL_Letra();
        int escolha = 0;
        String letra = "";

        while(escolha != 3)
        {
            System.out.println("Digite a letra: ");
            letra = input.next();
            
            System.out.println("1-É uma vogal?\n2-É uma consoante?\n3-Sair.");
            escolha = input.nextInt();
            
            if (escolha == 1)
            {
                if(objLetra.ehVogal(letra))
                {
                    System.out.println("A letra é uma vogal!");
                }
                else
                {
                    System.out.println("A letra não é uma vogal!");
                }
            }
            else if (escolha == 2)
            {
                if(objLetra.ehConsoante(letra))
                {
                    System.out.println("A letra é uma consoante!");
                }
                else
                {
                    System.out.println("A letra não é uma consoante!");
                }
            }
        }
        
        //Exercicio 4
        /*CL_Moto objMoto = new CL_Moto();
        int escolha = 0;
        
        while(escolha != 4)
        {
            System.out.println("1-Imprimir dados da moto;\n2-Aumentar marcha;\n3-Reduzir marcha;\n4-Sair.");
            escolha = input.nextInt();
            
            if(escolha == 1)
            {
                objMoto.imprimir();
            }
            
            else if(escolha == 2)
            {
                if(objMoto.marchaAcima() == -1)
                {
                    System.out.println("Não é possível aumentar a marcha!");
                }
                else
                {
                    
                }
            }
            else if(escolha == 3)
            {
                if(objMoto.marchaAbaixo() == -1)
                {
                    System.out.println("Não é possível reduzir a marcha!");
                }
                else
                {
                    
                }
            }
        }*/
    }
}