package exemplo2;

public class Exemplo2 {

    public static void main(String[] args) {
        Animal[] reino = new Animal[3];

        reino[0] = new Animal("Otavia antiqua!");
        reino[1] = new Ave("Quero-quero!");
        reino[2] = new Peixe("Lambari!");

        processarAnimais(reino);
    }

    public static void processarAnimais(Animal[] animais) {
        for (Animal animal : animais) {
            if (animal instanceof Peixe) {
                System.out.println(((Peixe) animal).nadar());
            }
            System.out.println(animal.mover());
        }
    }       
}
