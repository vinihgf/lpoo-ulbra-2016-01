/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg1_lpoo;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class TG1_LPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Caixa caixa = new Caixa();
        Administrador admin = new Administrador();
        caixa.notas50 = 10;
        caixa.notas20 = 10;
        caixa.notas10 = 10;
        caixa.notas5 = 10;
        caixa.notas2 = 10;
        
        Scanner input = new Scanner(System.in); // scanner
        
        int operacao = 0, menu, valorSaque;
        boolean validaSenha;
        String senha;
    
        while(operacao != 3){        
            do{                
                System.out.println("===================================");
                System.out.println("    << Tela Inicial do Banco >>    ");
                System.out.println("      (1) - Administrador          ");
                System.out.println("      (2) - Cliente                ");
                System.out.println("      (3) - Finalizar Sistema      ");
                System.out.println("===================================");
                operacao = input.nextInt();
            
                switch (operacao) {                
                    case 1:                    
                        System.out.println("===================================");
                        System.out.println("         << Autenticação >>       ");
                        System.out.print("  Digite sua senha: ");
                        senha = input.next();
                        validaSenha = caixa.validarSenha(senha);
                        
                        if (validaSenha == true)
                        {                        
                            do{                            
                                System.out.println("===================================");
                                System.out.println("        << Administração >>        ");
                                System.out.println("   (1) - Repor Cédulas             ");
                                System.out.println("   (2) - Consultar Total em Caixa  ");
                                System.out.println("   (3) - Deslogar                  ");
                                System.out.println("===================================");
                                menu = input.nextInt();
                            
                                if ( menu == 1 ){
                                    System.out.println("===================================");
                                    System.out.println("     << Reposição de Cédulas >>    ");
                                    
                                    System.out.print("\n Cédulas de R$ 50,00: ");
                                    caixa.notas50 = admin.reporNotas50(caixa.notas50);
                                    
                                    System.out.print("\n Cédulas de R$ 20,00: ");
                                    caixa.notas20 = admin.reporNotas20(caixa.notas20);
                            
                                    System.out.print("\n Cédulas de R$ 10,00: ");
                                    caixa.notas10 = admin.reporNotas10(caixa.notas10);
                                    
                                    System.out.print("\n Cédulas de R$ 5,00: ");
                                    caixa.notas5 = admin.reporNotas5(caixa.notas5);
                                    
                                    System.out.print("\n Cédulas de R$ 2,00: ");
                                    caixa.notas2 = admin.reporNotas2(caixa.notas2);                                    
                                } 
                                
                                else if( menu == 2 ){                            
                                    admin.consultarTotalEmCaixa(caixa.notas50, caixa.notas20, caixa.notas10, caixa.notas5, caixa.notas2);
                                }
                                
                                else if( menu == 3){
                                    System.out.println("===================================");
                                    System.out.println("<< Voltando para tela inicial... >>");
                                    System.out.println("===================================");
                                }
                                
                                else {
                                    System.out.println("===================================");
                                    System.out.println("      << Operação Inválida >>      ");
                                    System.out.println("===================================");                                    
                                }
                                
                            } while (menu != 3);
                        
                        }
                        
                        else {                            
                            System.out.println("===================================");
                            System.out.println("       << Senha Inválida >>        ");
                            System.out.println("===================================");                            
                        }
                    break;
                    
                    case 2:                       
                        System.out.println("===================================");
                        Cliente cliente = new Cliente(caixa.notas50, caixa.notas20, caixa.notas10, caixa.notas5, caixa.notas2);
                        cliente.imprimirCedulasDisponiveis();
                        
                        System.out.println("===================================");
                        
                        if ((caixa.notas50 != 0) || (caixa.notas20 != 0) || (caixa.notas10 != 0) || (caixa.notas5 != 0) || (caixa.notas2 != 0))
                        {                            
                            System.out.println("===================================");
                            System.out.println("            << Saque >>            ");
                            System.out.println("===================================");
                            System.out.print("\n Informe o valor de saque desejado: ");
                            valorSaque = input.nextInt();
                        
                            System.out.println("===================================");
                            System.out.println(" << Saque Realizado com Sucesso >> ");
                            System.out.println("===================================");
                            
                            // retira cedulas e retira o dinheiro do caixa
                            while (valorSaque != 0){                    
                                if ((caixa.notas50 >= (valorSaque / 50)) && (valorSaque >= 50)){                                    
                                    caixa.notas50 = cliente.retirarCedulas(caixa.notas50, 50);
                                    valorSaque = cliente.realizarSaque(valorSaque, 50);                                    
                                }
                                
                                else if ((caixa.notas20 >= (valorSaque / 20)) && (valorSaque >= 20)){
                                    caixa.notas20 = cliente.retirarCedulas(caixa.notas20, 20);
                                    valorSaque = cliente.realizarSaque(valorSaque, 20);
                                                                        
                                }
                                
                                else if ((caixa.notas10 >= (valorSaque / 10)) && (valorSaque >= 10)){                                    
                                    caixa.notas10 = cliente.retirarCedulas(caixa.notas10, 10);
                                    valorSaque = cliente.realizarSaque(valorSaque, 10);                                  
                                }
                                
                                else if ((caixa.notas5 >= (valorSaque / 5)) && (valorSaque >= 5) 
                                        && (((valorSaque % 2) != 0) || (valorSaque > 9))){                                    
                                    caixa.notas5 = cliente.retirarCedulas(caixa.notas5, 5);
                                    valorSaque = cliente.realizarSaque(valorSaque, 5);
                                }
                                
                                else if ((caixa.notas2 >= (valorSaque / 2)) && (valorSaque >= 2)){
                                    caixa.notas2 = cliente.retirarCedulas(caixa.notas2, 2);
                                    valorSaque = cliente.realizarSaque(valorSaque, 2);
                                }
                                
                                else {                    
                                    System.out.println("=============================================");
                                    System.out.println(" << Não é possível realizar esta operação >> ");
                                    System.out.println("=============================================");
                                    
                                    // devolve cedulas retiradas anteriormente
                                    caixa.notas50 = cliente.devolverCedulas(caixa.notas50, 50);
                                    caixa.notas20 = cliente.devolverCedulas(caixa.notas20, 20);
                                    caixa.notas10 = cliente.devolverCedulas(caixa.notas10, 10);
                                    caixa.notas5 = cliente.devolverCedulas(caixa.notas5, 5);
                                    caixa.notas2 = cliente.devolverCedulas(caixa.notas2, 2);
                                    
                                    valorSaque = 0; // zera o valor de saque
                                }
                                 
                            }
                            cliente.imprimirSaque();
                            System.out.println("===================================");
                        }                        
                    break;
                    
                    case 3:
                        System.out.println("===================================");
                        System.out.println("      << Sistema Finalizado >>     ");
                        System.out.println("===================================");                      
                    break;
                    
                    default:                    
                        System.out.println("===================================");
                        System.out.println("      << Operação Inválida >>      ");
                        System.out.println("===================================");                   
                    break;
                } 
                
            } while (operacao != 1 && operacao != 2 && operacao != 3);
            
        }
        
    }
    
}