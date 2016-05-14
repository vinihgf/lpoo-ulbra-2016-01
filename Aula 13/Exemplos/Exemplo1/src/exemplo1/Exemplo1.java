package exemplo1;

public class Exemplo1 {

    public static void main(String[] args) {
        
        //VeiculoAutomotivo veiculo = new VeiculoAutomotivo(true);
        Carro veiculo = new Carro(true);
        if(veiculo.isLigado()) {
            System.out.println("O Veículo está ligado.");
        } else {
            System.out.println("O Veículo está desligado.");
        }        
    }    
}
