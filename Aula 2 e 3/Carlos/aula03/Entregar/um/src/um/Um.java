/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package um;

/**
 *
 * @author roberto
 */
public class Um {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome ="Roberto";
        pessoa1.idade = 10;
        pessoa1.fazAniversario();
        
        System.out.print(pessoa1.RetornaNomeIdade());
 
    }

    
}
