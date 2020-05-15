package unicarioca.conta;

/**
 * @author Yan
 */
abstract public class Conta {
    
    private long numero;
    private double saldo;

    //Construtor
    public Conta(long n, double s){
        numero = n;
        saldo = s;
    }
    
    //Métodos de acesso
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método de negócio
    public void debitar(double soma){
        saldo -= soma;
    }

    public void creditar(double soma){
        saldo += soma;
    }
}