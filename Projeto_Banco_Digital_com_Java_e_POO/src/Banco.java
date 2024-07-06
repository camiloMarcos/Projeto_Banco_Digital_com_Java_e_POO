

import java.util.List;

import CONTA.CONTA;

public class Banco {
    
    private  String nome;
    private List<CONTA> Contas;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public List<CONTA> getContas() {
        return Contas;
    }
    public void setContas(List<CONTA> contas) {
        this.Contas = contas;
    }
}
