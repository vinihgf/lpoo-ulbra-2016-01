package exercicio_4_aula_6;

/**
 *
 * @author leogi
 */
public class Vendedor extends Funcionario{
    public int vendas;

    
    public void acumularVendas(int vendas){
        this.vendas = vendas;
    }
    
    public void imprimir(){
        this.imprime = "Nome: " + this.nome + "\n";
        this.imprime += "RG: " + this.rg + "\n";
        this.imprime += "Salario: " + this.salario + "\n";
        this.salario +=   ((salario/100)*5) * this.vendas;
        this.imprime += "Salario Final: " + this.salario + "\n";
        System.out.println(this.imprime);
        this.vendas = 0;
    }
}

