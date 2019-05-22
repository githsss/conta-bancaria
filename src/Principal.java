
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //menu//
        int option;

        do {
            System.out.println("========= Selecione uma opção========");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Encerrar");
            System.out.println("3 - depositar");
            System.out.println("0 - Opção");
            option = scan.nextInt();
            switch (option) {

                case 1:
                    ContaBancaria conta1 = new ContaBancaria();

                    System.out.println("Digite seu nome: ");
                    conta1.nome = scan.next();

                    System.out.println("Digite a senha da conta: ");
                    conta1.numero = scan.nextInt();

                case 2:
                    System.exit(0);
                    break;
                case 3:
                    ContaBancaria conta = new ContaBancaria();
                    System.out.println("Digite o valor a ser depositado da conta: ");
                    conta.depositar(scan.nextDouble());
                    break;
                default:
                    System.out.println("Opçaõ invalida !!");

            }
        } while (option != 0);

//        System.out.println("Digite o valor a ser sacado da conta: ");
//        conta1.sacar(scan.nextDouble());

    }
}
