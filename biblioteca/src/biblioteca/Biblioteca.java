package biblioteca;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Felipe Naganava
 */
public class Biblioteca {
    
    public static void main(String[] args) throws ParseException{
        
        Livro livro1 = new Livro("Livro 1","João","POO","UEM",2018,1,500);
        Usuario usuario = new Usuario("Felipe",23,'M',"(44) 99999-9999");
        DateFormat f = DateFormat.getDateInstance();
        Date data = f.parse("21/04/2018");
        Emprestimo emprestimo = new Emprestimo(data, "10:34", livro1, usuario);
       
        System.out.println("----Empréstimo----");
        System.out.println(emprestimo.getUsuario().getNome()+ " emprestou o livro "+'"'+ emprestimo.getLivro().getTitulo()+'"');
        System.out.println("Data: "+emprestimo.getData());
        livro1.abrirLivro();
        usuario.lerLivro();
        livro1.fecharLivro();
        emprestimo.devolverLivro(livro1);

    }
}
