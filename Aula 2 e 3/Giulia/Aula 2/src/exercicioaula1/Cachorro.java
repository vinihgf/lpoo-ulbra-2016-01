package exercicioaula1;

/*  @author Giulia */
public class Cachorro {

    public Dono donoDoAnimal;
    public String nome;
    public String raça; 
    public boolean estaBrabo;
    public int idade; 
    
    
    public String getDadosdoAnimal(){
        String retorno = nome + raça;
        retorno += " Idade real: " + idade;
        retorno += " Idade aparente: " + getIdadeAparente();
        retorno += " Dono: " + this.donoDoAnimal.getNome();
        
        return retorno;
    }
    
    public int getIdadeAparente(){
        
        return idade *7;
        
    }
}