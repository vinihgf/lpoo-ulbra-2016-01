package exemplo1;

public class Peixe extends Animal {

    public Peixe(String nomeAnimal) {
        super(nomeAnimal);
    }

    public String mover() {

        return "Nome do Animal:" + nomeAnimal + "- Peixe - Nadar!";
    }
}
