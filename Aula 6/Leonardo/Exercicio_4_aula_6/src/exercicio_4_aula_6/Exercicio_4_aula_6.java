package exercicio_4_aula_6;

/**
 *
 * @author leogi
 */
public class Exercicio_4_aula_6 {

    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor();
        Administrador admin = new Administrador();
        
        vendedor.alterarNome("João");
        vendedor.alterarRg(111111111);
        vendedor.alterarSalario(1000.00);
        vendedor.acumularVendas(10);
        vendedor.imprimir();
        
        admin.alterarNome("Maria");
        admin.alterarRg(22222222);
        admin.alterarSalario(2000.00);
        admin.acumularExtra(50);
        admin.imprimir();
        
        
    }
    
}
