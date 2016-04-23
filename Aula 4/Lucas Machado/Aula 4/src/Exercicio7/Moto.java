
package Exercicio7;


public class Moto {
    public String marca;
   public String modelo;
   public String cor;
   public int marcha;
   
   public Moto(String marca, String modelo, String cor)
   {
       this.marca = marca;
       this.modelo = modelo;
       this.cor = cor;
       this.marcha = 0;
   }
   public void marchaAcima(int marchaMais)
   {
       if(this.marcha == 5)
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
       if(this.marcha == 0)
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
       System.out.println("Marca: " + this.marca +" Modelo " + this.modelo + " Cor: " + this.cor + " Marcha: " + this.marcha);
   }
    
}
