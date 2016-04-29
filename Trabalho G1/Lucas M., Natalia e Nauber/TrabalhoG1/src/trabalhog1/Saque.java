
package trabalhog1;


public class Saque extends Cedulas
{
    public int qtd50;
    public int qtd20;
    public int qtd10;
    public int qtd5;
    public int qtd2;
    public int cont;
    
    public void Saque()
    {
       cont = super.cont; 
    }
    
    public void sacar(int cont) //TENTAR CRIAR UMA NOVA CLASSE SAQUE!!
    {
        int sac=0, rest50, rest20, rest10, rest5, rest2;
    
        System.out.println("Informe o valor do saque:\n");
        sac = input.nextInt();
        
            if (sac >= 50)
            {
            rest50 = sac / 50; //rest50 recebe a divisão de saque por 50
            cont = cont - sac;
            sac = sac % 50; //recebe o resto da divisao por 50
            System.out.println("Cédulas de 50:\n"+rest50); //mostra a qtd de notas deste valor
            qtd50 = qtd50 - rest50;
                        
            }
            if (sac >= 20)             
            {
                rest20 = sac / 20;
                sac = sac % 20;
                System.out.println("Cédulas de 20:\n"+rest20);
            }
            if (sac >= 10)
            {
                rest10 = sac / 10;
                sac = sac % 10;
                System.out.println("Cédulas de 10:\n"+rest10);
            }
            if (sac >= 5)
            {
                rest5 = sac / 5;
                sac = sac % 5;                  
                System.out.println("Cédulas de 5:\n"+rest5);   
            }            
            if (sac >= 2)
            {
                rest2 = sac / 2;
                sac = sac % 2;
                System.out.println("Cédulas de 2:\n"+rest2);
            }
            else 
            {
                System.out.println("Não foi possível realizar esta operação!");
            }
    }
}
    
