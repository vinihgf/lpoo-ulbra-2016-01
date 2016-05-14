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
public class Caminhao extends VeiculoAutomotivo{

    private boolean estaNoPercurso;
    
    public Caminhao(boolean ligado) {
        super(ligado);
        
        this.estaNoPercurso = true;
    }

    public void setLigado(boolean ligado) {
        if(estaNoPercurso) {
            this.ligado = (ligado && this.temCargaBareria);
        } else {
            this.ligado = false;
        }
    }
    
}
