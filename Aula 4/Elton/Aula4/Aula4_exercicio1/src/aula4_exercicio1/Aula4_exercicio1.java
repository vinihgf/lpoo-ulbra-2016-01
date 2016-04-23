/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio1;

/**
 *
 * @author Elton
 */
public class Aula4_exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "João Pedro";
        pessoa.endereco = "Avenida Brasil";
        pessoa.telefone = "80746541";
        
        pessoa.mostra();
    }
    
}
