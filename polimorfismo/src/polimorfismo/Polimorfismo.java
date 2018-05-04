/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author guest-muceyu
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        Aviao aviao = new Aviao();
        Barco barco = new Barco();
        
        
        ControleRemoto controleRemoto = new ControleRemoto(carro);
        controleRemoto.mover();
        controleRemoto.setBrinquedo(barco);
        controleRemoto.mover();
        controleRemoto.setBrinquedo(aviao);
        controleRemoto.mover();
    }
    
}
