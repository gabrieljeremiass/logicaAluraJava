package logicaJava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Número da tabuada: ");
        int numeroTabuada = leitura.nextInt();
        int contador = 0;

        for (int i = 1; i <= 10 ; i++) {
            contador++;
            int resultado = numeroTabuada*contador;
            System.out.println(numeroTabuada + " x " + contador + " = " + resultado);
        }
    }
}
