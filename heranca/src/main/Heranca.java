
package main;

import heranca.Automovel;

public class Heranca {

    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        Automovel carro2 = new Automovel(4,4,"ABC-1234",2);
        
        carro.setCapacidade(5);
        carro.setPlaca("EEQ-1234");
        carro.setnPortas(4);
        carro.setnRodas(4);
        
        moto.setCapacidade(2);
        moto.setPlaca("EEQ-4321");
        moto.setnPortas(0);
        moto.setnRodas(2);
        
        System.err.println("****CARRO****");
        carro.imprimeDadosAutomovel();
        
        System.err.println("****MOTO****");
        moto.imprimeDadosAutomovel();
        
        System.err.println("****CARRO 2****");
        carro2.imprimeDadosAutomovel();
    }
    
}
