
package ex09aula04;

import javax.swing.JOptionPane;

/**
 *
 * @author roberto
 */
public class Ex09aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String letra = JOptionPane.showInputDialog(null,"Digite uma letra:");
        
        if (letra.equalsIgnoreCase("A") ||letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") ||
                letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
        
        JOptionPane.showMessageDialog(null,letra + " é vogal");
        
    }
        else {
                JOptionPane.showMessageDialog(null,letra + " é consoante");
                }
    }
    
}
