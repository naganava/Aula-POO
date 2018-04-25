package poo;

public class Poo {
    
    public static void main(String[] args){
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro("TRABALHO","BRANCO","EOQ-4321",2);
        Pessoa eu = new Pessoa();
        Pessoa voce = new Pessoa("JOÃO","LOIRO","GORDO",18);
        
        meuCarro.setCor("PRETO");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("EOQ-1234");
        meuCarro.setTipo("PASSEIO");
        
        eu.setBiotipo("MAGRO");
        eu.setCorDoCabelo("CASTANHO");
        eu.setIdade(23);
        eu.setNome("FELIPE");
        eu.setCarro(meuCarro);
        
        meuCarro.setDono(eu);
        seuCarro.setDono(voce);
        
        eu.desligarCarro();
        
        
    }
    
}
