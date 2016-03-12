package exercicios_aula2_1;

public class Pessoa
{
    String nome;
    int idade;
    
    public void setPessoa (String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public  void fazAniversario()
    {
        this.idade = idade+1;
    }
    
    public String retornaNomeIdade()
    {
        String retorno = "Nome: " + nome + " Idade:" + idade;
        return retorno;
    }
}
