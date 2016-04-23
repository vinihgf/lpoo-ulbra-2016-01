package exercicio_5;

/**
 *
 * @author leogi
 */
public class Porta {
    public boolean aberta;
    public String cor;
    public double dimensaoX;
    public double dimensaoY;
    public double dimensaoZ;
    
    public void abre(){
        aberta = true;
    }
    
    public void fecha(){
        aberta = false;
    }
    
    public String pinta(String s){
        cor = s;
        return s;
    }
    
    public boolean estaAberta(){
        boolean retorno;
        if (aberta == true){
            return retorno = true;
        }
        else{
            return retorno = false;
        }
    }
}