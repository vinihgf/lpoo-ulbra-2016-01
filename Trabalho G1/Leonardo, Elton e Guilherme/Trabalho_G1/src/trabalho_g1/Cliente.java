package trabalho_g1;
/**
 *
 * @author LEONARDO GIULIANE / ELTON GIOVANE / GUILHERME PURPER
 */
public class Cliente extends Caixa{
    
    public int contadorCinquenta = 0;
    public int contadorVinte = 0;
    public int contadorDez = 0;
    public int contadorCinco = 0;
    public int contadorDois = 0;
    
    public Cliente(int cinquenta, int vinte, int dez, int cinco, int dois){
        
        this.cinquenta = cinquenta;
        this.vinte = vinte;
        this.dez = dez;
        this.cinco = cinco;
        this.dois = dois;
        
    }
    
    public int descontarSaque(int saque, int nota) {
        
        if (nota == 50){
      
            saque = saque - 50;
            
        } else if (nota == 20){
            
            saque = saque - 20;
            
        } else if (nota == 10){
                
        
            saque = saque - 10;
            
        } else if (nota == 5){
        
            saque = saque - 5;
            
        } else if (nota == 2){
                
            saque = saque - 2;
            
        }
        
        return saque;
    }
    
    public int descontarCedula(int valor, int nota) {
        
        if (nota == 50){
            valor--;
            this.contadorCinquenta++;
            
        } else if (nota == 20){
            
            valor--;
            this.contadorVinte++;
            
        } else if (nota == 10){
            
            valor--;
            this.contadorDez++;         
            
        } else if (nota == 5){
            
            valor--;
            this.contadorCinco++;
            
        } else if (nota == 2){
            
            valor--;
            this.contadorDois++;
        }
        
        return valor;
        
    }
    
    public int devolverCedulas(int valor, int nota){
        
        if (nota == 50){
            
            valor = valor + this.contadorCinquenta;
            this.contadorCinquenta = 0;
            
        }
        
        if (nota == 20){
            
           valor = valor + this.contadorVinte; 
           this.contadorVinte = 0;
           
        }
        
        if (nota == 10){
            
            valor = 10 * this.contadorDez;
            this.contadorDez = 0;
            
        }
        
        if (nota == 5) {
            
            valor = valor + this.contadorCinco;
            this.contadorCinco = 0;
            
        }
        
        if (nota == 2) {
            
            valor = valor + this.contadorDois;
            this.contadorDois = 0;
            
        }
        
        return valor;
    }
    
    public void imprimirCedulasDescontadas(){
        
       if (this.contadorCinquenta > 0){
           
           System.out.println("              R$ 50 - " + this.contadorCinquenta + " notas    ");
           
       } 
       
       if (this.contadorVinte > 0){
           
           System.out.println("              R$ 20 - " + this.contadorVinte + " notas    ");
           
       } 
       
       if (this.contadorDez > 0){
           
           System.out.println("              R$ 10 - " + this.contadorDez + " notas    ");
           
       } 
       
       if (this.contadorCinco > 0){
           
           System.out.println("              R$ 5 - " + this.contadorCinco + " notas    ");
           
       } 
       
       if (this.contadorDois > 0){
           
           System.out.println("              R$ 2 - " + this.contadorDois + " notas    ");
           
       }
    }
    
    public void imprimirCedulas(){
        
        String imprimir;
        
        imprimir = " Células disponíveis: ";
        
        if (this.cinquenta > 0){
        
            imprimir += " R$ 50 ";
            
        }
        
        if (this.vinte > 0){
            
            imprimir += " R$ 20 ";
            
        }
        
        if (this.dez > 0){
            
            imprimir += " R$ 10 ";
            
        }
        
        if (this.cinco > 0){
            
            imprimir += " R$ 5 ";
            
        }
        
        if (this.dois > 0){
            
            imprimir += " R$ 2 ";
            
        }
         
        if ((this.cinquenta == 0)&&(this.vinte == 0)&&(this.dez == 0)&&(this.cinco == 0)&&(this.dois == 0)){
            
            imprimir += "Não há notas disponíveis!";    
            
        }
        
        System.out.println(imprimir);
    }

}
