package idadecachorro;

import java.util.Scanner;

public class IdadeCachorro 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Cachorro objCachorro = new Cachorro();
        objCachorro.donoCachorro = new Dono();
        objCachorro.donoCachorro.enderecoDono = new Endereco();
        
        System.out.println("Informe o nome do dono do cachorro: ");
        objCachorro.donoCachorro.nome = input.next();
        
        System.out.println("Dados do dono do cachorro: ");
        System.out.println("Informe a rua: ");
        objCachorro.donoCachorro.enderecoDono.rua = input.next();
        System.out.println("Informe o bairro: ");
        objCachorro.donoCachorro.enderecoDono.bairro = input.next();
        System.out.println("Informe a cidade: ");
        objCachorro.donoCachorro.enderecoDono.cidade = input.next();
        System.out.println("Informe o estado: ");
        objCachorro.donoCachorro.enderecoDono.estado = input.next();
        System.out.println("Informe o numero: ");
        objCachorro.donoCachorro.enderecoDono.numero = input.nextInt();
        
        System.out.println("Informe o nome do cachorro: ");
        objCachorro.nome = input.next();
        System.out.println("Informe a raça do cachorro: ");
        objCachorro.raca = input.next();
        System.out.println("Informe a idade do cachorro: ");
        objCachorro.idade = input.nextInt();
        /*System.out.println("Informe se o cachorro está brabo: 1 - Sim, 0 - Não");
        /if(input.nextInt() == 1)
        {
            objCachorro.estaBrabo = true;
        }
        else if (input.nextInt() == 0)
        {
            objCachorro.estaBrabo = false;
        }
        */
        System.out.println(objCachorro.getDados());
    }
}