package exercicio_9_aula_4;

/**
 *
 * @author leogi
 */
public class Letra {
    
    public String var;
    
    public String teste(int a){
        boolean controle = false;
        Letra l = new Letra();
        String[] vogal = new String[5];        
        int[] tabela = new int[26];
        String letra = "";
        
        switch (a)
        {
            case 97:
                letra = "a";
                break;
            case 98:
                letra = "b";
                break;
            case 99:
                letra = "c";
                break;
            case 100:
                letra = "d";
                break;
            case 101:
                letra = "e";
                break;
            case 102:
                letra = "f";
                break;
            case 103:
                letra = "g";
                break;   
            case 104:
                letra = "h";
                break;
            case 105:
                letra = "i";
                break;    
            case 106:
                letra = "j";
                break;
            case 107:
                letra = "k";
                break;
            case 108:
                letra = "l";
                break;
            case 109:
                letra = "m";
                break;
            case 110:
                letra = "n";
                break;
            case 111:
                letra = "o";
                break;
            case 112:
                letra = "p";
                break;    
            case 113:
                letra = "q";
                break;
            case 114:
                letra = "r";
                break;
            case 115:
                letra = "s";
                break;
            case 116:
                letra = "t";
                break;
            case 117:
                letra = "u";
                break;
            case 118:
                letra = "x";
                break;
            case 119:
                letra = "v";
                break;
            case 120:
                letra = "w";
                break;
            case 121:
                letra = "y";
                break;
            case 122:
                letra = "z";
                break;
            default:
                System.out.println("Letra inválida!");
        }
        
        vogal[0] = "a";
        vogal[1] = "e";
        vogal[2] = "i";
        vogal[3] = "o";
        vogal[4] = "u";
        for(int x = 0; x < 5; x++){
            if(letra.equals(vogal[x])){
                controle = true;
            }
        }
        if(controle == true){
            return "É vogal!";
        }
        else{
            return "É consoante!"; 
        }
        
     
        
 
    } 
 
    
}
