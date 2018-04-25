package agenda;

public class main {
    
    public static void main(String[] args){
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(02, 10, 2018, "Dois de outubro de dois mil e dezoito");
        agenda2.anote(40, 20, 2018, "Data errada");
       
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();

    }
}
