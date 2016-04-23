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
class Animal {
    public String nome, cor, ambiente, retorno;
    public int patas;
    public double velocidade, comprimento;
    
    public void alteraNome(String nome){
        
        this.nome = nome;
        
    }
    
    public void alteraComprimento(int comprimento){
        
        this.comprimento = comprimento;
        
    }
    
    public void alteraPatas(int patas){
        
        this.patas = patas;
        
    }
    
    public void alteraCor(String cor){
        
        this.cor = cor;
        
    }
    
    public void alteraAmbiente(String ambiente){
        
        this.ambiente = ambiente;
        
    }
    
    public void alteraVelocidade(double velocidade){
        
        this.velocidade = velocidade;
        
    }
    
    public void dados( ){
        
        this.retorno = "Nome: " + this.nome + "\n";
        this.retorno += "Comprimento: " + this.comprimento + "\n";
        this.retorno += "Patas: " + this.patas + "\n";
        this.retorno += "Cor: " + this.cor + "\n";
        this.retorno += "Ambiente: " + this.ambiente + "\n";
        this.retorno += "Velocidade: " + this.velocidade + "m/s \n";
        System.out.println(this.retorno);
        
    }
    
}
