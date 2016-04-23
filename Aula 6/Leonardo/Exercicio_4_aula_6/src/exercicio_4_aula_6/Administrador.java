package exercicio_4_aula_6;

/**
 *
 * @author leogi
 */
public class Administrador extends Funcionario{
    public int extra;
    
    public void acumularExtra(int extra){
        this.extra = extra;
    }
    
    public void imprimir(){
        this.imprime = "Nome: " + this.nome + "\n";
        this.imprime += "RG: " + this.rg + "\n";
        this.imprime += "Salario: " + this.salario + "\n";
        this.salario +=  (salario/100) * this.extra;
        this.imprime += "Salario Final: " + this.salario + "\n";
        System.out.println(this.imprime);
        this.extra = 0;
    }
}
