package exemplo2;

public abstract class VeiculoAutomotivo {

    protected boolean ligado;    
    protected boolean temCargaBareria;

    public VeiculoAutomotivo(boolean ligado) {
        this.ligado = ligado;
        //this.setLigado(ligado);
        this.temCargaBareria = true;
    }

    public abstract void setLigado(boolean ligado);
    
    public boolean isLigado() {
        return this.ligado;
    }
}
