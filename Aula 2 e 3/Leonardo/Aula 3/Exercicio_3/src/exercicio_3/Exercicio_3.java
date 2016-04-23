package exercicio_3;

/**
 *
 * @author leogi
 */
public class Exercicio_3 {

    public static void main(String[] args) {
        Quadrado calc = new Quadrado();
        calc.lado = 20;
        
        calc.area();
        calc.perimetro();

        System.out.println(calc.imprime());

    }
    
}
