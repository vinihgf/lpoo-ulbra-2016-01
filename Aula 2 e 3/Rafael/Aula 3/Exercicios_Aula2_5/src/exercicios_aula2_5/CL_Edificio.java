package exercicios_aula2_5;

import java.util.ArrayList;
import java.util.List;

public class CL_Edificio
{
    String cor;
    int totalDePortas = 0;
    int totalDeAndares = 0;
    List<CL_Porta> objListPorta = new ArrayList<>();
    
    public void pinta(String s)
    {
        this.cor = s;
    }
    
    public int quantasPortasEstaoAbertas()
    {
        int qtdPortasAbertas = 0;

        for(CL_Porta porta : this.objListPorta)
        {
            if(porta.aberta)
            {
                qtdPortasAbertas++;
            }
        }
        return qtdPortasAbertas;
    }
    
    public void adicionarPorta(CL_Porta objPorta)
    {
        this.objListPorta.add(objPorta);
    }
    
    public int totalDePortas()
    {
        return this.objListPorta.size();
    }
    
    public void adicionarAndar()
    {
        this.totalDeAndares++;
    }
    
    public int totalDeAndares()
    {
        return this.totalDeAndares;
    }
}
