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
class Mamifero extends Animal{
    
    public String alimento;

    public void alteraAlimento(String alimento){
        
        this.alimento = alimento;
        
    }
    
    public void dados(){
        
        this.retorno = "Nome: " + this.nome + "\n";
        this.retorno += "Comprimento: " + this.comprimento + "\n";
        this.retorno += "Patas: " + this.patas + "\n";
        this.retorno += "Cor: " + this.cor + "\n";
        this.retorno += "Ambiente: " + this.ambiente + "\n";
        this.retorno += "Velocidade: " + this.velocidade + "m/s \n";
        this.retorno += "Alimento: " + this.alimento + "\n";
        System.out.println(this.retorno);
        
    } 
}
