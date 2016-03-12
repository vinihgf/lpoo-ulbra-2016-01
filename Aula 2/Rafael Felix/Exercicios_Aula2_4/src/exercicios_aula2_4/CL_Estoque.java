package exercicios_aula2_4;

public class CL_Estoque
{
    String nome;
    int qtdAtual;
    int qtdMinima;
    
    public void mudarNome(String nome)
    {
        this.nome = nome;
    }
    
    public void mudarQtdMinima(int qtdMinima)
    {
        this.qtdMinima = qtdMinima;
    }
    
    public void repor(int qtd)
    {
        this.qtdAtual = qtdAtual + qtd;
    }
    
    public void darBaixa(int qtd)
    {
        this.qtdAtual = qtdAtual - qtd;
    }
    
    public String mostra()
    {
        String status = "Nome do produto: " + nome + "\nQuantidade minima do produto: " + qtdMinima + "\nQuantidade atual do produto: " + qtdAtual;
        return status;
    }
    
    public boolean precisaRepor()
    {
        boolean precisaRepor;
        
        if(qtdAtual <= qtdMinima)
        {
            precisaRepor = true;
            return precisaRepor;
        }
        else
        {
            precisaRepor = false;
            return precisaRepor;
        }
    }
}