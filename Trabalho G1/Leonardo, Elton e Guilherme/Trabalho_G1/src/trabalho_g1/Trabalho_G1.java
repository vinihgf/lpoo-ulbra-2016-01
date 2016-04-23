package trabalho_g1;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author LEONARDO GIULIANE / ELTON GIOVANE / GUILHERME PURPER 
 */
public class Trabalho_G1 {

  public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        Caixa caixa = new Caixa();
        Usuario_Banco usuario_banco = new Usuario_Banco();
        
        int menu = 0, menuBanco, saque, validacao = 0;
        String senha;
    
        while(menu != 3){
        
            do{
                
                System.out.println("               BANCO CENTRAL              \n");
                System.out.println("          DIGITE 1 - USÚARIO BANCO          ");
                System.out.println("          DIGITE 2 - CLIENTE                ");
                System.out.println("          DIGITE 3 - SAIR                   ");
                menu = input.nextInt();
            
                switch (menu) {
                
                    case 1:
                    
                        System.out.print("\n Informe a senha para ter acesso a tela de administração: ");
                        senha = input.next();
                        
                        validacao = caixa.testeSenha(senha);
                        
                        if (validacao == 1)
                        {
                        
                            do{
                            
                                System.out.println("\n                                          ");
                                System.out.println("          DIGITE 1 - REPOR CÉLULAS          ");
                                System.out.println("          DIGITE 2 - VISUALIZAR CAIXA       ");
                                System.out.println("          DIGITE 3 - SAIR                   ");
                                menuBanco = input.nextInt();
                            
                                if ( menuBanco == 1 ){
                            
                                    System.out.println("\nDigite o número de cédulas que deseja repor! \n");
                                    
                                    System.out.print("\n Repor nota de 50: ");
                                    caixa.cinquenta = usuario_banco.reposicaoNotasCinquenta(caixa.cinquenta);
                                    
                                    System.out.print("\n Repor nota de 20: ");
                                    caixa.vinte = usuario_banco.reposicaoNotasVinte(caixa.vinte);
                            
                                    System.out.print("\n Repor nota de 10: ");
                                    caixa.dez = usuario_banco.reposicaoNotasDez(caixa.dez);
                                    
                                    System.out.print("\n Repor nota de 5: ");
                                    caixa.cinco = usuario_banco.reposicaoNotasCinco(caixa.cinco);
                                    
                                    System.out.print("\n Repor nota de 2: ");
                                    caixa.dois = usuario_banco.reposicaoNotasDois(caixa.dois);
                                    
                                } else if( menuBanco == 2 ){
                            
                                    usuario_banco.visualizar(caixa.cinquenta, caixa.vinte, caixa.dez, caixa.cinco, caixa.dois);
                            
                                } else if( menuBanco == 3 ){
                            
                                    System.out.println("------------------------------------------------------  ");
                                    System.out.println("                        SAINDO                          ");
                                    System.out.println("------------------------------------------------------  ");
                            
                                } else {
                                    
                                    System.out.println("------------------------------------------------------  ");
                                    System.out.println("                      MENU INVÁLIDO                     ");
                                    System.out.println("------------------------------------------------------  ");
                                    
                                }
                                
                            } while (menuBanco != 3);
                        
                        } else {
                            
                            System.out.println("------------------------------------------  ");
                            System.out.println("               SENHA INVÁLIDA               ");
                            System.out.println("------------------------------------------\n");
                            
                        }  
                
                    break;
                    case 2:
                       
                        System.out.println("\n ------------------------------------------------- ");
                        Cliente cliente = new Cliente(caixa.cinquenta, caixa.vinte, caixa.dez, caixa.cinco, caixa.dois);
                        cliente.imprimirCedulas();
                        System.out.println(" ------------------------------------------------- ");
                        
                        if ((caixa.cinquenta != 0) || (caixa.vinte != 0) || (caixa.dez != 0) || (caixa.cinco != 0) || (caixa.dois != 0))
                        {
                            
                            System.out.print("\n Digite o valor de saque: ");
                            saque = input.nextInt();
                        
                            System.out.println("\n --------------------------------------- ");
                            System.out.println("                  SAQUE                  \n");
                            
                            while (saque != 0){
                                System.out.println(saque);
                                if (saque >= 50 && caixa.cinquenta > 0){
                                    
                                    saque = cliente.descontarSaque(saque, 50);
                                    caixa.cinquenta = cliente.descontarCedula(caixa.cinquenta, 50);
                                    
                                } else if (saque >= 20 && caixa.vinte > 0){
                                    saque = cliente.descontarSaque(saque, 20);
                                    caixa.vinte = cliente.descontarCedula(caixa.vinte, 20);
                                    
                                } else if (saque >= 10 && caixa.dez > 0){
                                    
                                    saque = cliente.descontarSaque(saque, 10);
                                    caixa.dez = cliente.descontarCedula(caixa.dez, 10);
                                    
                                } else if ((saque >= 5  && caixa.cinco > 0) && (((saque % 2) != 0) || (saque > 9))){
                                    
                                    saque = cliente.descontarSaque(saque, 5);
                                    caixa.cinco = cliente.descontarCedula(caixa.cinco, 5);
                                    
                                } else if (saque >= 2  && caixa.dois > 0){
                                    
                                    saque = cliente.descontarSaque(saque, 2);
                                    caixa.dois = cliente.descontarCedula(caixa.dois, 2);
                                    
                                } else {
                    
                                    System.out.println("        IMPOSSÍVEL REALIZAR SAQUE DESTE VALOR           ");
                    
                                    caixa.cinquenta = cliente.devolverCedulas(caixa.cinquenta, 50);
                                    caixa.vinte = cliente.devolverCedulas(caixa.vinte, 20);
                                    caixa.dez = cliente.devolverCedulas(caixa.dez, 10);
                                    caixa.cinco = cliente.devolverCedulas(caixa.cinco, 5);
                                    caixa.dois = cliente.devolverCedulas(caixa.dois, 2);
                                    
                                    saque = 0;
                    
                                }
                                 
                            }
                            
                            cliente.imprimirCedulasDescontadas();
                            
                            System.out.println(" --------------------------------------- \n");
                        }
                        
                    break;
                    case 3:
                       
                        System.out.println("\n ------------------------------------------------- ");
                        System.out.println("                      SAINDO...                     ");
                        System.out.println(" ----------------------------------------------- ");
                        
                    break;
                    default:
                    
                        System.out.println("------------------------------------------  ");
                        System.out.println("               MENU INVÁLIDO                ");
                        System.out.println("------------------------------------------\n");
                    
                    break;
                }
                
            } while (menu != 1 && menu != 2 && menu != 3);
            
        }
        
    }
    
}
