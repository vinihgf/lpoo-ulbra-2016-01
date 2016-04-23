
package exercicio.pkg1;

public class Pessoa {

    public String nome;
    public int idade;
    
    public void fazAniversario(){
    
        this.idade++;
     
    }
    
    public String retornaNomeIdade(){
    
        String retorno = "Nome : " + nome + " | Idade: " + idade;
        return retorno;
    }
   
    
    
    
    
}
