import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] paquetes = new int[10];
        int total = 0;

        for (int i = 0; i < paquetes.length; i++) {
            do {
                System.out.print("Ingrese la cantidad de paquetes procesador en la hora " + (i + 1) + ": ");
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

        int rachaActual = 0;
        int rachaMaxima = 0;

        for (int i = 0; i < paquetes.length; i++) {
            if (paquetes[i] < promedio) {
                horasBajoPromedio++;
                rachaActual++;

                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }

        System.out.println("RESULTADOS: ");

        System.out.println("Total de paquetes procesados: " + total);
        System.out.println("Promedio de paquetes por hora: " + promedio);
        System.out.println("Hora con menor produccion: " + horaMenor);
        System.out.println("Cantidad minima procesada: " + menorPaquetes);
        System.out.println("Horas por debajo del promedio: " + horasBajoPromedio);
        System.out.println("Racha mas larga por debajo del promedio: "+ rachaMaxima + " horas");

        System.out.println("LISTADO POR HORA: ");

        for (int i = 0; i < paquetes.length; i++) {
            System.out.println("Hora " + (i + 1) + ": " + paquetes[i] + " paquetes");
        }

        lector.close();

        
    }
}

//profe, no pude hallar el error
