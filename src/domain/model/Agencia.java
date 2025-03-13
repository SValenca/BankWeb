package domain.model;

public class Agencia {
    private String nome;
    private String numero;
    private String tel;
    private String email;

    public Agencia(String nome, String numero, String tel, String email) {
        this.nome = nome;
        this.numero = numero;
        this.tel = tel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
