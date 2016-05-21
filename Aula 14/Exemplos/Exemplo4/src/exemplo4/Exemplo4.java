package exemplo4;

public class Exemplo4 {

    public static void main(String[] args) {

        try {

            Cpf obj = new Cpf("Juca", "047771500121");

            System.out.println("Executou com sucesso!");

        } catch (CpfException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
