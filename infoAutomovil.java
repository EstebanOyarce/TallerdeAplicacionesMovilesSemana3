import java.util.Scanner;

public class infoAutomovil {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String marca;
        String modelo;
        String tipoCombustible;
        int cilindrada;
        int capacidadPasajeros;

        // Pedir datos al usuario
        System.out.print("Ingrese la marca del vehículo: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese la cilindrada del vehículo (en cc): ");
        cilindrada = scanner.nextInt();

        System.out.print("Ingrese el tipo de combustible del vehículo: ");
        scanner.nextLine(); // Limpiar el buffer
        tipoCombustible = scanner.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros del vehículo: ");
        capacidadPasajeros = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
