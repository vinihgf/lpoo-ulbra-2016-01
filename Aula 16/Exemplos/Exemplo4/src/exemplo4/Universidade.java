package exemplo4;

import java.util.ArrayList;

public class Universidade {
    
    private IFaxineira faxineira;    
    private Jardineiro jardineiro;
    private ArrayList<IProfessor> professores;
    
    public Universidade()
    {
        professores = new ArrayList<>();
    }

    public void setFaxineira(IFaxineira paramFaxineira) throws FuncionarioException
    {
        if(paramFaxineira.temAutorizacao()) {
            this.faxineira = paramFaxineira;
        } else  {
            throw new FuncionarioException("Faxineira sem autorizacao");
        }        
    }
    
    public void setJardineiro(IFuncionario paramJardineiro) throws FuncionarioException
    {
        if(paramJardineiro.temAutorizacao()) {
            this.jardineiro = (Jardineiro)paramJardineiro;
        } else  {
            throw new FuncionarioException("Jardineiro sem autorizacao");
        }        
    }
    
    public void diaDaLimpeza()
    {
        faxineira.lavar();
        faxineira.varrer();
        faxineira.tirarLixo();        
        jardineiro.cortarGrama();        
    }    
    
    public void adicionarProfessor(IProfessor professor) throws FuncionarioException
    {
        if(professor.temAutorizacao()){
            professores.add(professor);
        } else {
            throw new FuncionarioException("Professor sem autorizacao");
        }
    }
    
    public void listarProfessores()
    {
        for(IProfessor prof : professores)
        {
            System.out.println(prof.dadosPessoais());
        }
    }
    
}
