
public class ContaBancaria {

    String nome;
    int numero;
    double saldo = 100;

    public void sacar(double valorasersacado) {
        
        if (saldo >= valorasersacado) {
            saldo=saldo-valorasersacado;
            
            System.out.println("Seu novo saldo é igual a: " + saldo);
        } 
        else {
            System.out.println("Operação não pode ser realizada, favor inserir outro valor");
        }
    }

    public void depositar(double valoraserdepositado) {
        if (saldo >= 0) {
            saldo=saldo+valoraserdepositado;
            System.out.println("Seu novo saldo é: " + saldo);
        }
        else {
            System.out.println("Operação não pode ser realizada, favor inserir outro valor");
        }
    }

}
