/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecachorro;

/**
 *
 * @author Aluno
 */
public class cachorro {
  
    public String nome;
    public String raca;
    public boolean estaBrabo;
    public int idade;
    public Dono donoDoAnimal;

 public String getdadosdoAnimal(){
     
     String retorno = nome + "   "+ raca;
     retorno += "\nIdade Real: " + idade;
     retorno += "\nIdade Aparente:"  + this.getIdadeAparente();
     retorno += "\nDono:" + this.donoDoAnimal.getNome();
     retorno += "\nEndereco do dono:\n";
     retorno += "\nRua: " + this.donoDoAnimal.enderecoDono.rua;
     retorno += "\nBairro: " + this.donoDoAnimal.enderecoDono.bairro;
     retorno += "\nCidade: " + this.donoDoAnimal.enderecoDono.cidade;
     retorno += "\nEstado: " + this.donoDoAnimal.enderecoDono.estado;
     retorno += "\nNumero: " + this.donoDoAnimal.enderecoDono.numero;
      
               
     return retorno;
 }
     
public int getIdadeAparente (){
    
    return idade * 7;
    
}


     
 }
      
  
        
