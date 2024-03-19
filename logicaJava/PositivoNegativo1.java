package logicaJava;

import java.util.Scanner;

public class PositivoNegativo1 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double numero = 0;

        while (numero != -1){
            System.out.println("Digite um número: ");
            numero = leitura.nextDouble();

            if (numero >= 1){
                System.out.println("Número positivo!!!");
            } else {
                System.out.println("Número negativo!!!");
            }
        }
    }
}
