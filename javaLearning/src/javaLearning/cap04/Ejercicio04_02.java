public class Ejercicio04_02 {



    public static void tablaConsecutivos(int numeroInicial, int longitud) {
        int[][] num = new int[10][10];
        int x = numeroInicial;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = x;
                x++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==0){
                    System.out.print(" "+num[i][j] + " ");
                }
                else{
                System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tablaConsecutivos(0, 99);
    }
}
