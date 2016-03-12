package aula02;
public class Endereco {
    public String rua;
    public String bairro;
    public String cidade;
    public String estado;
    public int numero;
    
    public void setEndereco(String rua, String bairro, String cidade, String estado, int numero)
    {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }
    
    public String getEndereco(){
        String retorno = "Rua: " + rua + "," + numero + ",\nBairro: " + bairro + ",\nCidade: " + cidade + ", " + estado;
        return retorno;
    }
}
