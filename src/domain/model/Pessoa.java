package domain.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String cnpj;
    private String dataNasc;
    private String email;
    private String tel;

    // Construtor para pessoa física (CPF)
    public Pessoa(String nome, String email, String tel, String dataNasc, String cpf) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setTel(tel);
        this.setdataNasc(dataNasc);
        this.setCpf(cpf);
    }

    // Construtor para pessoa jurídica (CNPJ)
    public Pessoa(String nome, String email, String tel, String dataNasc, String cnpj, boolean isPJ) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setTel(tel);
        this.setdataNasc(dataNasc);
        this.setCnpj(cnpj);
    }

    // Se quiser manter o construtor original de CNPJ, adicione a data
    public Pessoa(String nome, String email, String tel, String cnpj) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setTel(tel);
        this.setCnpj(cnpj);
        // Data de nascimento fica como null para pessoa jurídica
    }

    public void setNome(String nome) throws Exception { // O método .EQUALS é utilizado para comparações.
        if (nome.trim().equals("")) // THROWS (com S no final) é usada em um método para informar ao código de
                                    // chamada (quem chamou seu método)
            throw new Exception("nome em branco!"); // que esse método pode gerar uma exceção (dentro dele tem algum
                                                    // código que gera exception) e que
        this.nome = nome.trim(); // o próprio método não trata (não tem try/catch).

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setdataNasc(String dataNasc) throws Exception {
        if (dataNasc.trim().equals(""))
            throw new Exception("Data em branco");
        this.dataNasc = dataNasc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTel() {
        return this.tel;
    }

}
