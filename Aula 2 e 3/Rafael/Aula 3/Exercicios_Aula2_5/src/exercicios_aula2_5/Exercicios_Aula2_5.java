package exercicios_aula2_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios_Aula2_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CL_Porta objPorta = new CL_Porta();
        
        objPorta.abre();
        objPorta.fecha();
        objPorta.pinta("vermelha");
        objPorta.pinta("azul");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.estaAberta();
        
        System.out.println("Cor da porta: " + objPorta.cor);
        System.out.println("As dimensões da porta são: " + objPorta.dimensaoX + " por " + objPorta.dimensaoY + " por " + objPorta.dimensaoZ);
        System.out.println("A porta está aberta? ");
        if(objPorta.estaAberta())
        {
            System.out.println("Sim!");
        }
        else
        {
            System.out.println("Não!");
        }
        
        //Casa
        CL_Casa objCasa = new CL_Casa();
        
        objCasa.cor = "vermelha";
        objCasa.porta1 = true;
        objCasa.porta2 = true;
        objCasa.porta3 = false;
        
        System.out.println("Cor da casa: " + objCasa.cor);
        System.out.println("Quantas portas estão abertas? " + objCasa.quantasPortasEstaoAbertas());
        System.out.println("Quantas portas estão fechadas? " + objCasa.quantasPortasEstaoFechadas());
        
        //Edificio
        CL_Edificio objEdificio = new CL_Edificio();        
        
        objEdificio.cor = "amarelo";
        
        //andar1
        objEdificio.adicionarAndar();
        //andar2
        objEdificio.adicionarAndar();
        //andar3
        objEdificio.adicionarAndar();
        
        //porta1
        objPorta = new CL_Porta();
        objPorta.pinta("azul");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.abre();
        objEdificio.adicionarPorta(objPorta);
        
        //porta2
        objPorta = new CL_Porta();
        objPorta.pinta("vermelha");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.abre();
        objEdificio.adicionarPorta(objPorta);

        //porta3
        objPorta = new CL_Porta();
        objPorta.pinta("amarelo");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.abre();
        objEdificio.adicionarPorta(objPorta);
        
        //porta4
        objPorta = new CL_Porta();
        objPorta.pinta("magenta");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.fecha();
        objEdificio.adicionarPorta(objPorta);
        
        //porta5
        objPorta = new CL_Porta();
        objPorta.pinta("marrom");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.fecha();
        objEdificio.adicionarPorta(objPorta);
        
        //porta6
        objPorta = new CL_Porta();
        objPorta.pinta("branca");
        objPorta.dimensaoX = 3.5;
        objPorta.dimensaoY = 2;
        objPorta.dimensaoZ = 0.25;
        objPorta.abre();
        objEdificio.adicionarPorta(objPorta);
        
        System.out.println("Total de andares: " + objEdificio.totalDeAndares());
        System.out.println("Total de portas:" + objEdificio.totalDePortas());
        System.out.println("Portas abertas: " + objEdificio.quantasPortasEstaoAbertas());
    }
}