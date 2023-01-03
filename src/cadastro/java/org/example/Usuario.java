package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome, idade, sexo, matricula, telefone, email;
    List<Endereco> enderecos;
    private int senha;

    public Usuario(){

    }

    public Usuario(String nome, String idade, String sexo, String matricula, String telefone, String email){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setMatricula(matricula);
        setTelefone(telefone);
        setEmail(email);
        this.enderecos = new ArrayList<>();


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void listar() {
        System.out.println("\n Nome: " + this.nome);
        System.out.println("\n Idade: " + this.idade);
        System.out.println("\n Sexo: " + this.sexo);
        System.out.println("\n Matrícula: " + this.matricula);
        System.out.println("\n Telefone: " + this.telefone);
        System.out.println("\n E-Mail: " + this.email);

        System.out.println("\n Logradouro: " + this.enderecos.get(0).logradouro);
        System.out.println("\n Nº: " + this.enderecos.get(0).numero);
        System.out.println("\n Bairro: " + this.enderecos.get(0).bairro);
        System.out.println("\n CEP: " + this.enderecos.get(0).cep);
        System.out.println("\n Cidade: " + this.enderecos.get(0).cidade);
        System.out.println("\n Estado: " + this.enderecos.get(0).estado);

    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
