/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicarioca.conta;

/**
 *
 * @author Yan
 */
public class ContaFisica extends Conta {
    
    private long cpf;

    //Construtor
    public ContaFisica(long n, double s, long c) {
        super(n, s);
        this.cpf = c;
    }
    
    //Métodos de acesso
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
}
