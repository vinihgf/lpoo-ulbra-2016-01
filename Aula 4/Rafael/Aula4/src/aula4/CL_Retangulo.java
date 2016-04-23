package aula4;

public class CL_Retangulo
{
    double comprimento;
    double largura;
    double area;
    double perimetro;
    
    public CL_Retangulo()
    {
        this.comprimento = 5;
        this.largura = 4;
    }
    public double calcularArea()
    {
        area = comprimento*largura;
        return area;
    }
    
    public double calcularPerimetro()
    {
        perimetro = (2*comprimento)+(2*largura);
        return perimetro;
    }
    
    public void calcularTudo()
    {
        calcularArea();
        calcularPerimetro();
    }
    
    public void imprimir()
    {
        System.out.println("\nComprimento: " + this.comprimento);
        System.out.println("Largura: " + this.largura);
        System.out.println("Area: " + this.area);
        System.out.println("Perimetro: " + this.perimetro);
    }
}