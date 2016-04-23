
package exercicio_2_aula_6;

/**
 *
 * @author leogi
 */
public class VIP extends Ingresso{
    public double adicional(){
        this.valor = this.valor + 50;
        return this.valor;
    }
}
