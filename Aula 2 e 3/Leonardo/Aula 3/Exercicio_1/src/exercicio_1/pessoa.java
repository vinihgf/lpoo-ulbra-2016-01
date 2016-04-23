package exercicio_1;

/**
 *
 * @author leogi
 */
public class pessoa {
    public String nome;
    public int idade;
    
    public int fazAniversario(){
        int x, niver = 20;
         for (x = 0; x < niver; x++){
             idade++;
         }

        return idade;
    }
    
    public String nomeIdade(){
        String retorno = nome + "\n";
        retorno += "Idada: " + idade + "\n";
    
        return retorno;
    }
}
