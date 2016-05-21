package exemplo1;


public class Livro {
    
    private String nomeDoLivro;   
    private String autorDoLivro;    
    private boolean obraPrima;

    public Livro(String nomeDoLivro, String autorDoLivro, boolean obraPrima){
        this.nomeDoLivro = nomeDoLivro;
        this.autorDoLivro = autorDoLivro;
        this.obraPrima = obraPrima;
    }
    
    public String getNomeDoLivro() {
        return nomeDoLivro;
    }
    
    public boolean getObraPrima()
    {
        return obraPrima;
    }
        
    public String getAutorDoLivro() {
        return autorDoLivro;
    }   
    
}
