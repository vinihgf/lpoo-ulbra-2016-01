package exemplo4;

public class CpfException extends Exception {
        
    public CpfException(String mensagem) {
        super(mensagem);        
    }

//    @Override
//    public String getMessage() {
//        return "getMessage - CPF inválido";
//    }
}
