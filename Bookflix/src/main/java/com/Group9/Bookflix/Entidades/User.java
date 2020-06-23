package com.Group9.Bookflix.Entidades;

import java.util.List;

public class User {
    private String userName;
    private String senha;
    private List livrosLidos;

    public User(String userName, String senha, List livreosLidos){
        this.userName = userName;
        this.senha = senha;
        this.livrosLidos = livrosLidos;
    }

    public static class UserBuilder{
        private String userName;
        private String senha;
        private List livrosLidos;

        public UserBuilder(){}

        public UserBuilder setUserName(String userName){
            this.userName = userName;
            return this;
        }
        public UserBuilder setSenha(String senha){
            this.senha = senha;
            return this;
        }
        public UserBuilder setLivrosLidos(List livrosLidos){
            this.livrosLidos = livrosLidos;
            return this;
        }

        public User build(){
            return new User(userName, senha, livrosLidos);
        }
    }
    

    //---Gets------------------------------------------------------------------------
    public String getUserName(){
        return userName;
    }
    public String getSenha(){
        return senha;
    }
    public List getLivrosLidos(){
        return livrosLidos;
    }

}

