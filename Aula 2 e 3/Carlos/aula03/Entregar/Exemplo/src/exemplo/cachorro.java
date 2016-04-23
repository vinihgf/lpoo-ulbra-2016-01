
package exemplo;

/**
 *
 * @author roberto
 */
public class cachorro {
    public String nome;
    public String raca;
    public Boolean brabo;
    public int idade;
    public dono donoDoAnimal;
    
    public String cachorro(){
        String retorno = nome + " " + raca + "\n";
        retorno +="Idade Real" + " " + idade + "\n";
        retorno +="Idade Aparente:" + this.getIdadeAparente() + "\n";
        retorno +="Dono:" + this.donoDoAnimal.getNome()+ "\n";
        retorno +="Rua:" + this.donoDoAnimal.endereco.rua + "\n";
        retorno +="Bairro:" + this.donoDoAnimal.endereco.bairro + "\n";
        retorno +="Numero:" + this.donoDoAnimal.endereco.numero + "\n";
        retorno +="Estado:" + this.donoDoAnimal.endereco.estado + "\n";   
        
        return retorno;
    }
    
    public int getIdadeAparente()
    
    {
        return idade * 7;
    }
}

