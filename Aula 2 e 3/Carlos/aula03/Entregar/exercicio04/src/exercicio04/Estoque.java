package exercicio04;

/**
 *
 * @author roberto
 */
public class Estoque {
     public String nome;
    public int qtdAtual;
    public int qtdMinima;
    
    public void mudarNome(String name) {
        
        this.nome = name;
        
    }
    
    public void mudarQtdMinima(int qtd){
        
        this.qtdMinima = qtd;
        
    }
    
    public void repor(int qtd) {
        
        this.qtdAtual = this.qtdAtual + qtd;
        
    }
    
    public void darBaixa (int qtd){
        
        this.qtdAtual = this.qtdAtual - qtd;
        
    }
    
    public String mostra(){
        
        String retorno = "-------------------------------";
        retorno += "\n Produto: " + this.nome + "\n Quantidade Atual: " + this.qtdAtual + "\n Quantidade Mínima: " + this.qtdMinima + "\n";
        retorno += "-------------------------------";
        return retorno; 
        
    }
    
    public boolean precisaRepor(){
        
        boolean retorno = false;
        
        if (this.qtdAtual <= this.qtdMinima){
                
            retorno = true;
                
        } else {
                
            retorno = false;
                
        }
        
        return retorno;
        
}
}
