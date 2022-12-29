package org.example;

import java.util.Scanner;                   // importação da classe scanner para ler a entrada do usuário no teclado!


public class Cadastro {

    public static void main(String[] args) {
        int opc;                                                       // variáveis: opção, as strings, das classes!

        String nome, sexo, email, logradouro, bairro, cidade, estado;
        String idade, matricula, telefone, numero, cep;

        Lista novaLista = new Lista();

        Usuario novoUsuario = new Usuario();

        Endereco novoEndereco = new Endereco();

        Scanner teclado;

        teclado = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("     MENU");
            System.out.println("Escolha uma Ação");
            System.out.println("1 - Inserir Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("3 - Inserir Endereço");
            System.out.println("0 - Sair");

            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc) {

                case 1:
                    System.out.println("\n NOME: " );
                    nome = teclado.nextLine();
                    System.out.println("\n IDADE: ");
                    idade = teclado.nextLine();
                    System.out.println("\n SEXO: ");
                    sexo = teclado.nextLine();
                    System.out.println("\n MATRÍCULA: ");
                    matricula = teclado.nextLine();
                    System.out.println("\n TELEFONE: ");
                    telefone = teclado.nextLine();
                    System.out.println("\n E-MAIL: ");
                    email = teclado.nextLine();

                    novoUsuario = new Usuario (nome, idade, sexo, matricula, telefone, email);
                    novaLista.inserirUsuario(novoUsuario);

                    break;

                case 2:
                    novaLista.listarUsuario();
                    novaLista.listarEndereco();

                    break;

                case 3:
                    System.out.println("\n LOGRADOURO: ");
                    logradouro = teclado.nextLine();
                    System.out.println("\n Nº: ");
                    numero = teclado.nextLine();
                    System.out.println("\n BAIRRO: ");
                    bairro = teclado.nextLine();
                    System.out.println("\n CEP: ");
                    cep = teclado.nextLine();
                    System.out.println("\n CIDADE: ");
                    cidade = teclado.nextLine();
                    System.out.println("\n ESTADO: ");
                    estado = teclado.nextLine();

                    novoEndereco = new Endereco (logradouro, numero, bairro, cep, cidade, estado);
                    novaLista.inserirEndereco(novoEndereco);

                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("\n Opção Inválida!");
            }
        }
        while (opc != 0);

    }

}

