
package Exercicio9;


public class Letra {
    public boolean ehVogal (String let)
    {
        boolean texte = false;
        if (let == "a" && let == "e" && let == "i" && let == "o" && let== "u")        
        {
            texte= true;
        }     
        if (texte == true)
        {
            System.out.println("É Vogal!");
        }
        return texte;
    }
    
    public boolean ehConsoante(String let)
    {
        boolean texte = false;
        if (let !="a" && let !="e" && let != "i" && let !="o" && let != "u")
        {
            texte = true;
        }    
        if (texte == true)
        {
            System.out.println("É Consoante!");
        }
        return texte;
    
}
}
