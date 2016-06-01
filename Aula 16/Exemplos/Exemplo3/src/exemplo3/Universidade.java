package exemplo3;

import java.util.ArrayList;

public class Universidade {
    
    private IFaxineira faxineira;    
    private ArrayList<IProfessor> professores;
    
    public Universidade()
    {
        professores = new ArrayList<>();
    }

    public void setFaxineira(IFaxineira paramFaxineira)
    {
        this.faxineira = paramFaxineira;
    }
    
    public void diaDaLimpeza()
    {
        faxineira.lavar();
        faxineira.varrer();
        faxineira.tirarLixo();
    }
    
    public void adicionarProfessor(IProfessor professor)
    {
        professores.add(professor);
    }
    
    public void listarProfessores()
    {
        for(IProfessor prof : professores)
        {
            System.out.println(prof.dadosPessoais());
        }
    }
    
}
