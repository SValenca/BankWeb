import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         
        Agencia agencia = new Agencia();
        Pessoa pessoa = new Pessoa();
        Conta conta = new Conta();
        agencia.nome = "Campo Grande";
        agencia.numero = "001";
        agencia.email= "campograndedev@gmail.com";
        agencia.tel= "+55 (21) 400-28922";

        pessoa.nome = "Joelson da Silva";
        pessoa.cpf = "123.456.789-10";
        pessoa.email = "joelsondasilva@gmail.com";
        pessoa.tel = "+55 (21) 777-88888";

        conta.numero = "100001";
        conta.agencia = agencia;
        conta.pessoa = pessoa;

        System.out.println("Agencia:" + conta.agencia.nome);
        System.out.println("Cliente: " + conta.pessoa.nome);
        System.out.println("Saldo: " + conta.saldo);

    }
}
