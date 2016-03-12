package Exercicios;

public class CL_Estoque {
    String nome;
    int qtdAtual;
    int qtdMin;
    
    public void getEstoque(String nome, int qtdAtual, int qtdMin)
    {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMin = qtdMin;
    }
    
    public void mudarNome(String nome)
    {
        this.nome = nome;
    }
    
    public void mudarQtdMinimo(int qtdMin)
    {
        this.qtdMin = qtdMin;
    }
    
    public void repor(int qtd)
    {
        this.qtdAtual = this.qtdAtual + qtd;
    }
    
    public void darBaixa(int qtd)
    {
        this.qtdAtual = this.qtdAtual - qtd;
    }
    
    public String mostra()
    {
        String retorno = "Nome..........: " + this.nome +
                       "\nQtde Atual....: " + this.qtdAtual +
                       "\nQtde Minima...: " + this.qtdMin;
        return retorno;
    }
    
    public boolean precisaRepor()
    {
        if(this.qtdAtual <= this.qtdMin)
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
}
