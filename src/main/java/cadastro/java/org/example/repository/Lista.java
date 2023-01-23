package cadastro.java.org.example.repository;
import cadastro.java.org.example.model.Usuario;

import java.util.ArrayList;


public class Lista {
    public ArrayList<Usuario> listaDeUsuarios;


    public Lista() {
        this.listaDeUsuarios = new ArrayList<>();
    }

    public void inserirUsuario(Usuario novoUsuario) {
        listaDeUsuarios.add(novoUsuario);

    }

    public void listarUsuario() {
        System.out.println("\n Lista de Usuários");

        for (Usuario usuarioNaLista : listaDeUsuarios) {
            usuarioNaLista.listar();

        }
    }

}

