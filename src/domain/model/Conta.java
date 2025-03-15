package domain.model;

public class Conta {
    private static double saldo;
    private static String numero;
    private static Agencia agencia;
    private static Pessoa pessoa;
    private static final double TARIFA_SAQUE = 5.0;

    public Conta(String numero, Agencia agencia, Pessoa pessoa) {
        Conta.numero = numero;
        Conta.agencia = agencia;
        Conta.pessoa = pessoa;
    }

    public Conta(String numero, double saldoInicial, Agencia agencia, Pessoa pessoa) {
        Conta.numero = numero;
        deposito(saldoInicial);
        Conta.agencia = agencia;
        Conta.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        Conta.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        Conta.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        Conta.agencia = agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        Conta.pessoa = pessoa;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        saldo -= quantia + TARIFA_SAQUE;
    }

    public String toString() {
        return "Conta: "
                + numero
                + ","
                + " Titular: "
                + pessoa.getNome()
                + ", Saldo: $"
                + String.format("%.2f", saldo);
    }
}
