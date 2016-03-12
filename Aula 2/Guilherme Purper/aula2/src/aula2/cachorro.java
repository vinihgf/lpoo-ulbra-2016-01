package aula2;

public class cachorro {
    public String nome;
    public String raca;
    public Boolean estabrabo;
    public int idade;
    public dono donoDoAnimal;
    
    public String getDadosDoAnimal() {
        String retorno = "\nNome: " + nome + "\nRaça: " + raca;
        retorno += "\nIdade real: " + idade;
        retorno += "\nIdade aparente: " + this.getIdadeAparente();
        retorno += "\nDono: " + this.donoDoAnimal.getNome();
        retorno += "\nRua: " + this.donoDoAnimal.enderecoDono.rua;
        retorno += "\nNº: " + this.donoDoAnimal.enderecoDono.numero;
        retorno += "\nBairro: " + this.donoDoAnimal.enderecoDono.bairro;
        retorno += "\nCidade: " + this.donoDoAnimal.enderecoDono.cidade;
        retorno += "\nEstado: " + this.donoDoAnimal.enderecoDono.estado;
        retorno += "\n\n-----------------------------";
        return retorno;
    }
    
    public int getIdadeAparente() {
        return idade * 7;
    }
}