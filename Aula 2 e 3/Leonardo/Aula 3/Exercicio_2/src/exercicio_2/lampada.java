package exercicio_2;

/**
 *
 * @author leogi
 */
public class lampada {
    public boolean ligada;
    
    public void liga(){
        ligada = true;
    }
    public void desliga(){
        ligada = false;
    }
    
    public String observa(){
        if(ligada){
            return "Ligada"; 
            
        }
        else {
            return "Desligada"; 
        }
        
    }
}
