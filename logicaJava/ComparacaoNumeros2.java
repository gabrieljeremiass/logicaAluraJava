package logicaJava;

import java.util.Scanner;

public class ComparacaoNumeros2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = leitura.nextInt();
        int numero2 = leitura.nextInt();

        if (numero1 == numero2){
            System.out.println("Números iguais!!!");
        } else if (numero1 > numero2) {
            System.out.println("N1 maior que N2");
        } else {
            System.out.println("N2 maior que N1");
        }

    }
}
