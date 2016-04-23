package aula_7_exer_2;

/**
 *
 * @author leogi
 */
public class Bretoes extends Gladiator{
    public void criarBretao(){
        this.criarGladiador();
    }
    
    public void modificadorBretao(){
        this.fo += 2;
        this.it -= 1;
        this.ata += this.espada;
        this.def += this.escudo;
    }
    
    public void imprimir(){
        this.imprimeGladiator();
    }
    
     public int iniciativaBretao(){
        this.iniciativa();
        return this.inicia;
    }
    
    public int ataqueBretao(){
        this.ataque();
        return this.ata;
    }
    
    public int defesaBretao(){
        this.defesa();
        return this.def;
        
    }
    
    public int retornaPvBretao(){
        return this.pv;
    }
    
    public void vencedorBretao(){
        imprimirVencedor = "VENCEDOR: " + this.nome;
        System.out.println(imprimirVencedor);
    }
}
