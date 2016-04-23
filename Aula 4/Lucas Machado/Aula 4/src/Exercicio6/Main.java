
package Exercicio6;

import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "CG 125", "Azul");
        boolean rodar = true;
        int op;
        
        while(rodar)
        {
            System.out.println("Aumentar (1) Diminuir (2) Sair (3)");
            Scanner opcao = new Scanner(System.in);
            op = opcao.nextInt();
            switch(op)
            {
                case 1:
                    moto.marchaAcima();
                     moto.imprimir();
                    break;
                case 2:
                    moto.marchaAbaixo();
                     moto.imprimir();
                    break;
                default:
                    rodar = false;
                    break;
            }
        }
    }
   
}
