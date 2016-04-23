package exercício.pkg4.pkg0503;

public class Estoque {
  
    String nome;
    int qtdAtual;
    int qtdMinima;
    
    void mudarNome(String novoNome){
          
        nome = novoNome;
    }
    void mudarQtdMinima(int qtd){
    
        qtdMinima = qtd; 
        
    }
    
    
    
    void repor(int qtd){
            
        qtdAtual = qtdAtual + qtd;
    
    }
    
    void darBaixa(int qtd){
        if((qtdAtual - qtd) <= 0)
        {
            nao e permitido estoque
        }
        else
        {
            qtdAtual = qtdAtual - qtd;
        }   
        
    
    }
    
    String mostra() {
    
        String mostrar = "Nome: " + nome + " Quantidade Mínima: " + qtdMinima + " Quantidade Atual: " + qtdAtual;
        return mostrar;
        
    }
    
    boolean precisaRepor(){
    
        if (qtdAtual < qtdMinima)
            return true;
        else 
            return false;

    }
    
    
    
    
}
