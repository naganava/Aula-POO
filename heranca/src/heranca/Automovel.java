package heranca;

public class Automovel extends Terrestre{
    private int nPortas;
    private String placa;
    
    public Automovel(int capacidade, int nRodas, String placa, int nPortas){
        super(capacidade, nRodas);
        this.nPortas = nPortas;
        this.placa = placa;
    }
    
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
    
    public void imprimeDadosAutomovel(){
        System.out.println("CAPACIDADE: "+ capacidade);
        System.out.println("NÚMEROS DE RODAS: "+ nRodas);
    }
}
