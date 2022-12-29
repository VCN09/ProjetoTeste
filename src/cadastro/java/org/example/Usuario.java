package org.example;

public class Usuario {
    String nome, idade, sexo, matricula, telefone, email;

    public Usuario(){

    }

    public Usuario(String nome, String idade, String sexo, String matricula, String telefone, String email){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setMatricula(matricula);
        setTelefone(telefone);
        setEmail(email);

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


    }
}
