package exemplo1;

public class Animal {

    protected String nomeAnimal;

    public Animal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String mover() {
        return "Nome do Animal:" + nomeAnimal + "- Animal - Mover!";
    }
}
