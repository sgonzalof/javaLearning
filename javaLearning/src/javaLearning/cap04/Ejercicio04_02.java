/* Pintar los numero de 0 a 99 en una matriz de 10 por 10 utilizando bucles for */

public class Ejercicio04_02 {

    // Método que llena una matriz de 10x10 con números consecutivos y los imprime
    public static void tablaConsecutivos(int numeroInicial, int longitud) {
        // Declaración de una matriz de 10x10
        int[][] num = new int[10][10];
        // Variable para llevar el conteo de los números consecutivos
        int x = numeroInicial;

        // Llenar la matriz con números consecutivos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = x;
                x++;
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Si es la primera fila, imprimir con un espacio adicional al inicio
                if (i == 0) {
                    System.out.print(" " + num[i][j] + " ");
                } else {
                    // Para las demás filas, imprimir normalmente
                    System.out.print(num[i][j] + " ");
                }
            }
            // Imprimir una nueva línea después de cada fila
            System.out.println();
        }
    }

    // Método principal que llama a tablaConsecutivos con los parámetros iniciales
    public static void main(String[] args) {
        tablaConsecutivos(0, 99);
    }
}