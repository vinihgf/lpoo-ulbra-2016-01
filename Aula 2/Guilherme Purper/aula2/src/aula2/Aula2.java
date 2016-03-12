package aula2;

public class Aula2 {

    public static void main(String[] args) {
        
        endereco end1 = new endereco();
        end1.rua = "Rua das Laranjeiras";
        end1.bairro = "Marina";
        end1.cidade = "Cachoeira do Sul";
        end1.estado = "RS";
        end1.numero = 567;
        
        endereco end2 = new endereco();
        end2.rua = "Rua Mario Godoy";
        end2.bairro = "Cohab";
        end2.cidade = "Cachoeira do Sul";
        end2.estado = "RS";
        end2.numero = 999;
        
        cachorro dog1 = new cachorro();
        dog1.nome = "Juca";
        dog1.raca = "vira-lata";
        dog1.idade = 1;
        dog1.estabrabo = false;
        dog1.donoDoAnimal = new dono();
        dog1.donoDoAnimal.setNome("João");
        dog1.donoDoAnimal.enderecoDono = end1;
        
        System.out.println(dog1.getDadosDoAnimal());
        System.out.println(dog1.donoDoAnimal.enderecoDono);
        
        cachorro dog2 = new cachorro();
        dog2.nome = "Dolly";
        dog2.raca = "labrador";
        dog2.idade = 2;
        dog2.estabrabo = true;
        dog2.donoDoAnimal = new dono();
        dog2.donoDoAnimal.setNome("Pedro");
        dog2.donoDoAnimal.enderecoDono = end2;
        
        System.out.println(dog2.getDadosDoAnimal());
        
        dog1 = dog2;
        dog2.nome = "Toby";
        
        System.out.println(dog1.getDadosDoAnimal());
    }
}