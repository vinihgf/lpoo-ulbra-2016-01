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
public class Exercício4_Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Funcionarios funcionario = new Funcionarios();
  
        Vendedores vendedor = new Vendedores("Elton Giovane Elesbão", "1111111111", 750.00, 10);
        vendedor.acumularVendas();
        vendedor.calcularComissao();
        vendedor.imprimir();
        
        Administradores administrador = new Administradores("Pedro Ernésto", "0000000000", 1200.00, 40);
        administrador.acumularHorasExtras();
        administrador.calcularComissao();
        administrador.imprimir();
    }
    
}
