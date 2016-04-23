package exercicio_3_aula_6;

/**
 *
 * @author leogi
 */
public class Mamifero extends Animal{
    public String alimento;

    public void alterarAlimento(String alimento){
        this.alimento = alimento;
    }
    
    public void imprimir(){
        this.imprime = "Nome: " + this.nome + "\n";
        this.imprime += "Comprimento: " + this.comprimento + "\n";
        this.imprime += "Patas: " + this.patas + "\n";
        this.imprime += "Cor: " + this.cor + "\n";
        this.imprime += "Ambiente: " + this.ambiente + "\n";
        this.imprime += "Velocidade: " + this.velocidade + "m/s \n";
        this.imprime += "Alimento: " + this.alimento + "\n";
        System.out.println(this.imprime);
    }
}
