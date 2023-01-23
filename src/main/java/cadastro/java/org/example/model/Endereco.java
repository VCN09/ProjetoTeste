package cadastro.java.org.example.model;

public class Endereco {
    String logradouro, numero, bairro, cep, cidade, estado;


    public Endereco() {


    }

    public Endereco(String logradouro, String numero, String bairro, String cep, String cidade, String estado){
        setLogradouro(logradouro);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        setCidade(cidade);
        setEstado(estado);

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    void listarEnd() {
        System.out.println("\n Logradouro: " + this.logradouro);
        System.out.println("\n Nº: " + this.numero);
        System.out.println("\n Bairro: " + this.bairro);
        System.out.println("\n CEP: " + this.cep);
        System.out.println("\n Cidade: " + this.cidade);
        System.out.println("\n Estado: " + this.estado);
    }
}
