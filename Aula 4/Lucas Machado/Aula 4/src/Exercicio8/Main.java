
package Exercicio8;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "CG 125", "Azul", 2, 4, 2);
        boolean rodar = true;
        int op, qtd;
        
        while(rodar)
        {
            System.out.println("Aumentar (1) Diminuir (2) Sair (3)");
            Scanner opcao = new Scanner(System.in);
            op = opcao.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Quantidade?");
                    qtd = opcao.nextInt();
                    moto.marchaAcima(qtd);
                     moto.imprimir();
                    break;
                case 2:
                    System.out.println("Quantidade?");
                    qtd = opcao.nextInt();
                    moto.marchaAbaixo(qtd);
                    moto.imprimir();
                    break;
                default:
                    rodar = false;
                    break;
            }
        }
    }
}
    