
package exercicio.pkg1;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "giulia";
        pessoa1.idade= 20;
        
        
        pessoa1.fazAniversario();
        System.out.println(pessoa1.retornaNomeIdade());
        
        
    }
    
}
