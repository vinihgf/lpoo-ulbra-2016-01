package aula2.cachorro;

import java.util.Scanner;

public class Aula2Cachorro {

    public static void main(String[] args) {
        
        Endereco objEndereco = new Endereco();
        Scanner input = new Scanner(System.in);
        cachorro objCachorro = new cachorro();
        Dono objDono = new Dono();
        objCachorro.donoDoAnimal = objDono;
        objDono.enderecoDono = objEndereco;
        
        System.out.println("Informe o nome do Cachorro: ");
        objCachorro.nome = input.next();
        System.out.println("Informe o nome do Dono: ");
        objDono.nome = input.next();
        System.out.println("Informe o nome da rua do dono: ");
        objEndereco.rua = input.next();
        System.out.println("Informe o numero: ");
        objEndereco.numero = input.nextInt();
        System.out.println("Informe o bairro do dono: ");
        objEndereco.bairro = input.next();
        System.out.println("Informe a cidade do dono: ");
        objEndereco.cidade = input.next();
        System.out.println("Informe o estado do dono: ");
        objEndereco.estado = input.next();
        System.out.println("Informe a raça do Cachorro: ");
        objCachorro.raca = input.next();
        System.out.println("Informe a idade do Cachorro: ");
        objCachorro.idade = input.nextInt();
        System.out.println("Informe se o Cachorro está brabo: S ou N");
        if (input.next() == "S"){
            objCachorro.EstaBrabo = true;
        }
        else{
            objCachorro.EstaBrabo = false;
        }
      
        System.out.println(objCachorro.getDadosDoAnimal());
    }
    
}
