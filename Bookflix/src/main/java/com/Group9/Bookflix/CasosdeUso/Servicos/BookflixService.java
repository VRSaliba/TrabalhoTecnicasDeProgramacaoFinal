package com.Group9.Bookflix.CasosdeUso.Servicos;

import java.util.LinkedList;

import com.Group9.Bookflix.CasosdeUso.Repositorios.RepositorioLivros;
import com.Group9.Bookflix.CasosdeUso.Repositorios.RepositorioUsers;
import com.Group9.Bookflix.Entidades.Livro;
import com.Group9.Bookflix.Entidades.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookflixService {
    private RepositorioLivros repLivros;
    private RepositorioUsers repUsers;
    private User usuario;
    private Livro livro;

    @Autowired
    public BookflixService(RepositorioLivros repLivros, RepositorioUsers repUsers){
        this.repLivros = repLivros;
        this.repUsers = repUsers;
        usuario = null;
        livro = null;
    }

    public User getDadosUsuario(String username){
        LinkedList<User> usuariosL = repUsers.findByName(username);
        if (usuariosL.size() == 0){
            throw new IllegalArgumentException("Aluno nao encontrado");
        }else{
            usuario = usuariosL.get(0) ;
            return usuario;
        }
    }

    public Livro getDadosLivroNome(String nomeL){
        LinkedList<Livro> livroLista = repLivros.findByName(nomeL);
        if (livroLista.size() == 0){
            throw new IllegalArgumentException("Aluno nao encontrado");
        }else{
            livro = livroLista.get(0) ;
            return livro;
        }
    }

    public LinkedList<Livro> listaLivros(RepositorioLivros livros){
        return livros.findAll(); 
    }

    public LinkedList<User> listaDeUsuarios(){
        return repUsers.findAll();
    } 


}