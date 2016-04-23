package exercicio01;

class Pessoa {
    public String nome;
    public int idade;
    
    public void fazAniversario(){
        idade++;
    }
        
    public String retornaNomeIdade(){
        String retorno = "Nome: " + this.nome + "\nIdade: " + this.idade;
        return retorno;
    }
}