package exemplo3;

public class LancaExcecao {
    
    public void metodo(int valor) throws Exception
    {
        if(valor < 10)
        {
            throw new Exception("O valor deve de ser maior que 10");
        }
    }
}
