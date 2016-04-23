/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cachorro objCachorro = new Cachorro();
        objCachorro.donoAnimal = new Dono();
        objCachorro.donoAnimal.endereco = new Endereco();
        
        System.out.println("Digite o nome do dono:");
        objCachorro.donoAnimal.nome = input.next();
        
        System.out.println("Digite o nome da Rua em que voce mora:");
        objCachorro.donoAnimal.endereco.rua = input.next();
        System.out.println("Digite seu bairro:");
        objCachorro.donoAnimal.endereco.bairro = input.next();
        System.out.println("Digite sua cidade:");
        objCachorro.donoAnimal.endereco.cidade = input.next();
        System.out.println("Digite seu estado:");
        objCachorro.donoAnimal.endereco.estado = input.next();
        System.out.println("Digite o numero da casa:");
        objCachorro.donoAnimal.endereco.numero = input.nextInt();
        
        
        System.out.println("Digite o nome do cachorro:");
        objCachorro.nome = input.next();
        System.out.println("Digite a idade do cachorro:");
        objCachorro.idade = input.nextInt();
        System.out.println("Digite a raça do cachorro");
        objCachorro.raca = input.next();

        
        
        System.out.println(objCachorro.getDados());
        
    }
    
}
