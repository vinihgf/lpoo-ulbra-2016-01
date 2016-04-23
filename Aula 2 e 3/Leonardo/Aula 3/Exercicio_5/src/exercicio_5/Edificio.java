package exercicio_5;

/**
 *
 * @author leogi
 */
public class Edificio {
    public String cor;
    public int totalDePortas;
    public int totalDeAndares;
    public Porta portaA;
    public Porta portaB;
    public Porta portaC;
    public Porta portaD;
    public Porta portaE;
    public Porta portaF;
    
    public String pinta(String s){
        cor = s;
        return s;
    }
    
    public int quantasPortasEstaoAbertas(){
        int n = 0;
        if (portaA.aberta  == true){
            n++;
        }            
        if (portaB.aberta  == true){
            n++;           
        }

        if (portaC.aberta  == true){
            n++;
        }
        if (portaD.aberta  == true){
            n++;
        }            
        if (portaE.aberta  == true){
            n++;           
        }
        if (portaF.aberta  == true){
            n++;
        }

        return n;
    }
    
    public void adicionarPorta(Porta a, Porta b, Porta c, Porta d, Porta e, Porta f){
        portaA = a;
        portaB = b;
        portaC = c;
        portaD = d;
        portaE = e;
        portaF = f;
    }
    
    public int totalPortas(){
        totalDePortas = 6;
        return totalDePortas;
    }
    
    public void adicionarAndar(){
        totalDeAndares = 4;
    }
    public int totalAndares(){
        return totalDeAndares;
    }
    
}
