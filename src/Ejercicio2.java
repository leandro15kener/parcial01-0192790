import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[][] unidadesVendidas = new int[4][5];
        int[] totalUnidadesSucursal = new int[4];
        int[] totalVendidosProducto = new int[5];
        int cantidadMayoresA30 = 0;

        
        for (int i = 0; i < unidadesVendidas.length; i++) {
            System.out.println("===== SUCURSAL #" + (i + 1) + " =====");

            for (int j = 0; j < unidadesVendidas[i].length; j++) {
                do {
                    System.out.print("Unidades vendidas del producto #" + (j + 1) + ": ");
                    unidadesVendidas[i][j] = lector.nextInt();

                    if (unidadesVendidas[i][j] < 0) {
                        System.out.println("Error: las unidades no pueden ser negativas.");
                    }
                } while (unidadesVendidas[i][j] < 0);

                totalUnidadesSucursal[i] += unidadesVendidas[i][j];
                totalVendidosProducto[j] += unidadesVendidas[i][j];

                if (unidadesVendidas[i][j] > 30) {
                    cantidadMayoresA30++;
                }
            }
        }

        
        int sucursalMenor = 0;

        for (int i = 1; i < totalUnidadesSucursal.length; i++) {
            if (totalUnidadesSucursal[i] < totalUnidadesSucursal[sucursalMenor]) {
                sucursalMenor = i;
            }
        }

        
        int productoMayor = 0;

        for (int j = 1; j < totalVendidosProducto.length; j++) {
            if (totalVendidosProducto[j] > totalVendidosProducto[productoMayor]) {
                productoMayor = j;
            }
        }

        System.out.println("===== MATRIZ DE VENTAS =====");

        for (int i = 0; i < unidadesVendidas.length; i++) {
            System.out.print("Sucursal #" + (i + 1) + ": ");

            for (int j = 0; j < unidadesVendidas[i].length; j++) {
                System.out.print(unidadesVendidas[i][j] + " ");
            }

            System.out.println();
        }

        
        System.out.println("===== TOTAL POR SUCURSAL =====");

        for (int i = 0; i < totalUnidadesSucursal.length; i++) {
            System.out.println("Sucursal #" + (i + 1) + ": " + totalUnidadesSucursal[i] + " unidades");
        }

        
        System.out.println("===== TOTAL POR PRODUCTO =====");

        for (int j = 0; j < totalVendidosProducto.length; j++) {
            System.out.println("Producto #" + (j + 1) + ": " + totalVendidosProducto[j] + " unidades");
        }

        System.out.println("La sucursal con menor cantidad de ventas es la #" + (sucursalMenor + 1));

        System.out.println("El producto con mayor cantidad de unidades vendidas es el #" + (productoMayor + 1));

        System.out.println("Cantidad de registros superiores a 30: " + cantidadMayoresA30);

        lector.close();
    }
}