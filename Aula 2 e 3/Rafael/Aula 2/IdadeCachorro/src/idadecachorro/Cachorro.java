/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadecachorro;

/**
 *
 * @author Lenovo
 */
public class Cachorro
{
    public String nome;
    public String raca;
    public boolean estaBrabo;
    public int idade;
    
    public Dono donoCachorro;

    public String getDados()
    {
        String retorno = "Dados do Dono do Cachorro:\n";
        retorno = retorno + " Nome do dono: " + this.donoCachorro.nome;
        retorno = retorno + this.donoCachorro.enderecoDono.getEndereco();
        retorno = retorno + "\nDados do Cachorro:\n";
        retorno = retorno + " Nome do Cachorro: " + nome + "\n Raça do Cachorro: " + raca;
        retorno = retorno + "\n Idade Real: " + idade;
        retorno = retorno + "\n Idade aparente: " + getIdadeAparente();
        return retorno;
    }
    
    public int getIdadeAparente()
    {
        return idade * 7;
    }
}