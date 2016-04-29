package trabalhog1;
import java.util.Scanner;

public class Senha 
{
    Scanner input = new Scanner(System.in);
    public String senha;
        
    public boolean verificaSenha ()
    {   
        
        
        while(true){
           System.out.println("Senha: ");
           this.senha = input.nextLine(); //recebe a senha         
           if (!this.senha.equals("123mudar")) //verfica se é incorreta
           {
                System.out.println("Senha Incorreta!");
                
           }
           else
           {
               break;
           }
                       
        }
        return true;
    }
}