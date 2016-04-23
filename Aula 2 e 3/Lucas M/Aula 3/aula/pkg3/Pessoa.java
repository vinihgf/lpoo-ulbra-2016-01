/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3;

/**
 *
 * @author Machado23
 */
public class Pessoa {
    public String nome;
    public int idade;

    public void fazAniversario(){
        idade++;
    }   
    public String retornaNomeIdade(){
        String retorno = "Nome"+this.nome + "\nIdade"+ this.idade;
        return retorno;
    }
    
}
