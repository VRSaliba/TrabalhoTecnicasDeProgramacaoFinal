package com.Group9.Bookflix.CasosdeUso.Politicas;

import java.util.LinkedList;

import com.Group9.Bookflix.CasosdeUso.Repositorios.RepositorioLivros;
import com.Group9.Bookflix.Entidades.Livro;
import org.springframework.stereotype.Component;

//@Component
public class RecomendaLivros {

    public LinkedList<Livro> recomendaLivros(LinkedList<Livro> livrosLidos, RepositorioLivros livros){
        LinkedList<Livro> recomendados = new LinkedList<Livro>();
        int[] contadores = new int[4];
        // 0 = Geral
        // 1 = Fitness
        // 2 = Culinaria
        // 3 = Batatas
        for(int i=0; i<contadores.length; i++){
            contadores[i]=0;
        }
        for(Livro l: livrosLidos){
            switch(l.getCategoria()){
                case "Batatas":
                    contadores[3]++;
                    break;
                case "Fitness":
                    contadores[1]++;
                    break;
                case "Culinaria":
                    contadores[2]++;
                    break;
                default:
                    contadores[0]++;
                    break;   
            }
        }
        int maior = 0;
        for(int k=0; k<contadores.length; k++){
            if(contadores[k]>maior){
                maior = contadores[k];
            }
        }
        int indice = 0;
        for(int j=0; j<contadores.length; j++){
            if(maior == contadores[j]){
                indice = j;
            }
        }
        LinkedList<Livro> listaFull = livros.findAll();
        for(Livro l: listaFull){
            switch(indice){
                case 1:
                    if(l.getCategoria().equals("Fitness")){
                        recomendados.add(l);
                    }
                    break;
                case 2:
                    if(l.getCategoria().equals("Culinaria")){
                        recomendados.add(l);
                    }
                    break;
                case 3:
                    if(l.getCategoria().equals("Batatas")){
                        recomendados.add(l);
                    }
                    break;
                default:
                    recomendados.add(l);
                    break;   
            }
        }
        return recomendados;
    }
}