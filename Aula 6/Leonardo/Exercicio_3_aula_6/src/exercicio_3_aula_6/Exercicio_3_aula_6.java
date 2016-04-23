package exercicio_3_aula_6;

/**
 *
 * @author leogi
 */
public class Exercicio_3_aula_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        Peixe peixe = new Peixe();
        
        animal.alterarNome("Camelo");
        animal.alterarComprimento(150);
        animal.alterarPatas(4);
        animal.alterarCor("Amarelo");
        animal.alterarAmbiente("Terra");
        animal.alterarVelocidade(2.0);
        
        animal.imprimir();
        
        System.out.println("\n________________________________\n");
        
        peixe.alterarNome("Tubarão");
        peixe.alterarComprimento(300);
        peixe.alterarPatas(0);
        peixe.alterarCor("Cinzento");
        peixe.alterarAmbiente("Mar");
        peixe.alterarVelocidade(1.5);
        peixe.alterarCaracteristicas("Barbatanas e cauda");
        
        peixe.imprimir();
        
        System.out.println("\n________________________________\n");
        
        mamifero.alterarNome("Urso");
        mamifero.alterarComprimento(180);
        mamifero.alterarPatas(4);
        mamifero.alterarCor("Vermelhoo");
        mamifero.alterarAmbiente("Terra");
        mamifero.alterarVelocidade(0.5);
        mamifero.alterarAlimento("Mel");
        
        mamifero.imprimir();
    }
    
}
