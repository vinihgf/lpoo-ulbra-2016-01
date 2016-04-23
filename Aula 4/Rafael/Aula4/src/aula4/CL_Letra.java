package aula4;

public class CL_Letra
{
    public boolean ehVogal(String letra)
    {
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean ehConsoante(String letra)
    {
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}