package exercicio_2_aula_6;

import java.util.Scanner;

/**
 *
 * @author leogi
 */
public class Exercicio_2_aula_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu, camarote;
        double adicioA, adicioB;

       Scanner input = new Scanner(System.in);

        Ingresso ingresso = new Ingresso();
        VIP vip = new VIP();
        IngressoNormal normal = new IngressoNormal();
        CamaroInferior inferior = new CamaroInferior();
        CamaroteSuperior superior = new CamaroteSuperior();


        do{
                System.out.println("Digite um 1 para NORMAL ou 2 para VIP ou 3 para SAIR: ");
                menu = input.nextInt();

                if (menu == 1){
                    normal.imprimir();
                }

                else if (menu == 2){
                    System.out.println("1 para Camaro Inferior ou 2 para Superior: ");
                    camarote = input.nextInt();
                    if (camarote == 1){
                        adicioA = vip.adicional();
                        inferior.imprimir(adicioA);
                    }
                    else if(camarote == 2){
                        adicioB = superior.adicional();
                        ingresso.imprimir(adicioB);
                    }
                }
        }while(menu != 3);
    }
    
}
