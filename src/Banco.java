import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void imprimeContas() {
        if (!contas.isEmpty()) {
            contas.forEach(System.out::println);
        } else {
            throw new RuntimeException("Não existem contas");
        }
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}

