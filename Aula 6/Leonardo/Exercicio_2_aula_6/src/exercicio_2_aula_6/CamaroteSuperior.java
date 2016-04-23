package exercicio_2_aula_6;

/**
 *
 * @author leogi
 */
public class CamaroteSuperior extends VIP{
    public double adicional(){
        this.valor = this.valor + 100;
        return this.valor;
    }
}
