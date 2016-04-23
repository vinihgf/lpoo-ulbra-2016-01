package exercicios_aula2_1;

public class Pessoa
{
    String nome;
    int idade;
    
    public  void fazAniversario()
    {
        this.idade++;
    }
    
    public String retornaNomeIdade()
    {
        String retorno = "Nome: " + nome + " Idade:" + idade;
        return retorno;
    }
}
