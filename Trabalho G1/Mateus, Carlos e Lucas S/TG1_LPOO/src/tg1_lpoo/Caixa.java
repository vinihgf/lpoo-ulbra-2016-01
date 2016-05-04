/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg1_lpoo;

/**
 *
 * @author Lucas
 */
public class Caixa {
    
    public int notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0;
    private String senha = "123mudar";
    boolean validaSenha = false;    
 
    // 
    public boolean validarSenha(String senha) {        
        if (senha.equals(this.senha)){
            validaSenha = true;
        }
        return validaSenha;
    }
}