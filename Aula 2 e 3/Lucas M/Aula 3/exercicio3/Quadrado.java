

package exercicio3;


public class Quadrado {
    public double lado;
    
    public double area()
    {
        double totalArea;
        totalArea = this.lado * this.lado;
        return totalArea;
    }
    public double perimetro()
    {
        double totalPerimetro;
        totalPerimetro = this.lado * 4;
        return totalPerimetro;
    }
}
