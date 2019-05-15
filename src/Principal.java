
import java.util.Scanner;


public class Principal {
    
    public static void main( String [] args){

            Scanner scan = new Scanner(System.in);
            //menu//
            int option;
            
            do {
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Nova Conta");
                System.out.println("0 - Sair");
                
                System.out.println("Opção: ");
                option = scan.nextInt();
                
                if (option ==0){
                    System.exit(0);
                }else if(option == 1){
                    System.out.println("Digite o valor a ser depositado da conta: ");
                }
                
            } while(option!=0);
            
            System.out.println("Programa encerrado.");
            //menu//
            
            ContaBancaria conta1 = new ContaBancaria ();
            
            System.out.println("Digite seu nome: ");
            conta1.nome = scan.next();
            
            System.out.println("Digite a senha da conta: ");
            conta1.numero = scan.nextInt();
            
            System.out.println("Digite o valor a ser sacado da conta: ");
            conta1.sacar (scan.nextDouble());
            
            System.out.println("Digite o valor a ser depositado da conta: ");
            conta1.depositar (scan.nextDouble());
            
        }
    }
