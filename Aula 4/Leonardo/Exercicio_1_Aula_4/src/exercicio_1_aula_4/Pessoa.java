package exercicio_1_aula_4;

/**
 *
 * @author leogi
 */
public class Pessoa {
    public String nome;
    public String endereco;
    public int telefone;
    
    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
    
    public void imprimir(){
        
        String retorno = "Nome: " + nome;
        retorno += "\n Endereco: " + endereco;
        retorno += "\n Telefone: " + telefone;
        System.out.println(retorno);
        
    }
}
