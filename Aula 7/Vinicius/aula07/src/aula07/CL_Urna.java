package aula07;

public class CL_Urna {
    private int votos = 0;
    private int votosBrancos = 0;
    private int votosNulos = 0;
    private int totVotos = 0;
    
    public int candidato = 0;
    
    private int[] candidatos = new int[6];
    
    private double porcVotos = 0;
    private double porcNulos = 0;
    private double porcBrancos = 0;
    private double porcCandidato1 = 0;
    private double porcCandidato2 = 0;
    private double porcCandidato3 = 0;
    private double porcCandidato4 = 0;
    private double porcCandidato5 = 0;
    
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
    public void votarBranco()
    {
        votosBrancos += 1;
    }
    public void votarNulo()
    {
        votosNulos += 1;
    }
    public void apurarEleicao()
    {
        totVotos = votos + votosBrancos + votosNulos;
    }
    public void calcularPorc()
    {
        porcBrancos = (100 * votosBrancos) / totVotos;
        porcNulos = (100 * votosNulos) / totVotos;
        porcCandidato1 = (100 * candidatos[1]) / totVotos;
        porcCandidato2 = (100 * candidatos[2]) / totVotos;
        porcCandidato3 = (100 * candidatos[3]) / totVotos;
        porcCandidato4 = (100 * candidatos[4]) / totVotos;
        porcCandidato5 = (100 * candidatos[5]) / totVotos;
        
    }
    public void imprimirResult()
    {
        System.out.println("\nTotal de votos..................: " + totVotos);
        System.out.println("\nPorcentagem votos brancos.......: " + porcBrancos );
        System.out.println("\nPorcentagem votos nulos.........: " + porcNulos);
        System.out.println("\nPorcentagem votos Candidato 1...: " + porcCandidato1);
        System.out.println("\nPorcentagem votos Candidato 2...: " + porcCandidato2);
        System.out.println("\nPorcentagem votos Candidato 3...: " + porcCandidato3);
        System.out.println("\nPorcentagem votos Candidato 4...: " + porcCandidato4);
        System.out.println("\nPorcentagem votos Candidato 5...: " + porcCandidato5);
    }
}
