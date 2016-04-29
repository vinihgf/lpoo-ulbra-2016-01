/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhog1;

import java.util.Scanner;


public class Operacoes {
    Cedulas cedula = new Cedulas();
    Senha verifica = new Senha();
    private int op;
    Scanner input = new Scanner(System.in);
    
    public void operacoes()//Operações do Usuario do banco
    {
        if (verifica.verificaSenha() == true) //se senha correta
                {
                    do{
                    System.out.println("\n1- Reposição das Cédulas\n2- Quantidade de Cédulas Disponíveis\n3- Voltar");
                    op = input.nextInt();                
                
                        if (op == 1)//reposição das cedulas
                        {
                            cedula.reporCedulas();//executa a reposição das cédulas na Classe Cedulas
                        }
                        else //qtd disponíveis
                        {
                            cedula.imprimir();//executa o metodo de impressao presente na classe cédulas.
                        }
                    }while(op!=3);//voltar
                }
    }
    public void operacaoCliente()//Operações do Cliente
    {
                cedula.notasDisponiveis(); //mostra as notas disponíveis
                cedula.saque();//faz o saque
    }
    
}
