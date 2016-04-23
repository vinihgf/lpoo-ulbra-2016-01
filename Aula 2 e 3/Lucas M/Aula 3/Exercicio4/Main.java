
package Exercicio4;

 
public class Main {
    public static void main (String[] args)
    {
        Estoque estoque1 = new Estoque();
        estoque1.nome = "Impressora Jato de Tinta";
        estoque1.qtdAtual = 13;
        estoque1.qtdMinima = 6;
       
        Estoque estoque2 = new Estoque();
        estoque2.nome= "Monitor LCD 17 Polegadas";
        estoque2.qtdAtual= 11;
        estoque2.qtdMinima= 13;
       
        Estoque estoque3 = new Estoque();
        estoque3.nome = "Mouse";
        estoque3.qtdAtual = 6;
        estoque3.qtdMinima = 2;
       
        System.out.println(estoque1.qtdAtual);
        estoque1.darBaixa(5);       
        System.out.println(estoque1.qtdAtual);
       
        System.out.println(estoque2.qtdAtual);
        estoque2.repor(7);       
        System.out.println(estoque2.qtdAtual);
       
        System.out.println(estoque3.qtdAtual);
        estoque3.darBaixa(4);       
        System.out.println(estoque3.qtdAtual);
               
        estoque1.precisaRepor();       
        estoque2.precisaRepor();
        estoque3.precisaRepor();
       
        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());
    }
}
