package exericios_aula2_2;

public class CL_Lampada
{
    boolean ligada;
    
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
        if(ligada)
        {
            return "Ligada!";            
        }
        else
        {
            return "Desligada!";            
        }
    }
}
