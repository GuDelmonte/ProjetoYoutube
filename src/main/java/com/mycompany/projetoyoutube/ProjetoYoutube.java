package com.mycompany.projetoyoutube;

import java.security.Guard;

public class ProjetoYoutube {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        
        v[0] = new Video("Estudando POO");
        v[1] = new Video ("Exercício de revisão");
        v[2] = new Video ("Encapsulamento, Herança e Polimorfismo");
        
        Aluno a[] = new Aluno[2];
        
        a[0] = new Aluno("Gustavo", 18, "M", "Delmonte");
        a[1] = new Aluno ("Julia", 17, "F", "Bustamante");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis [0] = new Visualizacao(a[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());  
        
        vis[1] = new Visualizacao(a[0], v[1]);
        vis[0].avaliar(87.0f);
        
        System.out.println(vis[1].toString());
    }
}
