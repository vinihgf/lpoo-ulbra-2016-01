/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4_exercicio9;

/**
 *
 * @author Elton
 */
class Letra {
    
    boolean controle = false;
    
    public String palavra = "";
    
    public String palavra(int a){
        
        switch (a)
        {
            case 97:
                
                this.palavra = "a";
                break;
                
            case 98:
                
                this.palavra = "b";
                break;
                
            case 99:
                
                this.palavra = "c";
                break;
                
            case 100:
                
                this.palavra = "d";
                break;
                
            case 101:
                
                this.palavra = "e";
                break;
                
            case 102:
                
                this.palavra = "f";
                break;
                
            case 103:
                
                this.palavra = "g";
                break;
                
            case 104:
                
                this.palavra = "h";
                break;
                
            case 105:
                
                this.palavra = "i";
                break;
                
            case 106:
                
                this.palavra = "j";
                break;
                
            case 107:
                
                this.palavra = "k";
                break;
                
            case 108:
                
                this.palavra = "l";
                break;
                
            case 109:
                
                this.palavra = "m";
                break;
                
            case 110:
                
                this.palavra = "n";
                break;
                
            case 111:
                
                this.palavra = "o";
                break;
                
            case 112:
                
                this.palavra = "p";
                break;
                
            case 113:
                
                this.palavra = "q";
                break;
                
            case 114:
                
                this.palavra = "r";
                break;
                
            case 115:
                
                this.palavra = "s";
                break;
                
            case 116:
                
                this.palavra = "t";
                break;
                
            case 117:
                
                this.palavra = "u";
                break;
                
            case 118:
                
                this.palavra = "x";
                break;
                
            case 119:
                
                this.palavra = "v";
                break;
                
            case 120:
                
                this.palavra = "w";
                break;
                
            case 121:
                
                this.palavra = "y";
                break;
                
            case 122:
                
                this.palavra = "z";
                break;
                
            default:
                
                System.out.println("Letra inválida!");
                
        }
        
        ehVogal();
        ehConsoante();
        
        if(controle == true){
            
            return "É vogal!";
            
        }
        else{
            
            return "É consoante!"; 
            
        }
        
    } 
    
    public void ehVogal(){
        
        boolean controle;
        
        if((this.palavra == "a")||(this.palavra == "e")||(this.palavra == "i")||(this.palavra == "o")||(this.palavra == "u")){
            
            this.controle = true;
        
        } else {
            
            this.controle = false;
            
        }
        
    }
    
    public void ehConsoante(){
        
        boolean controle;
        
        if((this.palavra == "a")||(this.palavra == "e")||(this.palavra == "i")||(this.palavra == "o")||(this.palavra == "u")){
            
            this.controle = true;
        
        } else {
            
            this.controle = false;
            
        }
        
    }
}
