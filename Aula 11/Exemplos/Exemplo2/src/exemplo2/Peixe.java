package exemplo2;

public class Peixe extends Animal {

    public Peixe(String nomeAnimal) {
        super(nomeAnimal);
    }

    public String nadar()
    {
        return "Glub Glub";
    }
    
    public String mover() {

        return "Nome do Animal:" + nomeAnimal + "- Peixe - Nadar!";
    }
}
