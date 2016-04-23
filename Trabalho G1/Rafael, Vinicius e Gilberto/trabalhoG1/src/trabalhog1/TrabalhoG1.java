
package trabalhog1;
import java.util.Scanner;
public class TrabalhoG1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        CL_Caixa objCaixa = new CL_Caixa(20, 40, 60, 80, 100);
        boolean sai = false;
        int vezes = 0;
        
        while(!sai)
        {
            System.out.println("\nDIGITE A OPCAO");
            System.out.println("\n1 - CLIENTE");
            System.out.println("\n2 - FUNCIONARIO");
            System.out.println("\n3 - SAIR");
            int opcao = input.nextInt();

            if(opcao == 1)
            {
                int senha, conta, agencia;
                CL_Cliente objCliente = new CL_Cliente(123,321,111);
                System.out.println("\nDIGITE A CONTA");
                conta = input.nextInt();
                System.out.println("\nDIGITE A AGENCIA");
                agencia = input.nextInt();
                System.out.println("\nDIGITE A SENHA");
                senha = input.nextInt();
                if(objCliente.validaDados(conta, agencia, senha))
                {
                    System.out.println("\nNOTAS DISPONIVEIS");
                    objCaixa.confereNota();
                    System.out.println("\nDIGITE O VALOR DO SAQUE");
                    int saque = input.nextInt();
                    if(!funcSaque(objCaixa, saque))
                    {
                        System.out.println("\nOPERACAO INDISPONIVEL");
                    }
                    else
                    {
                        vezes = 0;
                    }
                }
                else
                {
                    vezes +=1;
                    if(!objCliente.confereVezes(vezes))
                    {
                        objCliente.confereVezes(vezes);
                        if(vezes == 4)
                        {
                            vezes = 0;
                        }
                    }
                }
            }
            else if(opcao == 2)
            {
                CL_Funcionario objFunc = new CL_Funcionario();
                System.out.println("\nDIGITE A SENHA");
                String senha = input.next();
                if(objFunc.validaSenha(senha))
                {
                    funcoesFunc(objCaixa);
                }
                else
                {
                    System.out.println("\nSENHA INCORRETA");
                }
            }
            else if (opcao == 3)
            {
                sai = true;
            }
            else
            {
                System.out.println("\nOPCAO INVALIDA");
            } 
        }
    }
    
    private static void funcoesFunc(CL_Caixa objCaixa) 
    {
        Scanner input = new Scanner(System.in);
        boolean sai = false;
        while (!sai)
        {
            System.out.println("\nDIGITE A OPCAO");
            System.out.println("\n1 - VISUALIZAR TOTAIS");
            System.out.println("\n2 - REPOR NOTAS");
            System.out.println("\n3 - SAIR");
            int opcao = input.nextInt();
            
            if(opcao == 1)
            {
                objCaixa.visualizaTotais();
            }
            else if(opcao == 2)
            {
                System.out.println("\nINFORME O VALOR DA NOTA: 50, 20, 10, 5, 2");
                int valorNota = input.nextInt();
                System.out.println("\nINFORME A QUANTIDADE DE NOTAS");
                int qtdNota = input.nextInt();
                if(!objCaixa.reposicao(valorNota, qtdNota))
                {
                    System.out.println("\nNOTA INVALIDA");
                }
            }
            else if(opcao == 3)
            {
                sai = true;
            }
            else
            {
                System.out.println("\nOPCAO INVALIDA");
            }
        }
    }

    private static boolean funcSaque(CL_Caixa objCaixa, int saque) 
    {
        int qtdNec50 = 0;
        int qtdNec20 = 0;
        int qtdNec10 = 0;
        int qtdNec5 = 0;
        int qtdNec2 = 0;
        int valorAux = saque;
        
        if (saque > objCaixa.confereTotal()) 
        {
            System.out.println("SAQUE NAO REALIZADO! Valor invalido");
            return false;
        }
        else if (saque <= 0) 
        {
            System.out.println("SAQUE NAO REALIZADO! Valor invalido");
            return false;
        }
        else
        {
            int divisao = 0;
            if (valorAux >= 50) 
            {
                divisao = valorAux / 50;
                if(divisao <= objCaixa.confereCinquenta())
                {
                    qtdNec50 = divisao;
                    valorAux = valorAux % 50;
                }
                else
                {
                    if(objCaixa.confereCinquenta() > 0)
                    {   
                        divisao = objCaixa.confereCinquenta();
                        qtdNec50 = divisao;
                        valorAux = valorAux - (divisao * 50);
                    }
                }
            }
            if (valorAux >= 20) 
            {
                divisao = valorAux / 20;
                if(divisao <= objCaixa.confereVinte())
                {
                    qtdNec20 = divisao;
                    valorAux = valorAux % 20;
                }
                else
                {
                    if(objCaixa.confereVinte() > 0)
                    {   
                        divisao = objCaixa.confereVinte();
                        qtdNec20 = divisao;
                        valorAux = valorAux - (divisao * 20);
                    }
                }
            }
            if (valorAux >= 10) 
            {
                divisao = valorAux / 10;
                if(divisao <= objCaixa.confereDez())
                {
                    qtdNec10 = divisao;
                    valorAux = valorAux % 10;
                }
                else
                {
                    if(objCaixa.confereDez() > 0)
                    {   
                        divisao = objCaixa.confereDez();
                        qtdNec10 = divisao;
                        valorAux = valorAux - (divisao * 10);
                    }
                }
            }
            if (valorAux >= 5) 
            {
                divisao = valorAux / 5;
                if(divisao <= objCaixa.confereCinco())
                {
                    qtdNec5 = divisao;
                    valorAux = valorAux % 5;
                }
                else
                {
                    if(objCaixa.confereCinco() > 0)
                    {   
                        divisao = objCaixa.confereCinco();
                        qtdNec5 = divisao;
                        valorAux = valorAux - (divisao * 5);
                    }
                }
            }
            if (valorAux >= 2) 
            {
                divisao = valorAux / 2;
                if(divisao <= objCaixa.confereDois())
                {
                    qtdNec2 = divisao;
                    valorAux = valorAux % 2;
                }
                else
                {
                    if(objCaixa.confereDois() > 0)
                    {   
                        divisao = objCaixa.confereDois();
                        qtdNec2 = divisao;
                        valorAux = valorAux - (divisao * 2);
                    }
                }
            }
        }
        System.out.println("\nO valor do saque será em:");
        System.out.println("\nNotas de 50: " + qtdNec50);
        System.out.println("\nNotas de 20: " + qtdNec20);
        System.out.println("\nNotas de 10: " + qtdNec10);
        System.out.println("\nNotas de 05: " + qtdNec5);
        System.out.println("\nNotas de 02: " + qtdNec2);
        if(valorAux == 0)
        {
            objCaixa.saque(qtdNec50, qtdNec20, qtdNec10, qtdNec5, qtdNec2, saque);
            if(saque <= 50)
            {
                System.out.println("\nTA DE SACANAGEM QUE SAI DE CASA PRA SACAR ESSA MISÉRIA DE " + saque + " PILA!");
            }
            else if(saque > 50 && saque <= 150)
            {
                System.out.println("\nESSA GRANA VAI DAR PRA TOMAR UMA GELADA HEIN!");
            }
            else if(saque > 150 && saque <= 300)
            {
                System.out.println("\nCHURRASQUINHO? ME CONVIDA!");
            }
            else if(saque > 300 && saque <= 600)
            {
                System.out.println("\nVAI IR PRAS TIAS E TOMAR UMA CEVA DE 15 PILA NE?!");
            }
            if(saque > 600 && saque <= 1000)
            {
                System.out.println("\nEM TEMPOS DE CRISE, TU TA GRANDÃO HEIN, OSTENTAÇÃO!!");
            }
            if(saque > 1000)
            {
                System.out.println("\nAU!!!");
                System.out.println("\nAU!!!");
                System.out.println("\nCUIDADO COM O JAPONES DA FEDERAL!!!");
            }
        }
        else
        {
            System.out.println("\nSAQUE NAO REALIZADO. POR FAVOR CONTATE O DONO DESSA BAGAÇA!!!");
        }
        return true;
    }
}