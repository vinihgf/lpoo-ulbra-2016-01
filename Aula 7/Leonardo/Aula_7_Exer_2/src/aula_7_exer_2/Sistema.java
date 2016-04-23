package aula_7_exer_2;

/**
 *
 * @author leogi
 */
public class Sistema{    
    
    public int ataque(int iniciaGrego, int iniciaBretao, int ataGrego, int ataBretao, int defGrego, int defBretao, int pvGrego, int pvBretao,int rodada){
        int dano = 0, vencedor;

        if(iniciaGrego > iniciaBretao){
                dano = ataGrego - defBretao;

                if(dano <= 0){
                    dano = 0;
                }
                else{
                    pvBretao = pvBretao - dano;
                }
                System.out.println("Rodada "+ rodada);
                System.out.println("GLADIADOR GREGO ATACA \n");
                System.out.println("Ataque Gladiador Grego: " + ataGrego); 
                System.out.println("Defesa Gladiador Bretão: " + defBretao);
                System.out.println("Dano: " + dano);
                System.out.println("Pontos de Vida Bretão: "+ pvBretao +"\n\n");
                return pvBretao;
        }

        else{
                dano = ataBretao - defGrego;

                if(dano <= 0){
                    dano = 0;
                }
                else{
                    pvGrego = pvGrego - dano;
                }
                System.out.println("Rodada "+ rodada);
                System.out.println("GLADIADOR BRETÃO ATACA \n");
                System.out.println("Ataque Gladiador Bretão: " + ataBretao); 
                System.out.println("Defesa Gladiador Grego: " + defGrego);
                System.out.println("Dano: " + dano);
                System.out.println("Pontos de Vida Bretão: "+ pvGrego +"\n\n");
                return pvGrego;
        }          
        
    }
}
