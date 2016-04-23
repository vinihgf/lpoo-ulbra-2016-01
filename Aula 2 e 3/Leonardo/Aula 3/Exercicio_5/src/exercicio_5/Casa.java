package exercicio_5;

/**
 *
 * @author leogi
 */
public class Casa {
    public String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;
    
    public String pinta(String s){
        cor = s;
        return s;
    }
    
    public int quantasPortasEstaoAbertas(){
        int n = 0;
        if (porta1.aberta  == true){
            n++;
        }            
        if (porta2.aberta  == true){
            n++;           
        }

        if (porta3.aberta  == true){
            n++;
        }

        return n;
    }
    
    public int totalDePortas(){
        return 3;
    }
    
    
}
