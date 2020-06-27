package com.Group9.Bookflix.Entidades;


import java.io.File;

public class Livro {
    private String nome;
    private String sinopse;
    private String categoria;
    private String autor;
    private int id;
    private int avaliacao;
    private File livroFile;

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

    public static class LivroBuilder {
        private String nome;
        private String sinopse;
        private String categoria;
        private String autor;
        private int id;
        private int avaliacao;
        private File livroFile;

        public LivroBuilder(){}

        public LivroBuilder setNome(String str){
            this.nome = str;
            return this;
        }
        public LivroBuilder setSinopse(String str){
            this.sinopse = str;
            return this;
        }
        public LivroBuilder setCategoria(String str){
            this.categoria = str;
            return this;
        }
        public LivroBuilder setAutor(String str){
            this.autor = str;
            return this;
        }
        public LivroBuilder setID(int id){
            this.id = id;
            return this;
        }
        public LivroBuilder setAvaliacao(int ava){
            this.avaliacao = ava;
            return this;
        }
        public LivroBuilder setFile(File file){
            this.livroFile = file;
            return this;
        }

        public Livro build(){
            return new Livro(nome, sinopse, categoria, autor, id, avaliacao, livroFile);
        }
    }
    
    //---Sets------------------------------------------------------------------------
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
}
