package logicaJava;

import java.util.Scanner;

public class Area3 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a opção: ");
        int area = leitura.nextInt();
        double lado = 5;
        double raio = 5;

        switch (area){
            case (1):{
                double areaQuadrado = lado*lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            }
            case (2): {
                double areaCirculo = 3.14*(raio*raio);
                System.out.println("Área do Circulo: " + areaCirculo);
                break;
            }
        }
    }
}
