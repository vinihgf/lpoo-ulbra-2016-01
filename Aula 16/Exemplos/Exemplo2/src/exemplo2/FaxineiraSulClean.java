/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

/**
 *
 * @author Diego
 */
public class FaxineiraSulClean implements IFaxineira {

    @Override
    public void varrer() {
        System.out.println("FaxineiraSulClean - Varrer");
    }

    @Override
    public void lavar() {
        System.out.println("FaxineiraSulClean - lavar");
    }

    @Override
    public void tirarLixo() {
        System.out.println("FaxineiraSulClean - tirarLixo");
    }
    
}
