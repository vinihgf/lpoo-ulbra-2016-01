/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02aula04;

/**
 *
 * @author roberto
 */
class Pessoa {
   public String nome;
   public String endereco;
   public String telefone;
   
   public Pessoa (String nome,String endereco,String telefone)
   {
       this.nome = nome;
       this.endereco = endereco;
       this.telefone = telefone;
       
       imprimir();
   }
  
   public void imprimir(){
         String retorno ="----";
         retorno +="Pessoa " + this.nome + "\nEndereco " + this.endereco +"\nTelefone "+ this.telefone +"\n";
         retorno +="---";
        System.out.println(retorno);
         
         
    }
}



