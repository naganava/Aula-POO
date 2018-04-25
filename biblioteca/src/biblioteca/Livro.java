package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private int nFolhas;
    private boolean emprestimo;
    
    public Livro(String titulo, String autor, String area, String editora, int ano, int edicao, int nFolhas){
        this.ano = ano;
        this.area = area;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.nFolhas = nFolhas;
        this.titulo = titulo;
        this.emprestimo = false;
    }

    Livro() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getnFolhas() {
        return nFolhas;
    }

    public void setnFolhas(int nFolhas) {
        this.nFolhas = nFolhas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void abrirLivro(){
        System.out.println("Livro aberto");
    }
    
    public void fecharLivro(){
        System.out.println("Livro fechado");
    }
    
    
    
}
