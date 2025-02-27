/*Construye un programa que liste todos los argumentos recibidos con ciertas reglas:
 1. si la palabra es corta (5 caracteres o menos) se imprime 4 veces en la misma linea
 2. si la palabra es larga, se repite solo dos veces
 3. hacer comprobacion de si ha introducido argumentos */
public class Ejercicio04_01 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No se han introducido argumentos");
        } else {
            for (String arg : args) {
                if (arg.length() <= 5) {
                    System.out.print(arg + " " + arg + " " + arg + " " + arg + " ");
                } else {
                    System.out.print(arg + " " + arg + " ");
                }
            }
        }
    }
}