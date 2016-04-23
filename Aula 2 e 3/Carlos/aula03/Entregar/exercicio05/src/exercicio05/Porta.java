
package exercicio05;

/**
 *
 * @author roberto
 */
public class Porta {
    
boolean aberta;
String cor;
int dimensaoX;
int dimensaoY;
int dimensaoZ;


void abre(){
	if(aberta == false){
		aberta = true;
		System.out.println("A PORTA FOI ABERTA");
	}

}

void fecha(){
	if(aberta == true){
		aberta = false;
		System.out.println("A PORTA FOI FECHADA");
	}
}

void pinta(){
	cor = "AMARELO";
}

void estaAberta(){
	if   (aberta == true)
        {
		System.out.println("A porta está ABERTA");
	}
        else
        {
		System.out.println("A porta está FECHADA"); 
	}

        
}
    
}
