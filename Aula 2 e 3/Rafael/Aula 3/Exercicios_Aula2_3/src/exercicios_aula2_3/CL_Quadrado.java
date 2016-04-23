package exercicios_aula2_3;

public class CL_Quadrado
{
    double lado;
    
    public double area()
    {
        double area = lado*lado;
        return area;
    }
    
    public double perimetro()
    {
        double perimetro = lado * 4;
        return perimetro;
    }
}
