package aula4;

public class CL_Pessoa
{
    String nome;
    String endereco;
    String telefone;
    
    public void imprimir()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
    }
    
    public CL_Pessoa()
    {
        this.nome = "Rafael Felix";
        this.endereco = "João Antônio de Barcelos, 433";
        this.telefone = "(51)9778-3139";
    }
}