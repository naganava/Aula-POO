package heranca;

public class Terrestre extends Transporte{
    protected int nRodas;
    
    public Terrestre(int capacidade, int nRodas){
        super(capacidade);
        this.nRodas = nRodas;
    }
    
    public Terrestre(){
        
    }

    public int getnRodas() {
        return nRodas;
    }

    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
    
    
}
