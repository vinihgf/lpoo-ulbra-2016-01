package exercicios_aula2_5;

public class CL_Porta
{
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    public void abre()
    {
        this.aberta = true;
    }
    
    public void fecha()
    {
        this.aberta = false;
    }
    
    public void pinta(String s)
    {
        this.cor = s;
    }
    
    public boolean estaAberta()
    {
        if(aberta == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}