package exemplo2;

import java.io.*;

public class Exemplo2 {

    public static void main(String[] args) {
        
        try {
            
            FileReader arq = new FileReader("c:\\temp\\arquivo.txt");
            
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = ""; 
            while ((linha = lerArq.readLine()) != null) {
                System.out.printf("%s\n", linha);                
            }

            arq.close();

        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        finally{
            System.out.println("Sempre é executado.");
        }

    }    
}
