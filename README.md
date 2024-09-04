"#TallerdeAplicacionesMovilesSemana3#" 

###Creación del Codigo Fuente###

import java.util.Scanner;  // Importa la clase Scanner para leer la entrada del usuario

public class infoAutomovil {  // Declaración de la clase principal VehiculoInfo

    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para recibir datos del usuario
        
        String marca;  // Variable para almacenar la marca del vehículo
        String modelo;  // Variable para almacenar el modelo del vehículo
        String tipoCombustible;  // Variable para almacenar el tipo de combustible del vehículo
        int cilindrada;  // Variable para almacenar la cilindrada en cc
        int capacidadPasajeros;  // Variable para almacenar la capacidad de pasajeros

        System.out.print("Ingrese la marca del vehículo: ");  // Solicita la marca al usuario
        marca = scanner.nextLine();  // Lee la marca ingresada por el usuario
        
        System.out.print("Ingrese el modelo del vehículo: ");  // Solicita el modelo al usuario
        modelo = scanner.nextLine();  // Lee el modelo ingresado
        
        System.out.print("Ingrese la cilindrada del vehículo (en cc): ");  // Solicita la cilindrada
        cilindrada = scanner.nextInt();  // Lee el valor de cilindrada
        
        System.out.print("Ingrese el tipo de combustible del vehículo: ");  // Solicita el tipo de combustible
        scanner.nextLine();  // Limpia el buffer antes de leer el siguiente dato
        tipoCombustible = scanner.nextLine();  // Lee el tipo de combustible
        
        System.out.print("Ingrese la capacidad en pasajeros del vehículo: ");  // Solicita la capacidad en pasajeros
        capacidadPasajeros = scanner.nextInt();  // Lee la capacidad de pasajeros

        // Imprime los datos ingresados
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
        
        scanner.close();  // Cierra el objeto Scanner para liberar recursos
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



###Requisitos###

Requerimientos funcionales:

-El sistema debe permitir la entrada de datos como marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros.
-El sistema debe mostrar correctamente los datos ingresados.
-El sistema debe ser capaz de manejar entradas de diferentes tipos de datos (cadenas, enteros).

Requerimientos no funcionales:

-El sistema debe ser fácil de usar a través de la consola.
-El código debe ser modular y fácilmente mantenible.
-El programa debe ejecutarse en entornos sin interfaz gráfica.
