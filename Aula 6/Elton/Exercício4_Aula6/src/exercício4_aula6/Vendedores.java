/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício4_aula6;

/**
 *
 * @author Elton
 */
class Vendedores extends Funcionarios{
    
    public double salarioBase;
    public int vendas, acumularVendas;
    
    public Vendedores(String nome, String rg, double salarioBase, int vendas){
        
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        
    }
    
    public void acumularVendas(){
        
        this.acumularVendas = this.acumularVendas + this.vendas;
        
    }
    
    public void calcularComissao(){
        
        this.comissao = (( salarioBase / 100 ) * 5) * this.vendas;
        
    }
    
    public void imprimir(){
        
        this.retorno = "Nome: " + this.nome + "\n";
        this.retorno += "RG: " + this.rg + "\n";
        this.retorno += "Salario: " + this.salarioBase + "\n";
        this.retorno += "Total de vendas: " + this.acumularVendas + "\n";
        this.retorno += "Comissão: " + this.comissao + "\n";
        this.retorno += "Salario Final: " + (this.salarioBase + this.comissao) + "\n";
        System.out.println(this.retorno);
        this.acumularVendas = 0;
        
    }
    
}
