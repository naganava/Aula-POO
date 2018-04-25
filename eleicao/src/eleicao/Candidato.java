package eleicao;

public class Candidato {
    private final String nome;
    private int nVotos;

    public Candidato(String nome){
        this.nome = nome;
        this.nVotos = 0;
    }
    
    public void voto(){
        this.nVotos += 1;
    }
    
    public String anuncio(){
        String ret = this.nome +" possui " + this.nVotos + " voto(s)" ;
        return ret;
    }
    
    
}
