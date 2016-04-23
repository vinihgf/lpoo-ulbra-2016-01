package aula_7_exer_2;
import java.util.Scanner;
/**
 *
 * @author leogi
 */
public class Aula_7_Exer_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int iniciaGrego, iniciaBretao, ataGrego, ataBretao, defGrego, defBretao, pvGrego, pvBretao, vencedor = 2, rodada = 0;
        
        Gladiator gladiator = new Gladiator();
        Gregos gregos = new Gregos();
        Bretoes bretoes = new Bretoes();
        Sistema sistema = new Sistema();
        
        gregos.criarGrego();
        gregos.modificadorGrego();

        bretoes.criarBretao();
        bretoes.modificadorBretao();
        
        gregos.imprimir();
        bretoes.imprimir();
      
        pvGrego = gregos.retornaPvGrego();
        pvBretao = bretoes.retornaPvBretao();
        
        
        do{
            iniciaGrego = gregos.iniciativaGrego();
            iniciaBretao = bretoes.iniciativaBretao();

            ataGrego = gregos.ataqueGrego();
            ataBretao = bretoes.defesaBretao();

            defGrego = gregos.defesaGrego();
            defBretao = bretoes.defesaBretao();
            
            if(iniciaGrego > iniciaBretao)
                pvBretao = sistema.ataque(iniciaGrego, iniciaBretao, ataGrego, ataBretao, defGrego, defBretao, pvGrego, pvBretao, rodada);
            else
                pvGrego = sistema.ataque(iniciaGrego, iniciaBretao, ataGrego, ataBretao, defGrego, defBretao, pvGrego, pvBretao, rodada);
            
            if(pvGrego <= 0){   
                 vencedor = 0;     
             }
            else if (pvBretao <= 0){  
                vencedor = 1;
            }
            
            rodada++;
        }while(vencedor != 0 && vencedor != 1);
        if(vencedor == 0){
            gregos.vencedorGrego();
        }
        else{
            bretoes.vencedorBretao();
        }
    }
    
}
