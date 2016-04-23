
package Exercicio8;


public class Moto {
    public String marca;
   public String modelo;
   public String cor;
   public int marcha;
   public int maiorMarcha;
   public int menorMarcha;
   
   public Moto(String marca, String modelo, String cor,int marcha, int maiorMarcha, int menorMarcha)
   {
       this.marca = marca;
       this.modelo = modelo;
       this.cor = cor;
       this.marcha = marcha;
       this.menorMarcha = menorMarcha;
       this.maiorMarcha = maiorMarcha;
   }
   public void marchaAcima(int marchaMais)
   {
       if(this.marcha == maiorMarcha)
       {
           System.out.println("Não pode aumentar marcha");
       }
       else
       {
           this.marcha = this.marcha + marchaMais;
       }
   }
   public void marchaAbaixo(int marchaMenos)
   {
       if(this.marcha == menorMarcha)
       {
           System.out.println("Não pode baixar marcha!");
       }
       else
       {
           this.marcha = this.marcha - marchaMenos;
       }
   }
   public void imprimir()
   {
       System.out.println("Marca: " + this.marca +" Modelo " + this.modelo + " Cor: " + this.cor + " Marcha: " + this.marcha + 
               " Menor Marcha possível: " + this.menorMarcha + " Maior Marcha Possível: " + this.maiorMarcha);
   }
}
