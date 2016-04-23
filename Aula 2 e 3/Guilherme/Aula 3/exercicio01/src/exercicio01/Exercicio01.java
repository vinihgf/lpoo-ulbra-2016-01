/*
    Crie uma pessoa (objeto), coloque seu nome e idade inicial, 
    faça alguns aniversários (aumentando a idade) e imprima 
    seu nome e sua idade.
        Classe: Pessoa.
        Atributos: nome, idade.
        Método: void fazAniversario(), String retornaNomeIdade()
 */
package exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Guilherme";
        pessoa1.idade = 1;
        
        pessoa1.fazAniversario();

        System.out.println(pessoa1.retornaNomeIdade());
    }
}
