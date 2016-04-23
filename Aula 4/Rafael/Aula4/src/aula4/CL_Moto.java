package aula4;

public class CL_Moto
{
    String marca;
    String modelo;
    String cor;
    int marcha = 0;
    int menorMarcha;
    int maiorMarcha;
    
    public CL_Moto()
    {
        this.marca = "Honda";
        this.modelo = "Biz";
        this.cor = "Preta";
        this.menorMarcha = 0;
        this.maiorMarcha = 4;
    }
    public void imprimir()
    {
        System.out.println("Moto: " + this.marca + " " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marcha: " + this.marcha);
    }
    
    public int marchaAcima()
    {
        if(marcha < maiorMarcha)
        {
            marcha += 1;
            return marcha;
        }
        else
        {
            return -1;
        }
    }
    
    public int marchaAbaixo()
    {
        if(marcha > menorMarcha)
        {
            marcha -= 1;
            return marcha;
        }
        else
        {
            return -1;
        }
    }
}