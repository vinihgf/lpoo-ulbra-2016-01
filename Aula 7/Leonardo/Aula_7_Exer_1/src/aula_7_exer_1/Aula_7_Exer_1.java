package aula_7_exer_1;
import java.util.Scanner;

/**
 *
 * @author leogi
 */
public class Aula_7_Exer_1 {


    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);  
        Urna urna = new Urna(5);
        
        int menu, x,candidato, votantes = 5;
        
       
        
        for(x = 0; x < votantes; x++){
            do{
                System.out.println("VOTAR: \n(1) - Em Branco \n(2) - Nulo \n(3) - Candidato");
                menu = input.nextInt();
            }while(menu != 1 && menu != 2 && menu != 3);

            if(menu==1){
                urna.branco();
            }

            else if (menu==2){
                urna.nulo();
            }

            else {
                int imprimirNumero = urna.NUMEROCONSTANTE - 1;
                System.out.println("Candidato: 0 à " + imprimirNumero);
                candidato = input.nextInt();
                urna.valido(candidato);
            }
        }
        urna.apurar();
    }
    
}
