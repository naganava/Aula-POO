
package heranca;

public class Heranca {

    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setCapacidade(5);
        carro.setPlaca("EEQ-1234");
        carro.setnPortas(4);
        carro.setnRodas(4);
        
        moto.setCapacidade(2);
        moto.setPlaca("EEQ-4321");
        moto.setnPortas(0);
        moto.setnRodas(2);
        
        System.err.println(carro.getPlaca());
        System.err.println(moto.getPlaca());
    }
    
}
