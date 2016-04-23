package pkg05.pkg1;

/**
 *
 * @author roberto
 */
public class Porta {
    
	boolean aberta;
	boolean estaAberta() {
		if (this.aberta == true) 
                {
			System.out.println("Porta aberta");
		} 
                else
                {
			System.out.println("Porta fechada");
		}
		return false;
	}
}
    

