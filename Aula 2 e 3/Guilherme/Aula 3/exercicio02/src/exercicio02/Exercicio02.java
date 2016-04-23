/*
    Uma classe Lampada com atributo ligada (tipo boolean) 
    e métodos liga() e desliga() que nada retornam. 
    O método liga torna o atributo ligada como true 
    e o método desliga toma o atributo ligada como false. 
    Crie também o método observa() que retorna a String “ligada” 
    se a lâmpada estiver ligada e “desligada” se a lâmpada estiver desligada.
 */
package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.liga();
        System.out.println(lampada.observa());
        
        lampada.desliga();
        System.out.println(lampada.observa());
        
    }
}