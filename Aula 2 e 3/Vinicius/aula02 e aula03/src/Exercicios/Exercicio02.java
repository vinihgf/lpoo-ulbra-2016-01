package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa objPessoa = new Pessoa();
        
        System.out.println("Digite o nome da pessoa:");
        objPessoa.nome = input.next();
        
        System.out.println("Digite a idade da pessoa:");
        objPessoa.idade = input.nextInt();
        
        boolean sai = false;
        
        while (sai == false)
        {
            System.out.println("Digite 1 para fazer aniversario:");
            System.out.println("Digite 2 para imprimir idade:");
            System.out.println("Digite 3 para sair:");
            int opcao = input.nextInt();
            
            if(opcao == 1)
            {
                objPessoa.fazAniversario();
            }
            else if (opcao == 2)
            {
                System.out.println("Nome: " + objPessoa.nome);
                System.out.println("idade: " + objPessoa.idade);
            }
            else if (opcao == 3)
            {
                sai = true;
            }
        }
        
    }
    
}
