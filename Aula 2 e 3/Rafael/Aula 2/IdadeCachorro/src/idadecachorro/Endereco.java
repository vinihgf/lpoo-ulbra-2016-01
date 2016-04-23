package idadecachorro;

public class Endereco
{
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
    
    public String getEndereco()
    {
        String retorno = "\n Rua: " + rua + "\n Bairro: " + bairro + "\n Numero: " + numero + "\n Cidade: " + cidade + "\n Estado: " + estado;
        return retorno;
    }
}
