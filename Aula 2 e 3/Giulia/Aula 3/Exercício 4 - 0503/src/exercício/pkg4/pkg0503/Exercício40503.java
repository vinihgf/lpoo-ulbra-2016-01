
package exercício.pkg4.pkg0503;


public class Exercício40503 {

    public static void main(String[] args) {

        Estoque estoque1 = new Estoque();
        estoque1.nome = "Impressora Jato de Tinta";
            estoque1.qtdAtual = 13;
            estoque1.qtdMinima = 6;
            estoque1.mudarNome("Impressora Laser");
            estoque1.mudarQtdMinima(5);
            estoque1.darBaixa(5);
    
            System.out.println(estoque1.mostra());
            System.out.println("Necessidade de reposição: " + estoque1.precisaRepor());
            
        Estoque estoque2 = new Estoque();
            estoque2.nome = "Monitor LCD 17 polegadas";
            estoque2.qtdAtual = 11;
            estoque2.qtdMinima = 13;
            estoque2.repor(7);
            estoque2.darBaixa(05); 
            
            System.out.println(estoque2.mostra());
            System.out.println("Necessidade de reposição: " + estoque2.precisaRepor());
                       
            
        Estoque estoque3 = new Estoque();
            estoque3.nome = "Mouse";
            estoque3.qtdAtual = 6;
            estoque3.qtdMinima = 7;
    
            System.out.println(estoque3.mostra());
            System.out.println("Necessidade de reposição: " + estoque3.precisaRepor());  
    }
    
}
