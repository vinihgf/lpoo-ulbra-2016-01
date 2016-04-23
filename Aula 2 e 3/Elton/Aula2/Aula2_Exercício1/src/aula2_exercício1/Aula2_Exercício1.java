/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercício1;

import java.util.Scanner;

/**
 *
 * @author Elton
 */
public class Aula2_Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int numeroAniversario = 10;
        
        System.out.printf("Informe o seu nome:");
        pessoa.nome = ler.next();
        
        System.out.printf("Informe a sua idade:");
        pessoa.idade = ler.nextInt();
        
        pessoa.fazAniversario(numeroAniversario);
        System.out.println(pessoa.retornaNomeIdade());
    }
    
}
