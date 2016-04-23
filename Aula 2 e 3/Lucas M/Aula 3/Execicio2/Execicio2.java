package Execicio2;
public class Execicio2 {
    public static void main(String[] args){
        
        Lampada lampada = new Lampada();
        lampada.liga();
        System.out.println(lampada.observa());
        
        lampada.desliga();
        System.out.println(lampada.observa());
        
        
    }
}
