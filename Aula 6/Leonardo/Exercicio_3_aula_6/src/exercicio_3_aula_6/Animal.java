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
public class Animal {
    public String nome;
    public int comprimento;
    public int patas;
    public String cor;
    public String ambiente;
    public double velocidade;
    public String imprime;

    public void alterarNome(String nome){
        this.nome = nome;
    }
    public void alterarComprimento(int comprimento){
        this.comprimento = comprimento;
    }
    public void alterarPatas(int patas){
        this.patas = patas;
    }
    public void alterarCor(String cor){
        this.cor = cor;
    }
    public void alterarAmbiente(String ambiente){
        this.ambiente = ambiente;
    }
    public void alterarVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public void imprimir(){
        this.imprime = "Nome: " + this.nome + "\n";
        this.imprime += "Comprimento: " + this.comprimento + "\n";
        this.imprime += "Patas: " + this.patas + "\n";
        this.imprime += "Cor: " + this.cor + "\n";
        this.imprime += "Ambiente: " + this.ambiente + "\n";
        this.imprime += "Velocidade: " + this.velocidade + "m/s \n";
        System.out.println(this.imprime);
    }
}
