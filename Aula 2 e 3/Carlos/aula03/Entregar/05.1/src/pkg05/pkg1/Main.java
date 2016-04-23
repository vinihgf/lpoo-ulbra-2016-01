
package pkg05.pkg1;

/**
 *
 * @author roberto
 */
public class Main {

    public static void main(String[] args) {
        
       
		Casa minhaCasa = new Casa();
		Porta novaPorta = new Porta();
		novaPorta.aberta = true;
		novaPorta.estaAberta();
		minhaCasa.cor = "Amarelo";
		minhaCasa.totalDePortas = 2;
		minhaCasa.pinta("Branco");
		minhaCasa.adicionaPorta(novaPorta);	
		minhaCasa.quantasPortasEstaoAbertas();
                System.out.println("Portas abertas");
                minhaCasa.totalDePortas();
    }
    
}
