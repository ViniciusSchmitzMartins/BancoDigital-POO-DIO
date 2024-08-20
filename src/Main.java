//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "Rua B, 456");

        // Criando contas
        Conta conta1 = new ContaPoupanca(cliente1);
        Conta conta2 = new ContaCorrente(cliente2);

        // Criando banco e adicionando contas
        Banco banco = new Banco();
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Realizando operações
        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(300, conta2);

        // Imprimindo extratos
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        // Imprimindo todas as contas do banco
        banco.imprimeContas();




    }
}