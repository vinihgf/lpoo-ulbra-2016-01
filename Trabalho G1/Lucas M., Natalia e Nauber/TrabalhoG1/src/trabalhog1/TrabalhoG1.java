package trabalhog1;
import java.util.Scanner;

public class TrabalhoG1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //criação do scanner
        Operacoes admin = new Operacoes();
        
        int opUsuario;
        
        System.out.println("CAIXA ELETRÔNICO");
        do{
            System.out.println("\nInforme o Usuário:\n 1- Usuário do Banco\n 2- Cliente\n 3- Sair");
            opUsuario = input.nextInt(); //recebe o valor da opção
        
            if (opUsuario == 1)//ususario do banco
            {
                admin.operacoes();
            }
            if (opUsuario == 2) //cliente
            {
                admin.operacaoCliente();
            }
        }while(opUsuario!=3); //sair 
    }
 }

