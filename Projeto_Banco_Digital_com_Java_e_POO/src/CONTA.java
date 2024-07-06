package CONTA;

import javax.xml.validation.Validator;

import IConta;
import CLIENTE.Cliente;



public abstract class CONTA implements IConta{

    private static final int AGENCIA_PADRÃO = 1;
    private static short SEQUENCIAL = 1;                             // short ou int? iniciar em 0 ou 1???

    protected int agencia;
    protected  int numeroConta;
    protected  double saldo;
    private Cliente cliente;

    public CONTA(Cliente cliente){
        this.agencia = CONTA.AGENCIA_PADRÃO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    
    @Override
    public void sacar(double valor){
        this.saldo = saldo - valor;                                     // ou saldo -= valor;

    }
    @Override
    public void depositar (double valor){                               // ou saldo += valor;
        this.saldo = saldo + valor;

    }
    @Override
    public void transferir(double valor, CONTA contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);

    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }


    @Override
    public void depositar(double valor) {
        
    }
    @Override
    public void sacar(double valor) {
        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        
    }
        

    protected  void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));           // c/ this. ou sem tant faz
        System.out.println(String.format("CONTA: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
        
    }


}



