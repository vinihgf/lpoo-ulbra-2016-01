package trabalhog1;
public class CL_Caixa 
{
    private int cinquenta;
    private int vinte;
    private int dez;
    private int cinco;
    private int dois;
    private int valorTotal;
    
    public CL_Caixa(int cinquenta, int vinte, int dez, int cinco, int dois)
    {
        this.cinquenta = cinquenta;
        this.vinte = vinte;
        this.dez = dez;
        this.cinco = cinco;
        this.dois = dois;
        
        this.valorTotal = (cinquenta * 50) + (vinte * 20) + + (dez * 10) + (cinco * 5) + (dois * 2);
    }
    public void visualizaTotais()
    {
        System.out.println("\nQUANTIDADE DE NOTAS DE 50: "  + this.cinquenta + "   VALOR TOTAL: R$ " + this.cinquenta * 50);
        System.out.println("\nQUANTIDADE DE NOTAS DE 20: "  + this.vinte     + "   VALOR TOTAL: R$ " + this.vinte * 20);
        System.out.println("\nQUANTIDADE DE NOTAS DE 10: "  + this.dez       + "   VALOR TOTAL: R$ " + this.dez * 10);
        System.out.println("\nQUANTIDADE DE NOTAS DE 5: "   + this.cinco     + "   VALOR TOTAL: R$ " + this.cinco * 5);
        System.out.println("\nQUANTIDADE DE NOTAS DE 2: "   + this.dois      + "   VALOR TOTAL: R$ " + this.dois * 2);
        System.out.println("\nVALOR TOTAL: R$ " + this.valorTotal);
    }
    public boolean reposicao(int nota, int qtdNota)
    {
        if(nota == 50)
        {
            this.cinquenta = this.cinquenta + qtdNota;
            this.valorTotal = this.valorTotal + (50 * qtdNota);
            return true;
        }
        else if(nota == 20)
        {
            this.vinte = this.vinte + qtdNota;
            this.valorTotal = this.valorTotal + (20 * qtdNota);
            return true;
        }
        else if(nota == 10)
        {
            this.dez = this.dez + qtdNota;
            this.valorTotal = this.valorTotal + (10 * qtdNota);
            return true;
        }
        else if(nota == 5)
        {
            this.cinco = this.cinco + qtdNota;
            this.valorTotal = this.valorTotal + (5 * qtdNota);
            return true;
        }
        else if(nota == 2)
        {
            this.dois = this.dois + qtdNota;
            this.valorTotal = this.valorTotal + (2 * qtdNota);
            return true;
        }
        else
        {
            return false;
        }
    }
    public void confereNota()
    {
        if(this.cinquenta > 0)
        {
            System.out.println("\nNOTAS DE 50 DISPONIVEIS: " + this.cinquenta);
        }
        if(this.vinte > 0)
        {
            System.out.println("\nNOTAS DE 20 DISPONIVEIS: " + this.vinte);
        }
        if(this.dez > 0)
        {
            System.out.println("\nNOTAS DE 10 DISPONIVEIS: " + this.dez);
        }
        if(this.cinco > 0)
        {
            System.out.println("\nNOTAS DE 5 DISPONIVEIS: " + this.cinco);
        }
        if(this.dois > 0)
        {
            System.out.println("\nNOTAS DE 2 DISPONIVEIS: " + this.dois);
        }
        if(this.valorTotal > 0)
        {
            System.out.println("\nVALOR TOTAL: " + this.valorTotal);
        }
    }
    public int confereCinquenta()
    {
        return this.cinquenta;
    }
    public int confereVinte()
    {
        return this.vinte;
    }
    public int confereDez()
    {
        return this.dez;
    }
    public int confereCinco()
    {
        return this.cinco;
    }
    public int confereDois()
    {
        return this.dois;
    }
    public void saque(int cinquenta, int vinte, int dez, int cinco, int dois, int saque)
    {
        this.cinquenta = this.cinquenta - cinquenta;
        this.vinte = this.vinte - vinte;
        this.dez = this.dez - dez;
        this.cinco = this.cinco - cinco;
        this.dois = this.dois - dois;
        
        this.valorTotal = this.valorTotal - saque;
    }
    public int confereTotal()
    {
        return this.valorTotal;
    }
}
