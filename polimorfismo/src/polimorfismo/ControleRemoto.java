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
public class ControleRemoto {
    private Brinquedo brinquedo;
    public ControleRemoto(Brinquedo b){
        this.brinquedo = b;
    }
    
    public ControleRemoto(){
        
    }

    public void setBrinquedo(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    public void mover(){
        brinquedo.mover();
    }
    
    
    
}
