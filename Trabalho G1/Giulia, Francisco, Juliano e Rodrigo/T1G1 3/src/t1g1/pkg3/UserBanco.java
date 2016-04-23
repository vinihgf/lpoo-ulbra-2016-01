package t1g1.pkg3;

public class UserBanco extends Usuario {

    private int senha;

    public UserBanco(String nome, String tipo) {
        super(nome, tipo);
    }
    
    public void leSenha(int senha){
        
        this.senha = senha;    
    
    }
    public boolean validaSenha() {
        boolean valida = false;

        if (this.senha == 1234) {
            
            valida = true;

        } else {

            valida = false;

        }

        return valida;
    }

}


}