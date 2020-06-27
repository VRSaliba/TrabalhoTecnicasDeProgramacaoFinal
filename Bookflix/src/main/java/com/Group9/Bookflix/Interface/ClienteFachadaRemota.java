package com.Group9.Bookflix.Interface;

import java.util.LinkedList;

import com.Group9.Bookflix.CasosdeUso.Servicos.BookflixService;
import com.Group9.Bookflix.Entidades.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta_usuario")
public class ClienteFachadaRemota {
    private BookflixService bookflixService;

    @Autowired
	public ClienteFachadaRemota(BookflixService bookflixService) {
		this.bookflixService = bookflixService;
	}
    
    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/dadosUsuario")
    public User getDadosUsuario(@RequestParam String username){
        User aluno = bookflixService.getDadosUsuario(username);
        return aluno;
    }

    @CrossOrigin(origins = "*")//"http://localhost")
    @GetMapping("/todosUsuarios")
    public LinkedList<User> getListaUsuarios(){
        LinkedList<User> alunos = bookflixService.get();
        return alunos;
    }    
    @CrossOrigin(origins = "*") 
    @GetMapping("/aprovacao")
    public boolean getAprovado(@RequestParam Integer matricula){
        boolean aprovado = bookflixService.aprovado(matricula);
        return aprovado;
    }
}