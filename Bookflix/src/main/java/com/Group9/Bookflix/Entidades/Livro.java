package com.Group9.Bookflix.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String nome;
    private String sinopse;
    private String categoria;
    private String autor;
    private int id;
    private int avaliacao;
    private File livroFile;

    protected Livro(){
    }

    public Livro(String nome, String sinopse, String categoria, String autor, int id,
    int avaliacao, File livroFile){
        this.nome = nome;
        this.sinopse = sinopse;
        this.categoria = categoria;
        this.autor = autor;
        this.id = id;
        this.avaliacao = avaliacao;
        this.livroFile = livroFile;
    }

    
    //---Sets------------------------------------------------------------------------
    public void setNome(String str){
        this.nome = str;
    }
    public void setSinopse(String str){
        this.sinopse = str;
    }
    public void setCategoria(String str){
        this.categoria = str;
    }
    public void setAutor(String str){
        this.autor = str;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setFile(File file){
        this.livroFile = file;
    }
    public void setAvaliacao(int ava){
        this.avaliacao = ava;
    }

    //---Gets------------------------------------------------------------------------
    public String getNome(){
        return nome;
    }
    public String getSinopse(){
        return sinopse;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getAutor(){
        return autor;
    }
    public int getID(){
        return id;
    }
    public int getAvaliacao(){
        return avaliacao;
    }
    public File getFile(){
        return livroFile;
    }

    @Override
    public String toString() {
        return "Livro=> Nome:"+ nome +", ID: "+ id +", Autor: "+ autor+" Categoria: "+ categoria + " Autor: "+autor+" Avaliacao:"+avaliacao+"]";
    }

}
