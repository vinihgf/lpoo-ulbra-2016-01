package exercicio04;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int qtd = 0, menu;
        int atividade = 1;
        String name;
        
        Scanner ler = new Scanner(System.in);
        
        Estoque estoque = new Estoque();
        
        Estoque estoque1 = new Estoque();
        
        estoque1.nome = "Impressora jato de tinta";
        estoque1.qtdAtual = 13;
        estoque1.qtdMinima = 6;
                
        Estoque estoque2 = new Estoque();
        
        estoque2.nome = "Monitor LCD 17 polegadas";
        estoque2.qtdAtual = 11;
        estoque2.qtdMinima = 13;
        
        Estoque estoque3 = new Estoque();
        
        estoque3.nome = "Mouse";
        estoque3.qtdAtual = 6;
        estoque3.qtdMinima = 2;
        
        while (atividade != 0){
            
            System.out.printf("MENU \n");
            System.out.printf("(0) Sair\n");
            System.out.printf("(1) Repor estoque \n");
            System.out.printf("(2) Dar baixa no estoque \n");
            System.out.printf("(3) Mostrar estoque \n");
            System.out.printf("(4) Precisa repor estoque \n");
            System.out.printf("(5) Mudar nome do produto \n");
            System.out.printf("(6) Mudar quantidade mínima \n");
            atividade = ler.nextInt();
            
            if (atividade == 0){
                              
                System.out.printf("SAIU\n"); }
              
            else if (atividade == 1){
            
                System.out.printf("repor estoque\n");
                System.out.printf("(1) " + estoque1.nome + "\n");
                System.out.printf("(2) " + estoque2.nome + "\n");
                System.out.printf("(3) " + estoque3.nome + "\n");
                menu = ler.nextInt();
            
                System.out.printf(" \n");
            
                if (menu == 1){
                    
                    System.out.printf("Informe a quantidade que deseja incluir no estoque!\n");
                    qtd = ler.nextInt();
                    System.out.printf(" \n");
                    estoque1.repor(qtd);}
                else if (menu == 2){
                    
                    System.out.printf("Informe a quantidade que deseja incluir no estoque! \n");
                    qtd = ler.nextInt();
                    System.out.printf(" \n");
                    estoque2.repor(qtd);}
                else if (menu == 3){
                    
                    System.out.printf("Informe a quantidade que deseja incluir no estoque! \n");
                    qtd = ler.nextInt();
                    System.out.printf(" \n");
                    estoque3.repor(qtd);}
                else {
                    
                   System.out.printf("numero invalido!\n");
                   }
                    } 
                else if (atividade == 2){
            
                System.out.printf("dar baixa no estoque\n");
                System.out.printf("(1) " + estoque1.nome + "\n");
                System.out.printf("(2) " + estoque2.nome + "\n");
                System.out.printf("(3) " + estoque3.nome + "\n");
                menu = ler.nextInt();
                System.out.printf(" \n ");
                
                if (menu == 1){
                    
                    System.out.printf("Informe a quatidade que deseja dar baixa!\n");
                    qtd = ler.nextInt();
                            
                    if (qtd <= estoque1.qtdAtual){
                           estoque1.darBaixa(qtd);    }
                    else {
                            
                       System.out.printf("Estoque insuficiente\n");
                        }
                        }
                    else if (menu == 2){
                            
                    System.out.printf("Informe a quatidade que deseja dar baixa\n");
                    qtd = ler.nextInt();
                    
                    if (qtd <= estoque2.qtdAtual){
                        estoque2.darBaixa(qtd);} 
                    else {
                       
                        System.out.printf("estoque insuficiente\n");
                       
                    }
                            
                } else if (menu == 3){
                          
                    System.out.printf("Informe a quatidade que deseja dar baixa\n");
                    qtd = ler.nextInt();
                    
                    if (qtd <= estoque3.qtdAtual){
                            
                        estoque3.darBaixa(qtd);}
                    else {
                            
                        System.out.printf("estoque insuficiente\n");
                        
                    }
                    }
                   else {
                   
                    System.out.printf("Numero invalido\n");  
                }
                }
                else if (atividade == 3){
                 
                System.out.printf(" --------------- \n");
                System.out.printf("Exibir estoque \n");
                System.out.printf(" (1) " + estoque1.nome + "\n");
                System.out.printf(" (2) " + estoque2.nome + "\n");
                System.out.printf(" (3) " + estoque3.nome + "\n");
                System.out.printf(" --------------- \n");
                menu = ler.nextInt();
                
                if (menu == 1)
                {
                    
                    System.out.println(estoque1.mostra());
                    
                } 
                else if (menu == 2)
                {
                    
                    System.out.println(estoque2.mostra());
                    
                } 
                else if (menu == 3)
                {
                    
                    System.out.println(estoque3.mostra());
                    
                }
                else
                {
                    
                   System.out.printf("Numeo invalido\n");
                    
                }
                
            }
                else if (atividade == 4)
                {
            
                System.out.printf("Precisa repor estoque\n");
                System.out.printf("(1) " + estoque1.nome + "\n");
                System.out.printf("(2) " + estoque2.nome + "\n");
                System.out.printf("(3) " + estoque3.nome + "\n");
                menu = ler.nextInt();
                System.out.printf(" \n ");
                
                if (menu == 1)
                {
                    
                    System.out.printf("--------\n");
                    System.out.println("         " + estoque1.precisaRepor() + "      ");
                    System.out.printf("--------\n");
                    
                }
                else if (menu == 2)
                {
                    
                    System.out.printf("-----------\n");
                    System.out.println("         " + estoque2.precisaRepor() + "      ");
                    System.out.printf("------------\n");
                    
                } 
                else if (menu == 3)
                {
                    
                    System.out.printf("--------------\n");
                    System.out.println("         " + estoque3.precisaRepor() + "      ");
                    System.out.printf("---------------\n");
                    
                } 
                else
                {
                   
                    System.out.printf("Numero invalido\n");           
                }
            
            }
                else if (atividade == 5)
                {
            
                System.out.printf("MUDAR NOME DE PRODUTO \n");
                System.out.printf("(1) " + estoque1.nome + "\n");
                System.out.printf("(2) " + estoque2.nome + "\n");
                System.out.printf("(3) " + estoque3.nome + "\n");
                menu = ler.nextInt();
            
                if (menu == 1)
                {
                    
                    System.out.printf("Novo nome: ");
                    name = ler.next();
                    
                    estoque1.mudarNome(name);
                    
                }
                else if (menu == 2)
                {
                    
                    System.out.printf("Novo nome: ");
                    name = ler.next();
                    
                    estoque2.mudarNome(name);
                    
                }
                else if (menu == 3)
                {
                    
                    System.out.printf("Novo nome: ");
                    name = ler.next();
                    
                    estoque3.mudarNome(name);
                    
                } 
                else
                {
                    
                    System.out.printf("Numero invalido\n");
                                        
                }
            
            } 
                else if (atividade == 6)
                {
                System.out.printf("Alterar quantidade minima\n");
                System.out.printf("(1) " + estoque1.nome + "\n");
                System.out.printf("(2) " + estoque2.nome + "\n");
                System.out.printf("(3) " + estoque3.nome + "\n");
                menu = ler.nextInt();
                System.out.printf("\n");
                
                if (qtd >= 0)
                {
                    if (menu == 1)
                    {   
                        System.out.printf("Nova quantidade mínima:");
                        qtd = ler.nextInt();
            
                        System.out.printf("\n");
                
                       estoque1.mudarQtdMinima(qtd);  
                        
                    }
                    else if (menu == 2)
                    {   
                       System.out.printf("Nova quantidade mínima:");
                       qtd = ler.nextInt();
            
                       System.out.printf("\n");
                       
                       estoque2.mudarQtdMinima(qtd);
                        
                    }
                    else if (menu == 3)
                    {  
                       System.out.printf("Nova quantidade mínima: ");
                       qtd = ler.nextInt();
            
                       System.out.printf("\n");
                       
                       estoque3.mudarQtdMinima(qtd);
                        
                    } 
                    else
                    {
                          System.out.printf("Numero invalido\n"); 
                    }
                    } 
                else
                {
                    System.out.printf("Valor invalido\n");
                }
                
            } 
                else
                {
                System.out.printf("Numero invalido\n"); 
    }
    
}
    }
}
