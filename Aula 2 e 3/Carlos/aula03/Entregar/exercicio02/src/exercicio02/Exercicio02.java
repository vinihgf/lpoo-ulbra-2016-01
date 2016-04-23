package exercicio02;

/**
 *
 * @author roberto
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Lampada lampada = new Lampada();
      lampada.ligada();
      System.out.print(lampada.observa() + "\n");
      
       lampada.desligada();
       System.out.print(lampada.observa()+ "\n");
      
      
      
    
    }
    
}
