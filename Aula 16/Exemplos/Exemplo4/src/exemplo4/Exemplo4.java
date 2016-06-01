
package exemplo4;

public class Exemplo4 {

    public static void main(String[] args) {

        try {
            
            Universidade ulbra = new Universidade();

            Jardineiro jardineiro = new Jardineiro();
            ulbra.setJardineiro(jardineiro);
            
            IFaxineira faxineira = new FaxineiraCiaDasDiaristas();            
            ulbra.setFaxineira(faxineira);
            ulbra.diaDaLimpeza();
            


            IProfessor dentista = new Dentista();
            IProfessor advogado = new Advogado();
            ulbra.adicionarProfessor(advogado);
            ulbra.adicionarProfessor(dentista);
            ulbra.listarProfessores();
            
        } catch (FuncionarioException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
