package ex01aula04;

/**
 *
 * @author roberto
 */
public class Pessoa {
   public String nome;
   public String endereco;
   public String telefone;
   
  
       public String imprimir(){
         String retorno ="----";
         retorno +="/n Pessoa" + this.nome + "\"/n endereco\""+ this.endereco +"\"/n telefone\""+ this.telefone +"\n";
         retorno +="---";
         return retorno;
       }    
       
}
