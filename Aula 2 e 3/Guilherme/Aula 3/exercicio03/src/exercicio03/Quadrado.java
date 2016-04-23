/*
    Escreva uma classe Quadrado com atributo lado do tipo double. 
    A classe deve ter os métodos area() e perimetro() que retornam 
    respectivamente a área e o perímetro do quadrado, cuja as formulas 
    são as seguintes.
    Área = lado x lado
    Perímetro = 4 x lado
 */
package exercicio03;


class Quadrado {
    public double lado;
    
    public double area(){
        double area = lado * lado;
        return area;
    }
    public double perimetro(){
        double perimetro = lado * 4;
        return perimetro;
    }
}
