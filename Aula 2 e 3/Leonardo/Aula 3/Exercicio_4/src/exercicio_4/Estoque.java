package exercicio_4;

/**
 *
 * @author leogi
 */
public class Estoque {
    public String nome;
    public int qtdAtual;
    public int qtdMinima;
    
    public void repor(int qtd){
        qtdAtual = qtdAtual + qtd;
    }
    
    public void darBaixa(int qtd){
        qtdAtual = qtdAtual - qtd;

    }
    
    public String mostra(){
        String retorno = "Nome :" + nome + "\n";
        retorno += "Quantidade Mínima: " + qtdMinima + "\n";
        retorno += "Quantidade Atual: " + qtdAtual + "\n";

        
        return retorno;
    }
    
    public boolean precisaRepor(){
        boolean retorno;
        if(qtdAtual <= qtdMinima){
            retorno =  true;
        }
        else{
            retorno = false;
        }
        
        return retorno;
    }

}
