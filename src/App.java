import domain.model.Agencia;
import domain.model.Conta;
import domain.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         try {                                                      //try- tente
            
             Agencia agencia = new Agencia();
             Pessoa pessoa = new Pessoa("Joelson da Silva","joelsondasilva@gmail.com", "+55 (21) 777-88888");
             Conta conta = new Conta();
             
             agencia.nome = "Campo Grande";
             agencia.numero = "001";
             agencia.email= "campograndedev@gmail.com";
             agencia.tel= "+55 (21) 400-28922";
             
             //pessoa.setNome("Joelson da Silva"); 
             pessoa.setCpf("123.456.789-10"); 
            // pessoa.setEmail("joelsondasilva@gmail.com");
             //pessoa.setTel("+55 (21) 777-88888");
             
             conta.numero = "100001";
             conta.agencia = agencia;
             conta.pessoa = pessoa;
             conta.saldo = 1000;
             
             System.out.println("Agencia:" + conta.agencia.nome);
             System.out.println("Cliente: " + conta.pessoa.getNome());
             System.out.println("Saldo: " + conta.saldo);
             
            } catch (Exception e) {                                  //catch se der erro no try ele trata o erro   
               System.err.println(e.getLocalizedMessage());          //Exception class que trata erros
            }
            }
        }
        