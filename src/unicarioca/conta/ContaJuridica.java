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
public class ContaJuridica extends Conta {
    
    //atributo
    private long cnpj;

    //Construtor
    public ContaJuridica(long n, double s, long c) {
        super(n, s);
        this.cnpj = c;
    }
    
    @Override
    public void debitar(double soma){
        setSaldo(getSaldo() - soma * 1.1);
    }

    //Métodos de acesso
    public long getCnpj() {
        return cnpj;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}