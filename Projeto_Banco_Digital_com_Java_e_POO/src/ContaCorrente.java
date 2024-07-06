import CLIENTE.Cliente;
import CONTA.CONTA;

public class ContaCorrente extends CONTA{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();
        
        
        
        
    }

    
    
  


    
}
