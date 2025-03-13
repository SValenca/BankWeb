package domain.model;

public class Conta {
    private double saldo;
    private String numero;
    private Agencia agencia;
    private Pessoa pessoa;

    public Conta(String numero, double saldo, Agencia agencia, Pessoa pessoa) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
