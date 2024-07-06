

import CLIENTE.Cliente;
import CONTA.CONTA;

public class Main {

    public static void main(String[] args) {
        Cliente camilo = new Cliente();
        camilo.setNome("Camilo");
        
        CONTA cc = new ContaCorrente(camilo);
        CONTA poupanca = new  ContaPoupanca(camilo);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    
    }

}
