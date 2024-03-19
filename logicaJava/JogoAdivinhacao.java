package logicaJava;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroVitoria = new Random().nextInt(10);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int tentativas = leitura.nextInt();

            if (tentativas == numeroVitoria){
                System.out.println("Acertou o número!!!!");
                break;

            } else if (tentativas > numeroVitoria) {
                System.out.println("Numero maior");
                System.out.println("Tente novamente");

            } else if (tentativas < numeroVitoria) {
                System.out.println("Numero menor");
                System.out.println("tente novamente");
            }

        }
    }
}
