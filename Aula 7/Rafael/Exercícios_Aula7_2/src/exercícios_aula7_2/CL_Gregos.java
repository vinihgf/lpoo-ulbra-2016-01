package exercícios_aula7_2;

import java.util.Random;

public class CL_Gregos
{
    private int vida;
    private int forca;
    private int vigor;
    private int inteligencia;
    private int espada = 10;
    private int escudo = 10;
    
    Random gerador = new Random();
    
    public void gerarAtributos()
    {
        vida = gerador.nextInt(101);
        forca = gerador.nextInt(21);
        vigor = gerador.nextInt(21) + 3;
        inteligencia = gerador.nextInt(21);
    }
    
    public int getVida()
    {
        return this.vida;
    }
    
    public int calcularIniciativa()
    {
        int iniciativa = this.inteligencia + gerador.nextInt(21);
        return iniciativa;
    }
    
    public int calcularAtaque()
    {
        int ataque = this.forca + gerador.nextInt(21) + this.espada;
        return ataque;
    }
    
    public int calcularDefesa()
    {
        int defesa = this.vigor + gerador.nextInt(21) + this.escudo;
        return defesa;
    }
    
    public void calcularDano(int dano)
    {
        vida = vida - dano;
    }
}