package Exercicios;

import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CL_Estoque objEstoque1 = new CL_Estoque();
        CL_Estoque objEstoque2 = new CL_Estoque();
        CL_Estoque objEstoque3 = new CL_Estoque();
        
        objEstoque1.nome = "Impressora Jato de Tinta";
        objEstoque1.qtdAtual = 13;
        objEstoque1.qtdMin = 6;
        
        objEstoque2.nome = "Monitor LCD 17''";
        objEstoque2.qtdAtual = 11;
        objEstoque2.qtdMin = 13;

        objEstoque3.nome = "Mouse";
        objEstoque3.qtdAtual = 6;
        objEstoque3.qtdMin = 2;


        objEstoque1.darBaixa(5);
        objEstoque2.repor(7);
        objEstoque3.darBaixa(4);
        
        System.out.println(objEstoque1.mostra());
        System.out.println("\n" + objEstoque2.mostra());
        System.out.println("\n" + objEstoque3.mostra());
        
        if(objEstoque1.precisaRepor())
        {
            System.out.println("Necessita repor!");
        }
        else 
        {
            System.out.println("NÃO necessita repor!");
        }
        if(objEstoque2.precisaRepor())
        {
            System.out.println("Necessita repor!");
        }
        else
        {
            System.out.println("NÃO necessita repor!");
        }
        if(objEstoque3.precisaRepor())
        {
            System.out.println("Necessita repor!");
        }
        else
        {
            System.out.println("NÃO necessita repor!");
        }
    }
}
