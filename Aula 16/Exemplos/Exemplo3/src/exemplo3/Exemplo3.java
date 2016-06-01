/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo3;

/**
 *
 * @author Diego
 */
public class Exemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Universidade ulbra = new Universidade();
        
        IFaxineira faxineira = new FaxineiraCiaDasDiaristas();        
        ulbra.setFaxineira(faxineira);        
        ulbra.diaDaLimpeza();
        
        IProfessor dentista = new Dentista();
        IProfessor advogado = new Advogado();
        ulbra.adicionarProfessor(advogado);
        ulbra.adicionarProfessor(dentista);

        ulbra.listarProfessores();
        
    }
    
}
