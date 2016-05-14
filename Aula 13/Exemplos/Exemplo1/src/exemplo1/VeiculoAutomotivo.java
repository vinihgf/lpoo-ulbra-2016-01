package exemplo1;

public abstract class VeiculoAutomotivo {

    protected boolean ligado;

    public VeiculoAutomotivo(boolean ligado) {
        this.ligado = ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return this.ligado;
    }
}
