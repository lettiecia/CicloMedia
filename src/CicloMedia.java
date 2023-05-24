import java.util.Scanner;

public class CicloMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int cantidadNumeros = 0;
        double suma = 0;

        while (!salir) {
            System.out.println("Ingrese un número (o ingrese 0 para salir): ");
            double numero = scanner.nextDouble();

            if (numero == 0) {
                salir = true;
            } else {
                suma += numero;
                cantidadNumeros++;
            }
        }

        if (cantidadNumeros > 0) {
            double media = suma / cantidadNumeros;
            System.out.println("Conjunto de números ingresados: ");
            System.out.println("Media: " + String.format("%.2f", media));
        } else {
            System.out.println("No se ingresaron números. No se puede calcular la media.");
        }
    }
}
