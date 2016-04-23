
package Exercicio5;


public class Moto 
{
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
   public void imprimir()
   {
       System.out.println("Marca: " + this.marca +" Modelo " + this.modelo + " Cor: " + this.cor + " Marcha: " + this.marcha);
   }
}
