
package aula.pkg3;

public class Aula3 {


    public static void main(String[] args) 
    {
        Pessoa obj = new Pessoa();
        obj.nome = "Lucas";
        obj.idade = 26;
          obj.fazAniversario();
        System.out.println(obj.retornaNomeIdade());
      
    }
}