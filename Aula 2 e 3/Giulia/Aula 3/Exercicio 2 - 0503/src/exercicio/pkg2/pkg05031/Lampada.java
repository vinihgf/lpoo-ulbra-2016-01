package exercicio.pkg2.pkg05031;

public class Lampada {

    public boolean ligada;
      
    public void liga(){
    
        ligada = true;
           
    }
    
    public void desliga(){
    
        ligada = false;
    }
    
    public void observa(){
    
        if (ligada) {
         System.out.println("Lâmapada Ligada");
        
        }   
        else {
        
            System.out.println("Lâmapada Desligada");
        }
    
    }
}


