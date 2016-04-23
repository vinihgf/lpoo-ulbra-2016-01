
package exercicioaula1;

public class Exercicioaula1 {

     public static void main(String[] args) {
         
    
    Endereco end1 = new Endereco();
    end1.bairro =" Gonçalves";
    end1.estado = " RS";
    end1.cidade =" Cachoeira";
    end1.rua = "Marcilio dias";
    end1.numero = 1335;
    
    Cachorro dog1 = new Cachorro();
    
    dog1.nome = "TOTÓ";
    dog1.raça = "CUSCO";   
    dog1.idade = 2;
    dog1.estaBrabo = false;    
    
    
    dog1.donoDoAnimal = new Dono();
    dog1.donoDoAnimal.setNome("João");
    dog1.donoDoAnimal.endereco = end1;
    
    System.out.println(end1.getEndereco());
    
    
    
    /*
    System.out.println(dog1.getDadosdoAnimal());
    
     Cachorro dog2 = new Cachorro();
     
     dog2.idade = 5;
     dog2.nome = "Miau";
     dog2.raça = "Cachorro";
     dog2.estaBrabo = true;
     
     System.out.println(dog2.getDadosdoAnimal());
    
    
     dog1 = dog2;
     dog2.nome = "Caão";
         
    System.out.println(dog1.getDadosdoAnimal());
    */

    }
    
}
