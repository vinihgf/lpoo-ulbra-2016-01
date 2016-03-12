package exercicioaula1;

public class Endereco {

    public String rua;
    public String bairro;
    public String cidade;
    public String estado;
    public int numero;
    
    public String getEndereco(){
        String retorno = " Rua: "+ rua + "| Bairro:" + bairro + "| Cidade:" + cidade + "| Estado:" + estado;
        retorno += numero;
        
        return retorno;
    }
}
