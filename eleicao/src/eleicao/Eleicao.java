package eleicao;

public class Eleicao {
    
    public static void main(String[] args){
        Candidato candidato1 = new Candidato("Felipe");
        Candidato candidato2 = new Candidato("Lula");
        
        candidato1.voto();
        candidato1.voto();
        candidato1.voto();
        candidato1.voto();
        candidato1.voto();
        candidato1.voto();
        candidato1.voto();
        candidato2.voto();
        System.out.println(candidato1.anuncio());
        System.out.println(candidato2.anuncio());
    }
}
