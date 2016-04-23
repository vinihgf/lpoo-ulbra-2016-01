/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_aula6;

/**
 *
 * @author Elton
 */
public class Exercicio3_Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Peixe peixe = new Peixe();
        Mamifero mamifero = new Mamifero();
        
        System.out.println("         ZOO       \n");
        
        animal.alteraNome("Camelo");
        animal.alteraComprimento(150);
        animal.alteraPatas(4);
        animal.alteraCor("Amarelo");
        animal.alteraAmbiente("Terra");
        animal.alteraVelocidade(2.0);
        
        animal.dados();
        
        peixe.alteraNome("Tubarão");
        peixe.alteraComprimento(300);
        peixe.alteraPatas(0);
        peixe.alteraCor("Cinzento");
        peixe.alteraAmbiente("Mar");
        peixe.alteraVelocidade(1.5);
        peixe.alterarCaracteristicas("Barbatanas e cauda");
        
        peixe.dados();
        
        mamifero.alteraNome("Urso");
        mamifero.alteraComprimento(180);
        mamifero.alteraPatas(4);
        mamifero.alteraCor("Vermelhoo");
        mamifero.alteraAmbiente("Terra");
        mamifero.alteraVelocidade(0.5);
        mamifero.alteraAlimento("Mel");
        
        mamifero.dados();
    }
    
}
