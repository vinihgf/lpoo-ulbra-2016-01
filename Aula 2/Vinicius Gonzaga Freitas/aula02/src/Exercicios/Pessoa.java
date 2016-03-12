package Exercicios;
public class Pessoa {
    public String nome;
    public int idade;
    
    public void setPessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazAniversario()
    {
        this.idade = idade + 1;
    }
    public String retornaNomeIdade()
    {
        String retorno = "Nome: " + nome + " \n Idade: " + idade + " anos";
        return retorno;
    }
}
