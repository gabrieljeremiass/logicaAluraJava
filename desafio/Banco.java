package desafio;

import java.util.Scanner;

public class Banco {
    public static <transfereValor> void main(String[] args) {

        Scanner leituraMenu = new Scanner(System.in);
        Scanner digiteValorReceber = new Scanner(System.in);
        Scanner digiteValorTranferir = new Scanner(System.in);

        int menu = 0;
        int opcao1 = 1; // consulta saldo
        int opcao2 = 2; // Recebe
        int opcao3 = 3; // Transfere
        int opcao4 = 4; // Sair
        double saldo = 2000;
        double recebeValor = 0;
        double transfereValor = 0;

        System.out.println("------------------------------------------");
        System.out.println("Dados Iniciais Cliente:");

        String nomeCliente = "Gabriel Jeremias";
        String tipoConta = "Conta Corrente";

        System.out.println("Nome cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);

        while (menu!= opcao4){
            System.out.println("--------------------------------------------");
            System.out.println(opcao1 + " - Consulta Saldo atual");
            System.out.println(opcao2 + " - Recebe valor");
            System.out.println(opcao3 + " - Transfere valor");
            System.out.println(opcao4 + " - Sair");
            System.out.println("-----------------------------------------------");
            System.out.println("Digite uma opção: ");
            menu = leituraMenu.nextInt();

            if (menu == opcao1){
                System.out.println("Este é seu saldo atual: ");
                System.out.println(saldo);
            }

            if (menu == opcao2){
                System.out.println("Digite o valor a receber: ");
                recebeValor = digiteValorReceber.nextDouble();
                saldo += recebeValor;
            }

            if (menu == opcao3){
                System.out.println("Digite valor a tranferir: ");
                transfereValor = digiteValorTranferir.nextDouble();
                 if (saldo >= transfereValor){
                     saldo -= transfereValor;
                 } else {
                     System.out.println("Saldo insuficiente para realizar transação!!");
                 }
            }
        }
    }
}

