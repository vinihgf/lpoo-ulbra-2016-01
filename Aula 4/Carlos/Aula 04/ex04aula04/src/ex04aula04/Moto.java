
package ex04aula04;

/**
 *
 * @author roberto
 */
public class Moto {
       public String marca;
        public String modelo;
        public String cor;
        public int marcha = 0;
        public int menormarcha =0;
        public int maiormarcha =4;
        
        public Moto (String marca,String modelo, String cor, int menormarcha, int maiormarcha)
        {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.marcha = marcha;
          //  this.maiormarcha 
           
        }
        
        public void marchaAcima(){
            //menormarcha >0;
            this.marcha = this.marcha +1;
        
        }
        public void marchaAbaixo(){
             this.marcha = this.marcha -1;
            }
                

    void imprimir() {
        String retorno ="----\n";
         retorno +="Marca " + this.marca + 
                 "\nModelo" + this.modelo +
                 "\nCor "+ this.cor +
                 "\nMaior Marcha " + this.maiormarcha +
                 "\nMenor Marcha " + this.menormarcha +"\n";
         retorno +="---";
        System.out.println(retorno);
    }
        }

