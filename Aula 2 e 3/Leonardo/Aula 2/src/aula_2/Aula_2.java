package aula_2;

/**
 *
 * @author leogi
 */
public class Aula_2 {

    public static void main(String[] args) {
    
        endereco endereco1 = new endereco();
        endereco1.rua = "Leopolodo Souza";
        endereco1.bairro = "Santa Helena";
        endereco1.numero = 1373;
        endereco1.cidade = "Cachoeira do Sul";
        endereco1.estado = "Rio Grande do Sul";
        
        endereco endereco2 = new endereco();
        endereco2.rua = "Antonio Gomes de Campos";
        endereco2.bairro = "Otaviano";
        endereco2.numero = 281;
        endereco1.cidade = "Cachoeira do Sul";
        endereco2.estado = "Rio Grande do Sul";
        
        cachorro dog1 = new cachorro();
        dog1.nome = "Juca";
        dog1.raca = "Vira-lata";
        dog1.idade = 1;
        dog1.brabo = false;
        
        dog1.donoDoAnimal = new dono();
        dog1.donoDoAnimal.setNome("João");
        dog1.donoDoAnimal.endereco = endereco1;

        
        System.out.println("\n");
        
        System.out.println(dog1.cachorro());
        
        cachorro dog2 = new cachorro();
        dog2.nome = "Belinha";
        dog2.raca = "Chiuaua";
        dog2.idade = 7;
        dog2.brabo = true;
        
        dog2.donoDoAnimal = new dono(); 
        dog2.donoDoAnimal.endereco = endereco2;
        dog2.donoDoAnimal.setNome("Pedro \n");
        
        System.out.println(dog2.cachorro());
        
        dog1 = dog2;
        dog2.nome = "Toby";
        
        System.out.println(dog1.cachorro());
    }
    
}
