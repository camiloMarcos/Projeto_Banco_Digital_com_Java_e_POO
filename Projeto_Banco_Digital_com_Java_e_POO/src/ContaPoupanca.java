import CLIENTE.Cliente;
import CONTA.CONTA;

public class ContaPoupanca extends CONTA{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfoComuns();
        
    }

    



}


