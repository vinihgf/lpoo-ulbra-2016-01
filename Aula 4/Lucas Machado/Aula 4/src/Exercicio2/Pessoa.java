
package Exercicio2;


public class Pessoa {
      
    public String nome;
    public String endereco;
    public int telefone;
   
     public Pessoa(String nome, String endereco, int telefone)
     {
         this.nome = nome;
         this.endereco = endereco;
         this.telefone = telefone;
     }
    
    public void imprimir()
    {
        System.out.println("Nome: " + this.nome + " Endereco: " + this.endereco + " Telefone: " + this.telefone);
    }
}
