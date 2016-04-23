
package trabalhog1;
public class CL_Cliente
{
    private int conta;
    private int agencia;
    private int senha;
    
    
    public CL_Cliente(int conta, int agencia, int senha)
    {
        this.conta = conta;
        this.agencia = agencia;
        this.senha = senha;
    }
    
    public boolean validaDados(int conta, int agencia, int senha)
    {
        if(this.senha == senha && this.conta == conta && this.agencia == agencia)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean confereVezes(int vezes) 
    {
        if(vezes == 1)
        {
            System.out.println("\nVOCE ERROU UMA VEZ, TE LIGA, PODE ERRAR APENAS 3!");
            return true;
        }
        else if(vezes == 2)
        {
            System.out.println("\nEU JA TE AVISEI CAVALO, TE LIGA, PODE ERRAR APENAS 3, JA FOI 2!");
            return true;
        }
        else if(vezes == 3)
        {
            System.out.println("\nTCHÊ, MAS É UM CAVALO QUE TA SACANDO? JA LIDOU NESSA TECNOLOGIA ANTES? VOU TE DAR UM ARREGO, TENTA MAIS UMA AE!");
            return true;
        }
        else
        {
            System.out.println("\nBRRRR, AGORA PERDEU TODO TEU DINHEIRO CAVALO! CONTA BLOQUEADO, CONTATE O ANIMAL DO TEU ADESTRADOR PRA CONSERTAR A CAGADA QUE VOCE FEZ!");   
            this.conta = 0;
            this.agencia = 0;
            this.senha = 0;
            return false;
        }
    }
}
