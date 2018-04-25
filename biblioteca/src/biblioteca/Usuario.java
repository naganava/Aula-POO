package biblioteca;

public class Usuario {
    private String nome;
    private int idade;
    private char sexo;
    private String telefone;
    
    public Usuario(String nome, int idade, char sexo, String telefone){
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    
    public Usuario(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void lerLivro(){
        System.out.println("Lendo o livro");
    }
    
    
}
