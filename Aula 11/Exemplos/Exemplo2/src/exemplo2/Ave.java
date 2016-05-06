package exemplo2;

public class Ave extends Animal {

    public Ave(String nomeAnimal) {
        super(nomeAnimal);
    }
    
    public String mover() {
        return "Nome do Animal:" + nomeAnimal + "- Ave - Voar!";
    }
}
