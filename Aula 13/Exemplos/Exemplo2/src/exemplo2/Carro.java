package exemplo2;

public class Carro extends VeiculoAutomotivo {
    
    public Carro(boolean ligado) {
        super(ligado);        
    }
    
    public void setLigado(boolean ligado) {        
        this.ligado = (ligado && this.temCargaBareria);
    }
}