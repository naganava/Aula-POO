package heranca;

public class Automovel extends Terrestre{
    private int nPortas;
    private String placa;
    
    public Automovel(){
        
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
