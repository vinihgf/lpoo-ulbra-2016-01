package aula2.cachorro;

public class cachorro {
    public String nome;
    public String raca;
    public boolean EstaBrabo;
    public int idade;
    
    public Dono donoDoAnimal;
    
    public String getDadosDoAnimal(){
        String retorno = "\n Nome do Animal: " + nome + "\n Raca do Animal: " +raca;
        retorno += "\n Idade Real " + idade;
        retorno += "\n Idade Aparente: " + getIdadeAparente();
        retorno += "\n Dados do dono:";
        retorno += "\n Dono: " + this.donoDoAnimal.getNome();
        retorno += "\n Rua: " + this.donoDoAnimal.enderecoDono.rua;
        retorno += " - " + this.donoDoAnimal.enderecoDono.numero;
        retorno += " \n Bairro: " + this.donoDoAnimal.enderecoDono.bairro;
        retorno += " \n Cidade: " + this.donoDoAnimal.enderecoDono.cidade;
        retorno += " - " + this.donoDoAnimal.enderecoDono.estado;
       
        
        return retorno;
    }

    public int getIdadeAparente(){
        return idade * 7;
    }
    
}
