package exercicio_4_aula_4;

/**
 *
 * @author leogi
 */
public class Moto {
    public String marca;
    public String modelo;
    public String cor;
    public int marcha = 0;
    public int menorMarcha;
    public int maiorMarcha;
    
    public Moto(String marca, String modelo, String cor, int menorM,int maiorM){
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.menorMarcha = menorM;
        this.maiorMarcha = maiorM;
        
    }
    
    public void marchaAcima(int passada){
        if (passada >= menorMarcha && passada <= maiorMarcha && this.marcha == 5){
            this.marcha = this.marcha + passada;
        }
        else{
            System.out.println("Erro! Passagem de marcha inválida");
        }
        
    }
    
    public void marchaAbaixo(int passada){
        if (passada >= menorMarcha && passada <= maiorMarcha && this.marcha == 0){
            this.marcha = this.marcha - passada;
        }
        else{
            System.out.println("Erro! Passagem de marcha inválida");
        }
        
    }
    
    
    public void imprimir(){
        
        String retorno = "\n Marca: " + this.marca + "\n Modelo: " + this.modelo + "\n Cor: " + this.cor + "\n Marcha: " + this.marcha+ "\n Menor Marcha: " + this.menorMarcha + "\n Marcha: " + this.maiorMarcha + "\n";
        System.out.println(retorno);
    }
}
