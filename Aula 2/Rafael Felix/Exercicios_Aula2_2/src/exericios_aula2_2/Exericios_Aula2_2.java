package exericios_aula2_2;

import java.util.Scanner;

public class Exericios_Aula2_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CL_Lampada objLampada = new CL_Lampada();
        int escolha = 0;
        
        while(escolha != 4)
        {
            System.out.println("1-Ligar Lampada;\n2-Desligar Lampada;\n3-Observar Lampada;\n4-Sair.");
            escolha = input.nextInt();
            
            if(escolha == 1)
            {
                objLampada.liga();
            }
            else if(escolha == 2)
            {
                objLampada.desliga();
            }
            else if(escolha ==3)
            {
                objLampada.observa();
                System.out.println(objLampada.observa());
            }
        }
    }   
}
