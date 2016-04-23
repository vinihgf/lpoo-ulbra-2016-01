package aula07;

import java.util.Random;

public class CL_Bretoes {
    private int vida = 0;
    private int forca = 0;
    private int vigor = 0;
    private int inteligencia = 0;
    private int espada = 0;
    private int escudo = 0;
    Random gerador = new Random();
    
    public void gerarAtrib()
    {
        vida = gerador.nextInt(101);
        espada = 10;
        escudo = 10;
        forca = gerador.nextInt(21) + 2;
        vigor = gerador.nextInt(21);
        inteligencia = gerador.nextInt(21) - 1;
    }    
    public int calcIniciativ()
    {
        int iniciativa = this.inteligencia + gerador.nextInt(21);
        return iniciativa;
    }
    public int calcAtaq()
    {
        int ataque = this.forca + gerador.nextInt(21) + this.espada;
        return ataque;
    }
    public int calcDef()
    {
        int defesa = this.vigor + gerador.nextInt(21) + this.escudo;
        return defesa;
    }
    public void calcDano(int dano)
    {
        vida = vida - dano;
    }
    public int getVida()
    {
        return this.vida;
    }
}
