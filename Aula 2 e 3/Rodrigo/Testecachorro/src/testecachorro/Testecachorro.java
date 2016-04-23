/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecachorro;

/**
 *
 * @author Aluno
 */
public class Testecachorro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        endereco end1 = new endereco();
        end1.rua = "Rua Leopoldo Souza";
        end1.bairro = "Ponche Verde";
        end1.cidade = "Cachoeira do Sul";
        end1.estado = "Rio Grande do Sul";
        end1.numero = 701;
        
        
        endereco end2 = new endereco();
        end2.rua = "Rua Aparicio Borges";
        end2.bairro = "São José";
        end2.cidade = "Cachoeira do Sul";
        end2.estado = "Rio Grande do Sul";
        end2.numero = 1067;
        
        
        cachorro dog1 = new cachorro ();
        dog1.nome = "Juca";
        dog1.raca = "Vira-Lata";
        dog1.idade = 1;
        dog1.estaBrabo = false;
        dog1.donoDoAnimal = new Dono();
        dog1.donoDoAnimal.setNome("Rodrigo");
        dog1.donoDoAnimal.enderecoDono = end1;
        
        System.out.println(dog1.getdadosdoAnimal());
        
        cachorro dog2 = new cachorro ();
        dog2.nome = "Zeca";
        dog2.raca = "Guaipeca";
        dog2.idade = 7;
        dog2.estaBrabo = false;
        Dono dono2 = new Dono();
        dono2.setNome ("Pedro");
        dono2.enderecoDono = end2;
        dog2.donoDoAnimal = dono2;
        
        System.out.println(dog2.getdadosdoAnimal());
        
    }
    
}
