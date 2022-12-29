package org.example;
import java.util.ArrayList;


public class Lista {
    ArrayList<Usuario> listaDeUsuarios;
    ArrayList<Endereco> listaDeEnderecos;


    public Lista() {
        this.listaDeUsuarios = new ArrayList<>();
        this.listaDeEnderecos = new ArrayList<>();


    }

    void inserirUsuario(Usuario novoUsuario) {
        listaDeUsuarios.add(novoUsuario);

    }

    void inserirEndereco(Endereco novoEndereco) {
        listaDeEnderecos.add(novoEndereco);

    }

    void listarUsuario() {
        System.out.println("\n Lista de Usuários");

        for (Usuario usuarioNaLista : listaDeUsuarios) {
            usuarioNaLista.listar();

        }
    }

    void listarEndereco() {
        System.out.println("\n Lista de Endereços");

        for (Endereco enderecoNaLista : listaDeEnderecos) {
            enderecoNaLista.listarEnd();
        }
    }

}
