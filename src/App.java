import java.util.Scanner;
import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        try {
            Agencia agencia;
            Pessoa pessoa;
            Conta conta = null;
            char resp;

            System.out.print("Digite o seu nome: ");
            String nomePessoa = sc.nextLine();

            System.out.print("Digite o seu email: ");
            String emailPessoa = sc.nextLine();

            System.out.print("Digite o seu numero de telefone: ");
            String telPessoa = sc.nextLine();

            System.out.print("Digite sua data de nascimento: ");
            String dataNasc = sc.nextLine();

            System.out.println("Deseja cadastrar seu cpf ? (s/n)");
            resp = sc.next().charAt(0);
            sc.nextLine();

            if (resp == 's') {
                System.out.print("Digite seu cpf: ");
                String cpf = sc.nextLine();
                pessoa = new Pessoa(nomePessoa, emailPessoa, telPessoa, dataNasc, cpf);
            } else {
                System.out.print("Digite seu cnpj: ");
                String cnpj = sc.nextLine();

                pessoa = new Pessoa(nomePessoa, emailPessoa, telPessoa, dataNasc, null);
                pessoa.setCnpj(cnpj);
            }

            System.out.print("Digite o nome da sua agencia: ");
            String nomeAgencia = sc.nextLine();

            System.out.print("Digite o numero da sua agencia: ");
            String numeroAgencia = sc.nextLine();

            System.out.print("Digite o telefone da sua agencia: ");
            String telAgencia = sc.nextLine();

            System.out.print("Digite o email da sua agencia: ");
            String emailAgencia = sc.nextLine();

            agencia = new Agencia(nomeAgencia, numeroAgencia, telAgencia, emailAgencia);

            System.out.print("Digite o numero da sua conta: ");
            String numeroConta = sc.nextLine();

            System.out.print("Deseja fazer um deposito inicial? (s/n) ");
            resp = sc.next().charAt(0);
            sc.nextLine();

            if (resp == 's') {
                System.out.print("Digite o valor do seu deposito (use ponto como separador decimal, ex: 100.50): ");
                try {

                    String saldoStr = sc.nextLine();
                    double saldo = Double.parseDouble(saldoStr.replace(",", "."));
                    conta = new Conta(numeroConta, saldo, agencia, pessoa);
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido! Assumindo saldo zero.");
                    conta = new Conta(numeroConta, 0.0, agencia, pessoa);
                }
            } else {

                conta = new Conta(numeroConta, 0.0, agencia, pessoa);
            }

            System.out.println("\nConta criada com sucesso!");
            System.out.println("Agencia: " + conta.getAgencia().getNome());
            System.out.println("Cliente: " + conta.getPessoa().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        sc.close();
    }
}