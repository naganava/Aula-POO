/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

/**
 *
 * @author guest-gt0syg
 */
public class Aluno {
    private int codigo;
    private String nome;
    private String telefone;
    private String endereco;
    
    public Aluno(){
        
    }
    
    public Aluno(int codigo, String nome, String telefone, String endereco){
        this.codigo = codigo;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void imprimeDados(){
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Endereço: "+this.endereco);
    }

}
