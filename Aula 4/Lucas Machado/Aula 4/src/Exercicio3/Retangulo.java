
package Exercicio3;


public class Retangulo {
    public float comprimento;
    public float largura;
    public float area;
    public float perimetro;
    
    public Retangulo(float comprimento, float largura)
    {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public void calcularArea()
    {
        this.area = this.comprimento * this.largura;
    }
    public void calcularPerimetro()
    {
       this.perimetro = (2*this.comprimento)+(2*this.largura); 
    }
    public void calcularTudo()
    {
        this.calcularArea();
        this.calcularPerimetro();
    }
    public void imprimir()
    {
      System.out.println("Comprimento:" + this.comprimento + " Largura " + this.largura + " Área " + this.area + " Perimetro: " + this.perimetro);
    }
    
}
