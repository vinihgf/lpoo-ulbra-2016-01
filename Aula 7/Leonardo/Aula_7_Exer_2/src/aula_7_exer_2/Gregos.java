package aula_7_exer_2;


/**
 *
 * @author leogi
 */
public class Gregos extends Gladiator{

    public void criarGrego(){
        this.criarGladiador();
    }
    
    public void modificadorGrego(){
        this.vi += 3;
        this.ata += this.espada;
        this.def += this.escudo;
    }
    
    public void imprimir(){
        this.imprimeGladiator();
    }
    
    public int iniciativaGrego(){
        this.iniciativa();
        return this.inicia;
    }
    
    public int ataqueGrego(){
        this.ataque();
        return this.ata;
    }
    
    public int defesaGrego(){
        this.defesa();
        return this.def;
    }
    
    public int retornaPvGrego(){
        return this.pv;
    }
    
    public void vencedorGrego(){
        imprimirVencedor = "VENCEDOR: " + this.nome;
        System.out.println(imprimirVencedor);
    }

}
