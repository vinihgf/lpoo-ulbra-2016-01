package exercicio_1_aula_6;
import java.util.Scanner;
/**
 *
 * @author leogi
 */
public class Exercicio_1_aula_6 {

    public static void main(String[] args) {

        int menu;
        double adicio, desc;
        
        Scanner input = new Scanner(System.in);
        
        Novo novo = new Novo();
        Velho velho = new Velho();
        
        do{
            System.out.println("Digite um 1 para NOVO ou 2 para VELHO ou 3 para SAIR: ");
            menu = input.nextInt();

            if (menu == 1){
                System.out.println("Digite um valor: ");
                adicio = input.nextDouble();
                novo.adicional(adicio);
                novo.imprimir();
            }

            else if (menu == 2){
                System.out.println("Digite um valor para desconto: ");
                desc = input.nextDouble();
                
                velho.desconto(desc);
                velho.imprimir();
            }
        }while(menu != 3);
        
    }
    
}
