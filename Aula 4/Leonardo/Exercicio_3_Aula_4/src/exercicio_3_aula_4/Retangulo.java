package exercicio_3_aula_4;

/**
 *
 * @author leogi
 */
public class Retangulo {
    Double comprimento;
    Double largura;
    Double area;
    Double perimetro;
    
    public Retangulo(Double comprimento, Double largura){
        
        this.comprimento = comprimento;
        this.largura = largura;
        
    }
    
    public void calcularArea(){
        
        this.area = this.largura * this.comprimento;
        
    }
    
    public void calcularPerimetro(){
        
        this.perimetro = (2 * this.comprimento) + (2 * this.largura);
        
    }
    
    public void calcular(){
        
        this.calcularArea();
        this.calcularPerimetro();
        
    }
    
    public void imprimir(){
        
        String retorno = "\n Comprimento: " + this.comprimento + "\n Largura: " + this.largura + "\n Area: " + this.area + "\n Perimetro: " + this.perimetro + "\n";
        System.out.println(retorno);
        
    }
}
