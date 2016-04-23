/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3_aula_6;

/**
 *
 * @author leogi
 */
public class Peixe extends Animal{
    public String caracteristicas;
      
    public void alterarCaracteristicas(String caracteristicas){
        this.caracteristicas = caracteristicas;
    }
        
    public void imprimir(){
        this.imprime = "Nome: " + this.nome + "\n";
        this.imprime += "Comprimento: " + this.comprimento + "\n";
        this.imprime += "Patas: " + this.patas + "\n";
        this.imprime += "Cor: " + this.cor + "\n";
        this.imprime += "Ambiente: " + this.ambiente + "\n";
        this.imprime += "Velocidade: " + this.velocidade + "m/s \n";
        this.imprime += "Caracteristicas: " + this.caracteristicas + "\n";
        System.out.println(this.imprime);
    }
}
