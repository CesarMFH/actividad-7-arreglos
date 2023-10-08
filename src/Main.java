import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar 20 números enteros
        int[] numeros = new int[20];

        // Leer 20 números enteros desde el teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Mostrar cada elemento del arreglo junto con su cuadrado y su cubo
        System.out.println("Elemento\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            int cuadrado = numeros[i] * numeros[i];
            int cubo = numeros[i] * numeros[i] * numeros[i];
            System.out.println(numeros[i] + "\t\t\t\t\t" + cuadrado + "\t\t" + cubo);
        }

        // Cerrar el scanner
        scanner.close();
    }
}