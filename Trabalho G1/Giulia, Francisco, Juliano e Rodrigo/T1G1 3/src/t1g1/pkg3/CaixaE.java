package t1g1.pkg3;

public class CaixaE {

    private int dois, cinco, dez, vinte, cinq, total;

    public void repoe_dois(int qtd) {

        this.dois = this.dois + qtd;

    }

    public void repoe_cinco(int qtd) {

        this.cinco = this.cinco + qtd;

    }

    public void repoe_dez(int qtd) {

        this.dez = this.dez + qtd;

    }

    public void repoe_vinte(int qtd) {

        this.vinte = this.vinte + qtd;

    }

    public void repoe_cinquenta(int qtd) {

        this.cinq = this.cinq + qtd;

    }

    public int visualiza_total() {
        int soma;

        soma = (this.dois * 2) + (this.cinco * 5) + (this.dez * 10) + (this.vinte * 20) + (this.cinq * 50);
        this.total = soma;

        return soma;
    }

    public String visualiza_qtd_notas() {
        String qtd = " ";
        
        if (this.dois >0) {
        
            qtd = ("| 2: " + this.dois + "|"); 
                
        }
         if (this.cinco >0) {
        
            qtd = qtd + (" 5: " + this.cinco + "|"); 
                
        }
          if (this.dez >0) {
        
            qtd = qtd + (" 10: " + this.dez + "|"); 
                
        }
           if (this.vinte >0) {
        
            qtd = qtd + (" 20: " + this.vinte + "|"); 
                
        }
            if (this.cinq >0) {
        
            qtd = qtd + (" 50: " + this.cinq + "|"); 
                
        }
        
            return qtd;
    }

    public String cedula_disp(){
    
        String qtd = " ";
        
        if (this.dois >0) {
        
            qtd = ("| 2 |"); 
                
        }
         if (this.cinco >0) {
        
            qtd = qtd + (" 5 |"); 
                
        }
          if (this.dez >0) {
        
            qtd = qtd + (" 10 |" ); 
                
        }
           if (this.vinte >0) {
        
            qtd = qtd + (" 20 |"); 
                
        }
            if (this.cinq >0) {
        
            qtd = qtd + (" 50 | "); 
                
        }
        
            return qtd;
    
    
    }

    public String saque_valor(int vsaque) {

        String saida = " ";
        int n50, n20, n10, n5, n2;

        if (vsaque > this.total) {

            saida = ("Valor do caixa Insuficiente! "); //testa saldo
            return saida;

        } else if ((vsaque%5 != 0) && (vsaque%2 != 0)) { //testa se existem notas para montar o valor

            saida = ("Notas indisponíveis para o valor!");
            return saida;

        } else {

            if (vsaque > 50) {

                n50 = (vsaque / 50);
                vsaque = vsaque%50;
                this.cinq = this.cinq - n50;
                saida = (n50 + " - Notas de 50 \n");

            }
            
            if (vsaque > 20) {

                n20 = (vsaque / 20);
                vsaque = (vsaque%20);
                this.vinte = this.vinte - n20;
                saida = saida + (n20 + " - Notas de 20 \n");

            }
            
            if (vsaque > 10) {

                n10 = (vsaque / 10);
                vsaque = (vsaque%10);
                this.dez = this.dez - n10;
                saida = saida + (n10 + " - Notas de 10 \n");

            }
            
            if (vsaque > 5) {

                n5 = (vsaque / 5);
                vsaque = (vsaque%5);
                this.cinco = this.cinco - n5;
                saida = saida + (n5 + " - Notas de 5 \n");

            }
            
            if (vsaque > 2) {

                n2 = (vsaque / 2);
                vsaque = (vsaque%2);
                this.dois = this.dois - n2;
                saida = saida + (n2 + " - Notas de 2 \n");

            }
            
            this.visualiza_total(); //atualiza total junto
            return saida;
        }
    }
}
