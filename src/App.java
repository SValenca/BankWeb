import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try { // try- tente

            Agencia agencia = new Agencia("Campo Grande", "011", "(21)777-88888", "campograndedev@gmail.com");
            Pessoa pessoa = new Pessoa("Joelson", "joelsondasilva@gmail.com", "(21)94002-8922", "15/02/1998",
                    "123.456.789-10");
            Conta conta = new Conta("100001", 1000, agencia, pessoa);

            System.out.println("Agencia:" + conta.getAgencia().getNome());
            System.out.println("Cliente: " + conta.getPessoa().getNome());
            System.out.println("Saldo: " + conta.getSaldo());

        } catch (Exception e) { // catch se der erro no try ele trata o erro
            System.err.println(e.getLocalizedMessage()); // Exception class que trata erros
        }
    }
}
