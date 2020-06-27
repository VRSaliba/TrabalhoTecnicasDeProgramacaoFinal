package com.Group9.Bookflix.Entidades;

import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String userName;
    private String senha;
    private LinkedList<Livro> livrosLidos;
    
    protected User(){        
    }

    public User(String userName, String senha, LinkedList<Livro> livrosLidos){
        this.userName = userName;
        this.senha = senha;
        this.livrosLidos = livrosLidos;
    }

    //---Sets------------------------------------------------------------------
    public String getUserName(){
        return userName;
    }
    public String getSenha(){
        return senha;
    }
    public void addLivrosLidos(Livro livro){
        livrosLidos.add(livro);
    }

    //---Gets------------------------------------------------------------------
    public String getUserName(){
        return userName;
    }
    public String getSenha(){
        return senha;
    }
    public LinkedList<Livro> getLivrosLidos(){
        return livrosLidos;
    }

    @Override
    public String toString() {
        return "Usuario=> Nome:"+ userName +", Senha: "+ senha +", Livros Lidos: "+ livrosLidos+"]";
    }

}

