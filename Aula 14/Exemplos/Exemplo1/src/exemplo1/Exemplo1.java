package exemplo1;

public class Exemplo1 {

    public static void main(String[] args) {
        
        Livro[] livros = new Livro[3];
        livros[0] = new Livro("Filhos do Fim do Mundo", "Eduardo Barreto", false);
        livros[1] = new Livro("Espadachim de Carvão", "Affonso Solano", false);
        livros[2] = new Livro("Vidas Secas", "Graciliano Ramos", true);
        
        for(int i = 0; i < 4; i++) {
            System.out.println("Nome do Livro: " + livros[i].getNomeDoLivro() + " Autor: " + livros[i].getAutorDoLivro());
        }
    }
    
    public static boolean isObraPrima(Livro livro)
    {
        livro = null;
        return livro.getObraPrima();
    }
    
}



//        try {
//            for(int i = 0; i < 4; i++) {            
//                System.out.println("Nome do Livro: " + livros[i].getNomeDoLivro() + " Autor: " + livros[i].getAutorDoLivro());
//                if(isObraPrima(livros[i])) {
//                    System.out.println("É obra prima!");
//                }
//            }
//        } catch(ArrayIndexOutOfBoundsException ex) {            
//            System.out.println("Detalhe do Erro: " + ex.getMessage());
//        }
        
        
        
//        try {
//            for(int i = 0; i < 4; i++) {            
//                System.out.println("Nome do Livro: " + livros[i].getNomeDoLivro() + " Autor: " + livros[i].getAutorDoLivro());
//
//                if(isObraPrima(livros[i])) {
//                    System.out.println("É obra prima!");
//                }
//            }
//        } catch(ArrayIndexOutOfBoundsException ex) {            
//            System.out.println("Acessou uma posição inexistente: " + ex.getMessage());
//        } catch(NullPointerException ex) {
//            System.out.println("Erro variavel nula: " + ex.getMessage());
//        }
