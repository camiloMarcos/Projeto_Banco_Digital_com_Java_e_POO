import CONTA.CONTA;

public interface IConta {


    public void sacar(double valor);
    
    public void depositar(double valor);
    
    public void  transferir(double valor, CONTA contaDestino);
    
    void imprimirExtrato();

    public void mprimirListaClientes(); // ****************************************************************

}
