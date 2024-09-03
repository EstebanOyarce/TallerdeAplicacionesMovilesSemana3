"#TallerdeAplicacionesMovilesSemana3#" 

###Creación del Codigo Fuente###

  import java.util.Scanner;

  public class infoAutomovil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String marca;
        String modelo;
        String tipoCombustible;
        int cilindrada;
        int capacidadPasajeros;

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

        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");


        scanner.close();
    }
}



###Compilación y pruebas en la línea de comandos###

C:\Users\esteb>cd C:\Users\esteb\OneDrive\Desktop\Semana3  //Ingreso al directorio del codigo fuente
C:\Users\esteb\OneDrive\Desktop\Semana3>javac infoAutomovil.java  //Ingreso el nombre del codigo fuente, se crea la clase ifoAutomovil.class 
C:\Users\esteb\OneDrive\Desktop\Semana3>java infoAutomovil  //Ingreso el nombre de la clase creada y se inicia el programa e ingreso los datos

Ingrese la marca del vehículo: CHEVROLET
Ingrese el modelo del vehículo: SAIL
Ingrese la cilindrada del vehículo (en cc): 1399
Ingrese el tipo de combustible del vehículo: GASOLINA
Ingrese la capacidad en pasajeros del vehículo: 5



###Resultados obtenidos###

La marca que ha ingresado es: CHEVROLET
El modelo que ha ingresado es: SAIL
La cilindrada que ha ingresado es: 1399
El tipo de combustible es: GASOLINA
Tiene una capacidad de 5 pasajeros.


Resultados obtenidos.
