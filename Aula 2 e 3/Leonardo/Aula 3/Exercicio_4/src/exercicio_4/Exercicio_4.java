package exercicio_4;
import java.util.Scanner;

/**
 *
 * @author leogi
 */
public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int var1, var2, qtd = 0, menu;
        
        Estoque est1 = new Estoque();
        est1.nome = "Impressora";
        est1.qtdAtual = 13;
        est1.qtdMinima = 6;
        
        Estoque est2 = new Estoque();
        est2.nome = "Monitor";
        est2.qtdAtual = 11;
        est2.qtdMinima = 13;
        
        Estoque est3 = new Estoque();
        est3.nome = "Mouse";
        est3.qtdAtual = 6;
        est3.qtdMinima = 2;
        
        do{
            var1 = 0;
            var2 = 0;
            qtd = 0;
            menu = 0;
            do{
                System.out.println("0-Sair \n1-Repor \n2-Dar Baixa \n3-Mostra \n4-Precisa Repor \n5-Mostrar tudo");
                menu = input.nextInt();
            }while(menu != 0 && menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5);

            //REPOR
            if (menu == 1){
                do{
                    System.out.println("Repor estoque? 1/2 \n");
                    var1 = input.nextInt();
                } while(var1 != 1 && var1 != 2);
                if (var1 == 1){
                    do{
                        System.out.println("Repor estoque do 1, 2 ou 3? \n");
                        var2 = input.nextInt();
                    } while(var2 != 1 && var2 != 2 && var2 != 3); 
                    if (var2 == 1){
                        System.out.println("Quantidade para repor? \n");
                        qtd = input.nextInt();
                        est1.repor(qtd);
                    }
                    else if (var2 == 2){
                        System.out.println("Quantidade para repor? \n");
                        qtd = input.nextInt();
                        est2.repor(qtd);
                    }
                    else{
                        System.out.println("Quantidade para repor? \n");
                        qtd = input.nextInt();
                        est3.repor(qtd);
                    }

                }
            }
            //REPOR

            //BAIXA
            else if (menu == 2){
                do{
                    System.out.println("Dar baixa no estoque? 1/2 \n");
                    var1 = input.nextInt();
                } while(var1 != 1 && var1 != 2);
                if (var1 == 1){
                    do{
                        System.out.println("Dar baixa no estoque do 1, 2 ou 3? \n");
                        var2 = input.nextInt();
                    } while(var2 != 1 && var2 != 2 && var2 != 3); 
                    if (var2 == 1){
                        do{
                            System.out.println("Quantidade para dar baixa? \n");
                            qtd = input.nextInt();
                            est1.darBaixa(qtd);
                        }while(qtd > est1.qtdAtual);
                    }
                    else if (var2 == 2){
                        do{
                            System.out.println("Quantidade para dar baixa? \n");
                            qtd = input.nextInt();
                            est2.darBaixa(qtd);
                        }while(qtd > est2.qtdAtual);
                    }
                    else{
                        do{
                            System.out.println("Quantidade para dar baixa? \n");
                            qtd = input.nextInt();
                            est3.darBaixa(qtd);
                        }while(qtd > est2.qtdAtual);
                    }

                }
            }
            //BAIXA

            //MOSTRAR
            else if(menu == 3){
                do{
                    System.out.println("Mostrar estoque do 1, 2 ou 3? \n");
                    var2 = input.nextInt();
                } while(var2 != 1 && var2 != 2 && var2 != 3); 
                if (var2 == 1){
                    System.out.println(est1.mostra());
                }
                else if (var2 == 2){
                    System.out.println(est2.mostra());
                }
                else{
                    System.out.println(est3.mostra());
                }

            }
            //MOSTRAR

            //PRECISA REPOR
            else if (menu == 4){
                do{
                    System.out.println("Precisa repor estoque do 1, 2 ou 3? \n");
                    var2 = input.nextInt();
                } while(var2 != 1 && var2 != 2 && var2 != 3); 
                if (var2 == 1){
                    System.out.println(est1.precisaRepor());
                }
                else if (var2 == 2){
                    System.out.println(est2.precisaRepor());
                }
                else{
                    System.out.println(est3.precisaRepor());
                }
            }
            //PRECISA REPOR
        
            else if (menu == 5){
                System.out.println(est1.mostra());
                System.out.println(est2.mostra());
                System.out.println(est3.mostra());
            }
        }while(menu!=0);
                
    }
        
}
