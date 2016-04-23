package trabalhog1;
public class CL_Funcionario
{
    private String senha = "123mudar";
    
    public boolean validaSenha(String senha)
    {
        if(senha.equals(this.senha))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
