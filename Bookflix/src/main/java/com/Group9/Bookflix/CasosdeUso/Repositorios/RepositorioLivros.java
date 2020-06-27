package com.Group9.Bookflix.CasosdeUso.Repositorios;

import java.util.LinkedList;
import org.springframework.data.repository.CrudRepository;
import com.Group9.Bookflix.Entidades.Livro;

public interface RepositorioLivros extends CrudRepository<Livro, String>{
    LinkedList<Livro> findByName(String nome);
    LinkedList<Livro> findAll();
}