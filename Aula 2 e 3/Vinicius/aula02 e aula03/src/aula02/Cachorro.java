package aula02;
public class Cachorro {
    public String nome;
    public String raca;
    public boolean estaBrabo;
    public int idade;    
    
    public Dono donoAnimal;
    
    public String getDados(){
    String retorno = "DADOS DO DONO";
    retorno = retorno + "\nNome do Dono: " + this.donoAnimal.nome;
    retorno = retorno = "\nEndereco do Dono:";
    retorno = retorno + "\n" + this.donoAnimal.endereco.getEndereco();
    retorno = retorno + "\n \n DADOS DO Cachorro";
    retorno = retorno + "\nNome do cachorro: "+ nome;
    retorno = retorno + "\nRaça do cachorro: "+ raca; 
    retorno = retorno + "\nIdade Real:" + idade;
    retorno = retorno + "\nIdade Aparente:" + getIdadeAparente();
    retorno = retorno + "\nDono: " + this.donoAnimal.getNome();
    return retorno;
    }

    public int getIdadeAparente()
    {
    return idade * 7;
    }
}