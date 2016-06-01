/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo4;

/**
 *
 * @author Diego
 */
public class Dentista implements IProfessor {

    @Override
    public void darAula() {
        System.out.println("Dentista - darAula");
    }

    @Override
    public void lancarNotas() {
        System.out.println("Dentista - lancarNotas");
    }

    @Override
    public String dadosPessoais() {
        return "Dentista - dadosPessoais";
    }

    @Override
    public Boolean temAutorizacao() {
        return true;
    }
    
}
