/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_exercício1;

/**
 *
 * @author Elton
 */
class Pessoa {
    public String nome, retorno;
    public int idade;
    
    public void fazAniversario(int numeroAniversario){
        for (int x = 0; x < numeroAniversario; x++) {
             idade = idade + 1;
        }
    }
    
    public String retornaNomeIdade(){
        retorno += "Nome:" + this.nome + "Idade:" + this.idade + "\n";
        return retorno;
    }
}
