package exercicios_aula2_4;

import java.util.Scanner;

public class Exercicios_Aula2_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CL_Estoque objEstoque = new CL_Estoque();
        int escolha = 0;
        int qtd;
        
        CL_Estoque objEstoque1 = new CL_Estoque();
        objEstoque1.nome = "Impressora Jato de Tinta";
        objEstoque1.qtdAtual = 13;
        objEstoque1.qtdMinima = 6;
        
        CL_Estoque objEstoque2 = new CL_Estoque();
        objEstoque2.nome = "Monitor LCD 17";
        objEstoque2.qtdAtual = 11;
        objEstoque2.qtdMinima = 13;
        
        CL_Estoque objEstoque3 = new CL_Estoque();
        objEstoque3.nome = "Mouse";
        objEstoque3.qtdAtual = 6;
        objEstoque3.qtdMinima = 2;

        objEstoque1.darBaixa(5);
        objEstoque2.repor(7);
        objEstoque3.darBaixa(4);
        
        objEstoque1.precisaRepor();
        if(objEstoque1.precisaRepor() == true)
        {
            System.out.println("Precisa repor o estoque de " + objEstoque1.nome);
        }
        else
        {
            System.out.println("Não precisa repor o estoque de " + objEstoque1.nome);
        }
        
        objEstoque2.precisaRepor();
        if(objEstoque2.precisaRepor() == true)
        {
            System.out.println("Precisa repor o estoque de " + objEstoque2.nome);
        }
        else
        {
            System.out.println("Não precisa repor o estoque de " + objEstoque2.nome);
        }
        
        objEstoque3.precisaRepor();
        if(objEstoque3.precisaRepor() == true)
        {
            System.out.println("Precisa repor o estoque de " + objEstoque3.nome);
        }
        else
        {
            System.out.println("Não precisa repor o estoque de " + objEstoque3.nome);
        }
        
        objEstoque1.mostra();
        System.out.println(objEstoque1.mostra());
        
        objEstoque2.mostra();
        System.out.println(objEstoque2.mostra());
        
        objEstoque3.mostra();
        System.out.println(objEstoque3.mostra());
    }
}