/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio2;

/**
 *
 * @author Elton
 */
class Pessoa {
    
    String nome;
    String endereco;
    String telefone;
    
    public Pessoa(String nome, String endereco, String telefone) {
        
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
    
    public void mostra(){
        
        String retorno = "-------------------------------";
        retorno += "\n Pessoa: " + this.nome + "\n Endereço: " + this.endereco + "\n Telefone: " + this.telefone + "\n";
        retorno += "-------------------------------";
        System.out.println(retorno);
        
    }
}
