package exemplo3;

public class FaxineiraSulClean implements IFaxineira {

    @Override
    public void varrer() {
        System.out.println("FaxineiraSulClean - Varrer");
    }

    @Override
    public void lavar() {
        System.out.println("FaxineiraSulClean - lavar");
    }

    @Override
    public void tirarLixo() {
        System.out.println("FaxineiraSulClean - tirarLixo");
    }
    
}
