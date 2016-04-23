package aula_7_exer_1;


/**
 *
 * @author leogi
 */
public class Urna {
    public int NUMEROCONSTANTE = 0;
    private int contBranco = 0;
    private int contNulo = 0;
    private int contValido[];
    
    public Urna()
    {
        this.NUMEROCONSTANTE = 3;
        inicializarVetor();
        this.preencher();
    }
    
    public Urna(int numerCandidato)
    {
        this.NUMEROCONSTANTE = numerCandidato;
        this.inicializarVetor();
        this.preencher();
    }
    
    private void inicializarVetor()
    {
         contValido = new int[NUMEROCONSTANTE];
    }
    
    private void preencher(){
        for(int x = 0; x < this.NUMEROCONSTANTE; x++){
            contValido[x] = 0;
        }
    }
    
    public void branco(){
        this.contBranco++;
    }
    
    public void nulo(){
        this.contNulo++;
    }
    
    public void valido(int candidato){
        this.contValido[candidato]++;

    }
    
    public void apurar(){
        System.out.println("Votos em Branco: " + this.contBranco + "\n"); 
        System.out.println("Votos Nulo: " + this.contNulo + "\n");
        for(int x = 0; x < this.NUMEROCONSTANTE; x++){
            System.out.println("Voto candidato " + x + " : " + this.contValido[x] + "\n");
        }
    }
    
}
