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
class Administradores extends Funcionarios{
    
    public double salarioFixo;
    public int horasExtras, acumularHorasExtras;
    
    public Administradores(String nome, String rg, double salarioFixo, int horasExtras){
        
        this.nome = nome;
        this.rg = rg;
        this.salarioFixo = salarioFixo;
        this.horasExtras = horasExtras;
        
    }
    
    public void calcularComissao(){
        
        this.comissao = ( salarioFixo / 100) * this.horasExtras;
        
    }
    
    public void acumularHorasExtras(){
        
        this.acumularHorasExtras = this.acumularHorasExtras + this.horasExtras;
        
    }
    
    public void imprimir(){
        
        this.retorno = "Nome: " + this.nome + "\n";
        this.retorno += "RG: " + this.rg + "\n";
        this.retorno += "Salario: " + this.salarioFixo + "\n";
        this.retorno += "Total de horas extras: " + this.acumularHorasExtras + "\n";
        this.retorno += "Valor por hora: " + this.comissao + "\n";
        this.retorno += "Salario Final: " + (this.salarioFixo + this.comissao) + "\n";
        System.out.println(this.retorno);
        this.acumularHorasExtras = 0;
        
    }
}
