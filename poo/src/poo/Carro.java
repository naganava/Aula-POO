package poo;

public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private Pessoa dono;
    private int cambio;
    
    public Carro(String tipo,String cor,String placa,int numPortas){
        this.cor = cor;
        this.numPortas = numPortas;
        this.placa = placa;
        this.tipo = tipo;
    }
    
    public Carro(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public int getCambio() {
        System.out.println("MARCHA "+this.cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    
    void ligar(){
        System.out.println("CARRO LIGADO");
    }
    
    void desligar(){
        System.out.println("CARRO DESLIGADO");
    }
    
    void acelerar(){
        System.out.println("CARRO ACELERANDO");
    }
    
    void frear(){
        System.out.println("CARRO FREANDO");
    }
    
    
}
