
import java.util.Scanner;


public class Principal {
    public static void main( String [] args){
            ContaBancaria conta1 = new ContaBancaria ();
       
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite seu nome: ");
            conta1.SetNome(scan.next());
            
            System.out.println("Digite o numero da conta: ");
            conta1.SetNumero(scan.nextInt());
            
            System.out.print("Digite o saldo da conta: ");
            conta1.SetSaldo(scan.nextDouble());
        }
}
