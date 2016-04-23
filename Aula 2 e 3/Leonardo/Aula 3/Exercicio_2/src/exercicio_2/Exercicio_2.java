
package exercicio_2;

/**
 *
 * @author leogi
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        String controle = "desligada";
        lampada ld = new lampada();
        
        if (controle == "ligada"){
            ld.liga();
        }
        else if (controle == "desligada"){
            ld.desliga();
        }
                
        System.out.println(ld.observa());
    }
    
}
