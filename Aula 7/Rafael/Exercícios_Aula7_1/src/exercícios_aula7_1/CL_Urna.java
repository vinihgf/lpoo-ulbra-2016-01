package exercícios_aula7_1;

public class CL_Urna
{
    private int votos = 0;
    private int votosBrancos = 0;
    private int votosNulos = 0;
    private int totalVotos = 0;
    
    public int candidato = 0;
    
    private int[] candidatos = new int[6];
    
    private double porcentagemVotos = 0;
    private double porcentagemBrancos = 0;
    private double porcentagemNulos = 0;
    private double porcentagemCandidato1 = 0;
    private double porcentagemCandidato2 = 0;
    private double porcentagemCandidato3 = 0;
    private double porcentagemCandidato4 = 0;
    private double porcentagemCandidato5 = 0;
    
    public void votar()
    {
        votos = votos + 1;
        if(candidato == 1)
        {
            candidatos[candidato] += 1;
        }
        else if(candidato == 2)
        {
            candidatos[candidato] += 1;
        }
        else if(candidato == 3)
        {
            candidatos[candidato] += 1;
        }
        else if(candidato == 4)
        {
            candidatos[candidato] += 1;
        }
        else if(candidato == 5)
        {
            candidatos[candidato] += 1;
        }
    }
    
    public void votarbranco()
    {
        votosBrancos = votosBrancos + 1;
    }
    
    public void votarnulo()
    {
        votosNulos = votosNulos + 1;
    }
    
    public void apurareleicao()
    {
        totalVotos = votos + votosBrancos + votosNulos;
    }
    
    public void caculcarpaciais()
    {
        porcentagemBrancos = (100 * votosBrancos)/totalVotos;
        porcentagemNulos = (100 * votosNulos)/totalVotos;
        porcentagemCandidato1 = (100 * candidatos[1])/totalVotos;
        porcentagemCandidato2 = (100 * candidatos[2])/totalVotos;
        porcentagemCandidato3 = (100 * candidatos[3])/totalVotos;
        porcentagemCandidato4 = (100 * candidatos[4])/totalVotos;
        porcentagemCandidato5 = (100 * candidatos[5])/totalVotos;
    }
    public void imprimirresultados()
    {
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Porcentagem de votos em branco: " + porcentagemBrancos + "%");
        System.out.println("Porcentagem de votos nulos: " + porcentagemNulos + "%");
        System.out.println("Porcentagem de votos para o Candidato Número 1: " + porcentagemCandidato1 + "%");
        System.out.println("Porcentagem de votos para o Candidato Número 2: " + porcentagemCandidato2 + "%");
        System.out.println("Porcentagem de votos para o Candidato Número 3: " + porcentagemCandidato3 + "%");
        System.out.println("Porcentagem de votos para o Candidato Número 4: " + porcentagemCandidato4 + "%");
        System.out.println("Porcentagem de votos para o Candidato Número 5: " + porcentagemCandidato5 + "%");
    }
}