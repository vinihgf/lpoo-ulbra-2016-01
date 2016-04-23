/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package um;

/**
 *
 * @author roberto
 */
class Pessoa {
    
    public String nome;
    public int idade;

    public String RetornaNomeIdade(){
        String retorno = "Nome" + nome + "idade" + idade;

            return retorno;
    }
    
    public void fazAniversario(){
         idade++;
    }
}