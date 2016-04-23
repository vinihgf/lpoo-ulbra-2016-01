package aula_7_exer_2;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author leogi
 */
public class Gladiator {
    Scanner input = new Scanner(System.in);
    Random gerador = new Random();
    
    protected String nome;
    protected int pv;
    protected int fo;
    protected int vi;
    protected int it;
    protected int espada;
    protected int escudo;
    protected String imprimir;
    protected int inicia;
    protected int ata;
    protected int def;
    protected String imprimirVencedor;

    public Gladiator() {
    }

    protected void criarGladiador(){
        System.out.println("CRIAR GLADIADOR");
        
        System.out.println("Nome do Gladiador");
        this.nome = input.next();
        
        System.out.println("Pontos de Vida");
        this.pv = input.nextInt();
        
        System.out.println("Pontos de Força");
        this.fo = input.nextInt();
        
        System.out.println("Pontos de Vigor");
        this.vi = input.nextInt();
        
        System.out.println("Pontos de Inteligência");
        this.it = input.nextInt();
        
        System.out.println("Pontos da Espada");
        this.espada = input.nextInt();
        
        System.out.println("Pontos do Escudo");
        this.escudo = input.nextInt();
               
    }
    
    protected void imprimeGladiator(){
        this.imprimir = "Nome: " + this.nome + "\n";
        this.imprimir += "Vida: " + this.pv + "\n";
        this.imprimir += "Força: " + this.fo + "\n";
        this.imprimir += "Vigor: " + this.vi + "\n";
        this.imprimir += "Inteligência: " + this.it + "\n";
        System.out.println(imprimir);
        
    }
    
    protected void iniciativa(){
        this.inicia = this.it + this.gerador.nextInt(20);
    }
    
    protected void ataque(){
        this.ata = this.it + this.gerador.nextInt(20);
    }
    
    protected void defesa(){
        this.def = this.it + this.gerador.nextInt(20); 
    }
    
        
}
