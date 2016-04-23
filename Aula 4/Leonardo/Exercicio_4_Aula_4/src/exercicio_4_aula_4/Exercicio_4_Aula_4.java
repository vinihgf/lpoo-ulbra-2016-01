package exercicio_4_aula_4;

/**
 *
 * @author leogi
 */
public class Exercicio_4_Aula_4 {
    
    public static void main(String[] args) {

        Moto m = new Moto("Yamaha", "CG150", "Azul", 0 , 5);
        m.marchaAcima(8);
        m.marchaAbaixo(1);
        
        m.imprimir();    
    }
    
}
