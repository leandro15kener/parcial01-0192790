//Un centro de distribución registró la cantidad de paquetes procesados 
// durante 10 horas consecutivas. Los valores son enteros y deben 
// almacenarse en un arreglo unidimensional

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] paquetes = new int[10];
        int total = 0;

        for (int i = 0; i < paquetes.length; i++) {
            do {
                System.out.print("Ingrese la cantidad de paquetes procesador por hora:  " + (i + 1) + ": ");
                paquetes[i] = lector.nextInt();

                if (paquetes[i] < 0) {
                    System.out.println("Error: la cantidad no puede ser negativa.");
                }
            } while (paquetes[i] < 0);

            total += paquetes[i];
        }

        double promedio =  total / paquetes.length;

        int menorPaquetes = paquetes[0];
        int horaMenor = 1;


        for (int i = 1; i < paquetes.length; i++) {
            if (paquetes[i] < menorPaquetes) {
                menorPaquetes = paquetes[i];
                horaMenor = i + 1;
            }
        }
        int horasBajoPromedio = 0;

        int produccionActual = 0;
        int produccionMaxima = 0;

        for (int i = 0; i < paquetes.length; i++) {
            if (paquetes[i] < promedio) {
                horasBajoPromedio++;
                produccionActual++;

                if (produccionActual > produccionMaxima) {
                    produccionMaxima = produccionActual;
                }
            } else {
                produccionActual = 0;
            }
        }

        



        
    }
}
