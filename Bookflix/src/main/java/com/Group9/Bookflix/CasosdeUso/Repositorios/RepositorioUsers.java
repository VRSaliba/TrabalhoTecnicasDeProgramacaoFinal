package com.Group9.Bookflix.CasosdeUso.Repositorios;

import java.util.LinkedList;
import org.springframework.data.repository.CrudRepository;
import com.Group9.Bookflix.Entidades.User;

public interface RepositorioUsers extends CrudRepository<User, String>{
    LinkedList<User> findByName(String nome);
    LinkedList<User> findAll();
}