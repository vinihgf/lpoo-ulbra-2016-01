package exemplo2;

public class Empresa {
    
    private IFaxineira faxineira;

    public void setFaxineira(IFaxineira paramFaxineira)
    {
        this.faxineira = paramFaxineira;
    }
    
    public void diaDaLimpeza()
    {
        faxineira.lavar();
        faxineira.varrer();
        faxineira.tirarLixo();
    }
}
