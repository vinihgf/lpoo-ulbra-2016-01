/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo4;

/**
 *
 * @author Diego
 */
public class Jardineiro implements IFuncionario, IEpi {

    @Override
    public Boolean temAutorizacao() {
        return true;
    }

    @Override
    public Boolean possuiEquipamento() {
        return true;
    }
    
    public void cortarGrama() {
        System.out.println("Jardineiro - cortarGrama");
    }
    
}
