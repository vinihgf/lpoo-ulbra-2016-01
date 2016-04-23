package aula07;
public class Arena {
    public static void main(String[] args) 
    {
        int vitBret = 0;
        int vitGreg = 0;
        
        while (vitBret != 10 && vitGreg != 10)
        {
            CL_Bretoes objBretoes = new CL_Bretoes();
            CL_Gregos objGregos = new CL_Gregos();
            objBretoes.gerarAtrib();
            objGregos.gerarAtrib();
            while(objBretoes.getVida() >= 0 && objGregos.getVida() >= 0)
            {
                if(objBretoes.calcIniciativ() > objGregos.calcIniciativ())
                {
                    int ataq = objBretoes.calcAtaq();
                    int def = objGregos.calcDef();
                    if( ataq > def )
                    {
                        objGregos.calcDano(ataq - def);
                    }
                }
                else
                {
                    int ataq = objGregos.calcAtaq();
                    int def = objBretoes.calcDef();
                    if(ataq > def)
                    {
                        objBretoes.calcDano(ataq - def);
                    }
                }
            }
            if(objGregos.getVida() <= 0)
            {
                vitBret +=1;
            }
            else
            {
                vitGreg +=1;
            }
        }
        if(vitBret == 5)
        {
            System.out.println("VITORIA DOS BRETOES");
        }
        else
        {
            System.out.println("VITORIA DOS GREGOS");
        }
        System.out.println("\nPLACAR");
        System.out.println("\nBRETOES " + vitBret + " vs " + vitGreg + " GREGOS");
    }
}
