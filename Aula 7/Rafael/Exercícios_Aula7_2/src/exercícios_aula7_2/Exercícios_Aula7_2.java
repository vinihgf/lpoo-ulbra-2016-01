package exercícios_aula7_2;

public class Exercícios_Aula7_2
{
    public static void main(String[] args)
    {
        int vitoriasBretoes = 0;
        int vitoriasGregos = 0;
        
        while(vitoriasBretoes != 10 && vitoriasGregos !=10)
        {
            CL_Bretoes objBretoes = new CL_Bretoes();
            CL_Gregos objGregos = new CL_Gregos();
        
            objBretoes.gerarAtributos();
            objGregos.gerarAtributos();
            
            while(objBretoes.getVida() > 0 && objGregos.getVida() > 0)//Enquanto vida maior que 0, a luta continua
            {
                if(objBretoes.calcularIniciativa() > objGregos.calcularIniciativa())//Bretões possui iniciativa maior
                {
                    int ataque = objBretoes.calcularAtaque();
                    int defesa = objGregos.calcularDefesa();
                    
                    if(ataque > defesa)
                    {
                        objGregos.calcularDano(ataque - defesa);
                        
                        if(objGregos.getVida() <= 0)
                        {
                            vitoriasBretoes = vitoriasBretoes + 1;
                        }
                    }
                }
                else//Grego possui iniciativa maior
                {
                    int ataque = objGregos.calcularAtaque();
                    int defesa = objBretoes.calcularDefesa();
                    
                    if(ataque > defesa)
                    {
                        objBretoes.calcularDano(ataque - defesa);
                        
                        if(objBretoes.getVida() <= 0)
                        {
                            vitoriasGregos = vitoriasGregos + 1;
                        }
                    }
                }
            }
        }
        if(vitoriasBretoes == 10)
        {
            System.out.println("Vitória dos Bretões!!!");
        }
        else
        {
            System.out.println("Vitória dos Gregos!!!");
        }
        System.out.println("Número de vitórias dos Gregos: " + vitoriasGregos);
        System.out.println("Número de vitórias do Bretões: " + vitoriasBretoes);
    }
}