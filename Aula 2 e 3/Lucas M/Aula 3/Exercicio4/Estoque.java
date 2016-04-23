
package Exercicio4;


public class Estoque {
    //a.	Os atributos nome (String), qtdAtual (int) e qtdMinima (int).
    public String nome;
    public int qtdAtual;
    public int qtdMinima;

    public void mudarNome(String nome)
    {
        
    }
    public void mudarQtdMinima(int qtdMinima)
    {
        
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
        String produto;
        produto = "Nome:" + this.nome + " Qtd Minima" + this.qtdMinima + " Qtd Atual" + this.qtdAtual;
        return produto;
    }
    public boolean precisaRepor()
    {
        boolean repor = false;
        if(this.qtdAtual<= this.qtdMinima)
        {
            repor = true;
        }

           return repor; 
    }
    
}
