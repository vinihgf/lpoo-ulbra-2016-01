package edificio;

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

    void abre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

