package exercicios_aula2_5;

public class CL_Casa
{
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;
    
    public void pinta(String s)
    {
        this.cor = s;
    }
    
    public int quantasPortasEstaoAbertas()
    {
        int qtdPortasAbertas = 0;
        if(this.porta1 == true)
        {
            qtdPortasAbertas += 1;
        }
        if(this.porta2 == true)
        {
            qtdPortasAbertas += 1;
        }
        if(this.porta3 == true)
        {
            qtdPortasAbertas += 1;
        }
        return qtdPortasAbertas;
    }
    
    public int quantasPortasEstaoFechadas()
    {
        int qtdPortasFechadas = 0;
        if(this.porta1 == false)
        {
            qtdPortasFechadas += 1;
        }
        if(this.porta2 == false)
        {
            qtdPortasFechadas += 1;
        }
        if(this.porta3 == false)
        {
            qtdPortasFechadas += 1;
        }
        return qtdPortasFechadas;
    }
}