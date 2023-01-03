package org.example;
import java.util.ArrayList;


public class Lista {
    ArrayList<Usuario> listaDeUsuarios;


    public Lista() {
        this.listaDeUsuarios = new ArrayList<>();
    }

    void inserirUsuario(Usuario novoUsuario) {
        listaDeUsuarios.add(novoUsuario);

    }

    void listarUsuario() {
        System.out.println("\n Lista de Usuários");

        for (Usuario usuarioNaLista : listaDeUsuarios) {
            usuarioNaLista.listar();

        }
    }

}

