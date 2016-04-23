package exercicio_1;

/**
 *
 * @author leogi
 */
public class Exercicio_1 {
    
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 20;
        
        pessoa1.fazAniversario();
                
        System.out.println(pessoa1.nomeIdade());


    }
    
    
}
