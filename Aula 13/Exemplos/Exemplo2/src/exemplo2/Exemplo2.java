package exemplo2;

public class Exemplo2 {

    public static void main(String[] args) {
        
        Carro veiculo = new Carro(true);
        if(veiculo.isLigado()) {
            System.out.println("O Veículo está ligado.");
        } else {
            System.out.println("O Veículo está desligado.");
        }   
    }
    
}
