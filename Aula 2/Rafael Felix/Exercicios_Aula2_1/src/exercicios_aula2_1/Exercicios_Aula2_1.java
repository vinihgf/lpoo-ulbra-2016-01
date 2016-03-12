package exercicios_aula2_1;

import java.util.Scanner;

public class Exercicios_Aula2_1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Pessoa objPessoa = new Pessoa();
        int escolha = 0;
        
        while(escolha != 4)
        {
            System.out.println("1-Informar nome;\n2-Informar idade atual;\n3-Fazer aniversário;\n4-Sair.");
            escolha = input.nextInt();
            
            if(escolha == 1)
            {
                System.out.println("Informe o nome: ");
                objPessoa.nome = input.next();
            }
            else if(escolha == 2)
            {
                System.out.println("Informe a idade atual: ");
                objPessoa.idade = input.nextInt();
            }
            else if(escolha == 3)
            {
                objPessoa.fazAniversario();
                System.out.println(objPessoa.retornaNomeIdade());
            }
        }
    }
}