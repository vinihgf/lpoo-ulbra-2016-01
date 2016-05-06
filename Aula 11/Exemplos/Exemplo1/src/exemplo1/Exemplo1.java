package exemplo1;

public class Exemplo1 {

    public static void main(String[] args) {

        Animal[] reino = new Animal[3];

        reino[0] = new Animal("Otavia antiqua!");
        reino[1] = new Ave("Quero-quero!");
        reino[2] = new Peixe("Lambari!");

        for (int i = 0; i < reino.length; i++) {
            System.out.println(reino[i].mover());
        }
    }
}
