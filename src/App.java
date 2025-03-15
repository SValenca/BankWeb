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
            System.out.println();
            System.out.print("Digite o numero da sua agencia: ");
            String numeroAgencia = sc.nextLine();
            System.out.println();

            System.out.print("Digite o telefone da sua agencia: ");
            String telAgencia = sc.nextLine();
            System.out.println();

            System.out.print("Digite o email da sua agencia: ");
            String emailAgencia = sc.nextLine();
            System.out.println();

            agencia = new Agencia(nomeAgencia, numeroAgencia, telAgencia, emailAgencia);

            System.out.print("Digite o numero da sua conta: ");
            String numeroConta = sc.nextLine();
            System.out.println();

            System.out.print("Deseja fazer um deposito inicial? (s/n) ");
            resp = sc.next().charAt(0);
            sc.nextLine();
            if (resp == 's') {
                System.out.print("Digite o valor do seu deposito : ");
                try {
                    String saldoStr = sc.nextLine();
                    double saldoInicial = Double.parseDouble(saldoStr.replace(",", "."));
                    conta = new Conta(numeroConta, saldoInicial, agencia, pessoa);
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido! saldo zero.");
                    conta = new Conta(numeroConta, 0.0, agencia, pessoa);

                }
            } else {
                conta = new Conta(numeroConta, agencia, pessoa);
            }

            System.out.println("\nConta criada com sucesso!");
            System.out.println("Dados da conta:");
            System.out.println(conta);
            System.out.println();

            System.out.print("Deseja fazer um deposito? (s/n) ");
            resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            if (resp == 's') {
                System.out.print("Valor do deposito: ");
                String saldoStr = sc.nextLine();
                double saldo = Double.parseDouble(saldoStr.replace(",", "."));
                conta.deposito(saldo);
                System.out.println("Atualização de saldo:");
                System.out.println(conta);
            }
            System.out.print("Deseja fazer um saque? (s/n) ");
            resp = sc.next().charAt(0);
            sc.nextLine();
            if (resp == 's') {
                System.out.print("Digite o valor do saque: ");
                String saldoStr = sc.nextLine();
                double saqueConta = Double.parseDouble(saldoStr.replace(",", "."));
                conta.saque(saqueConta);
                System.out.println("Atualização de saldo:");
                System.out.println(conta);
            }

        } catch (Exception e) {
            System.err.println("Erro: ");
        }
        sc.close();
    }
}