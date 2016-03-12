package Exercicios;

import java.util.Scanner;

public class lampada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CL_Lampada objLampada = new CL_Lampada();
        
        System.out.println("Digite o estado da lampada");
        System.out.println("1 - Ligada / 2 - Desligada");
        if(input.nextInt() == 1)
        {
            objLampada.ligada = true;
        }
        else if(input.nextInt() == 2)
        {
            objLampada.ligada = false;
        }
        else
            
        {
            System.out.println("Opção Invalida. Sistema Encerrado");
        }
        
        boolean sai = false;
        while(!sai)
        {
            System.out.println("Digite a opçao");
            System.out.println("1 - Ligar Lampada\n2 - Desligar Lampada\n 3 - Ver Estado da Lampada\n 4 - Sair");
            int opcao = input.nextInt();
            
            if(opcao == 1)
            {
                objLampada.liga();
            }
            else if(opcao == 2)
            {
                objLampada.desliga();
            }
            else if(opcao == 3)
            {
                System.out.println(objLampada.observa());
            }
            else if(opcao == 4)
            {
                sai = true;
            }
            else
            {
                System.out.println("Opção Inválida. Tente Novamente");
            }
        }
    }        
}
