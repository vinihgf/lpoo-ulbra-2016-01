package trabalho_g1;

/**
 *
 * @author LEONARDO GIULIANE / ELTON GIOVANE / GUILHERME PURPER
 */
public class Caixa {
        private String senha = "123mudar";
    public int cinquenta = 0;
    public int vinte = 0;
    public int dez = 0;
    public int cinco = 0;
    public int dois = 0;
 

    public int testeSenha(String senha) {
        int validacao = 0;
        if (senha.equals(this.senha)){
            validacao = 1;
        }
        return validacao;    
    }
}
