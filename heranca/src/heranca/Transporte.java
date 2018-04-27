package heranca;

public class Transporte {
    protected int capacidade;
    
    public Transporte(int capacidade){
        super();
        this.capacidade = capacidade;
    }
    
    public Transporte(){
        
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
