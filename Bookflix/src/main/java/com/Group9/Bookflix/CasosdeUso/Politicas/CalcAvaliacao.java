package com.Group9.Bookflix.CasosdeUso.Politicas;

import com.Group9.Bookflix.Entidades.Livro;
import org.springframework.stereotype.Component;

//@Component
public class CalcAvaliacao {

    public void calculaAva(Livro livro, int novaAva) {
        int novaAvaG = livro.getAvaliacao() + novaAva;
        livro.setAvaliacao(novaAvaG/2);
    }
}