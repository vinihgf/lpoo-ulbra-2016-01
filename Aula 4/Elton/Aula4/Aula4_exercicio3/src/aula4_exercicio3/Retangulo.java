/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio3;

/**
 *
 * @author Elton
 */
class Retangulo {
    
    Double comprimento;
    Double largura;
    Double area;
    Double perimetro;
    
    public Retangulo(Double comprimento, Double largura){
        
        this.comprimento = comprimento;
        this.largura = largura;
        
    }
    
    public void calcularArea(){
        
        this.area = this.largura * this.comprimento;
        
    }
    
    public void calcularPerimetro(){
        
        this.perimetro = (2 * this.comprimento) + (2 * this.largura);
        
    }
    
    public void calcularTudo(){
        
        this.calcularArea();
        this.calcularPerimetro();
        
    }
    
    public void imprimir(){
        
        String retorno = "-------------------------------";
        retorno += "\n Comprimento: " + this.comprimento + "\n Largura: " + this.largura + "\n Area: " + this.area + "\n Perimetro: " + this.perimetro + "\n";
        retorno += "-------------------------------";
        System.out.println(retorno);
        
    }
    
}
