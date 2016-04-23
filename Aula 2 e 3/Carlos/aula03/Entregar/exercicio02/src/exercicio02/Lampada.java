
package exercicio02;

/**
 *
 * @author roberto
 */
public class Lampada {
    public boolean ligada;
  
    public void ligada()
    { ligada= true;
    }
     public void desligada()
    { ligada= false;
    }
    public String observa(){
    if (ligada){
        return "ligada";
    }
    else {
        return "desligada";
    
    }
    }
}
    
    
    
    /** 
    public String Ligada(){
        String retorno = "Ligada" + true;

            return retorno;
    }
    
    public String Desligada(){
         String retorno = "Desligada" + false;

            return retorno;
    }     */

