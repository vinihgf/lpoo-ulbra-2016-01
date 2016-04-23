package exercicio_5;
import java.util.Scanner;
/**
 *
 * @author leogi
 */
public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s; 
        int x, menu;
                
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        Casa casa1 = new Casa();
        Edificio ed1 = new Edificio();
        Porta portaA = new Porta();
        Porta portaB = new Porta();
        Porta portaC = new Porta();
        Porta portaD = new Porta();
        Porta portaE = new Porta();
        Porta portaF = new Porta();

        
        do{
            System.out.println("0-Sair \n1-Porta \n2-Casa \n3-Edíficio: \n");
            menu = input.nextInt();
        }while(menu != 0 && menu != 1 && menu != 2 && menu != 3);
        
        if (menu == 1)
        {
            porta1.aberta = true;
            if (porta1.aberta  == true){
                porta1.abre();

            }
            else{
                porta1.fecha();
            }
            
            s = "Azul";
            porta1.pinta(s);

            porta1.dimensaoX = 10;

            porta1.dimensaoY = 20;

            porta1.dimensaoZ = 30;

            System.out.println("True = Porta Aberta / False = Porta Fechada: \n"+porta1.estaAberta());
        }
        
        else if (menu == 2){
            s = "Branco";
            casa1.pinta(s);
            
            casa1.porta1.aberta = false;
            casa1.porta2.aberta = true;
            casa1.porta3.aberta = false;
                
            if (casa1.porta1.aberta  == true){
                casa1.porta1.abre();
            }
            else{
                casa1.porta1.fecha();
            }
            
            if (casa1.porta2.aberta == true){
                casa1.porta2.abre();
            }
            else{
                casa1.porta2.abre();
            }
            
            if (casa1.porta1.aberta  == true){
                casa1.porta3.abre();                
            }
            else{
                casa1.porta3.abre(); 
            }
            
            s = "Azul";
            casa1.porta1.pinta(s);
            s = "Preto";
            casa1.porta2.pinta(s);
            s = "Branco";
            casa1.porta3.pinta(s);

            casa1.porta1.dimensaoX = 11;
            casa1.porta2.dimensaoX = 12;
            casa1.porta3.dimensaoX = 13;

            casa1.porta1.dimensaoY = 21;
            casa1.porta2.dimensaoY = 22;
            casa1.porta3.dimensaoY = 23;
            
            casa1.porta1.dimensaoZ = 31;
            casa1.porta2.dimensaoZ = 32;
            casa1.porta3.dimensaoZ = 33;
            
            System.out.println("Quantidade de portas Abertas" + casa1.quantasPortasEstaoAbertas());
            System.out.println("Total de Portas" + casa1.totalDePortas());
            
        }
        
        else if (menu==3){
            s="Preto";
            ed1.pinta(s);
            
            portaA.aberta = false;
            portaB.aberta = true;
            portaC.aberta = false;
            portaD.aberta = false;
            portaE.aberta = true;
            portaF.aberta = false;
            
            s = "Azul";
            portaA.pinta(s);
            s = "Preto";
            portaB.pinta(s);
            s = "Branco";
            portaC.pinta(s);
            s = "Azul";
            portaD.pinta(s);
            s = "Preto";
            portaE.pinta(s);
            s = "Branco";
            portaF.pinta(s);

            portaA.dimensaoX = 11;
            portaB.dimensaoX = 12;
            portaC.dimensaoX = 13;
            portaD.dimensaoX = 14;
            portaE.dimensaoX = 15;
            portaF.dimensaoX = 16;

            portaA.dimensaoY = 21;
            portaB.dimensaoY = 22;
            porta3.dimensaoY = 23;
            portaD.dimensaoY = 24;
            portaE.dimensaoY = 25;
            portaF.dimensaoY = 26;
            
            portaA.dimensaoZ = 31;
            portaB.dimensaoZ = 32;
            portaC.dimensaoZ = 33;
            portaD.dimensaoZ = 34;
            portaE.dimensaoZ = 35;
            portaF.dimensaoZ = 36;
            
            ed1.adicionarPorta(portaA, portaB, portaC, portaD, portaE, portaF);
            
            System.out.println("Quantidade de portas Abertas: " + ed1.quantasPortasEstaoAbertas());
            System.out.println("Total de Portas: " + ed1.totalPortas());
            
            ed1.adicionarAndar();
            System.out.println("Total de Andares: " + ed1.totalAndares());
            
        }
        
    }
    
}
