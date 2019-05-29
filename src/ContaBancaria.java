
public class ContaBancaria {

    private String nome;
    private int numero;
    private double saldo = 100;

    public void sacar(double valorasersacado) {

        if (saldo >= valorasersacado) {
            saldo = saldo - valorasersacado;

            System.out.println("Seu novo saldo é igual a: " + saldo);
            System.out.println("saldo atual: " + this.saldo);
        } else {
            System.out.println("Operação não pode ser realizada, favor inserir outro valor");
        }
    }

    public void depositar(double valoraserdepositado) {
        if (saldo >= 0) {
            saldo = saldo + valoraserdepositado;
            System.out.println("Seu novo saldo é: " + saldo);
        } else {
            System.out.println("Operação não pode ser realizada, favor inserir outro valor");

        }
    }

    public String getNome(String nome) {

        return nome;
    }

    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
