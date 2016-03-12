/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author Elton
 */
public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        endereco end1 = new endereco();
        end1.rua = "Avenida Brasil";
        end1.bairro = "Oliveira";
        end1.numero = 304;
        end1.estado = "Rio Grande do Sul";
        
        endereco end2 = new endereco();
        end2.rua = "Marcelo Gama";
        end2.bairro = "Noêmia";
        end2.numero = 24;
        end2.estado = "Rio Grande do Sul";
        
        cachorro dog1 = new cachorro();
        dog1.nome = "Juca";
        dog1.raca = "Vira-lata";
        dog1.idade = 1;
        dog1.brabo = false;
        /*---------------------------------------------*/
        dog1.donoDoAnimal = new dono(); /*reserva memória*/
        dog1.donoDoAnimal.setNome("João");
        dog1.donoDoAnimal.endereco = end1;
        /*---------------------------------------------*/
        
        System.out.println("\n");
        
        System.out.println(dog1.cachorro());
        
        cachorro dog2 = new cachorro();
        dog2.nome = "Leonardo";
        dog2.raca = "São Bernardo";
        dog2.idade = 19;
        dog2.brabo = true;
        /*------------------------------------------------*/
        dog2.donoDoAnimal = new dono(); /*reserva memória*/
        dog2.donoDoAnimal.endereco = end2;
        dog2.donoDoAnimal.setNome("Pedro \n");
        /*------------------------------------------------*/
        
        System.out.println("\n");
        
        System.out.println(dog2.cachorro());
        
        dog1 = dog2;
        dog2.nome = "Toby";
        System.out.println(dog1.cachorro());
    }
    
}
