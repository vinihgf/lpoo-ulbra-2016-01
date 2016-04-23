package ex03aula04;

/**
 * 
 *
 * @author roberto
 */
class Retangulo {
   public double comprimento;
   public double  largura;
   public double  area;
   public double  perimetro;
   
   
  
       public Retangulo(double comprimento,double  largura){
           this.comprimento = comprimento;
           this.area = area;
           this.largura = largura;
           this.perimetro = perimetro;
        // String retorno ="----";
         //retorno +="/n Pessoa" + this.nome + "\"/n endereco\""+ this.endereco +"\"/n telefone\""+ this.telefone +"\n";
         //retorno +="---";
         //return retorno;
    }
       public void calcularArea(){
        
         this.area =  this.comprimento * this.largura;
         //return calcularArea;
           
       }
       
        public void calcularPerimetro(){
           
         this.perimetro  = (2 * this.comprimento) + (2 * this.largura);
        // return calcularPerimetro;
       }
        public void calcularTudo(){
           
        this.calcularArea();
        this.calcularPerimetro();
        // return calcularPerimetro;
       }
        public void imprimir(){
          
           System.out.println("Area"+ this.area + 
                   "\nPerimetro " + this.perimetro +
                    "\n");
          // retorno +="Pessoa " + this.nome + "\nEndereco " + this.endereco +"\nTelefone "+ this.telefone +"\n";
          
        }
        
}
