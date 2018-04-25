package biblioteca;

import java.util.Date;

public class Emprestimo {

    private Date data;
    private String hora;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Date data, String hora, Livro livro, Usuario usuario) {
        this.data = data;
        this.hora = hora;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Emprestimo() {

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livros) {
        this.livro = livros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void devolverLivro(Livro livro){
        this.livro.setEmprestimo(true);
        System.out.println("Livro devolvido");
    }

}
