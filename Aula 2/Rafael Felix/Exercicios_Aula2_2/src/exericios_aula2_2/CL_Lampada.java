package exericios_aula2_2;

public class CL_Lampada
{
    boolean ligada;
    String retorno;
    
    public void liga()
    {
        this.ligada = true;
    }
    
    public void desliga()
    {
        this.ligada = false;
    }
    
    public String observa()
    {
        if(ligada == true)
        {
            retorno = "Ligada!";
            return retorno;
        }
        else
        {
            retorno = "Desligada!";
            return retorno;
        }
    }
}
