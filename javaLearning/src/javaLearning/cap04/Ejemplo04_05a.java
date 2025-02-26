public class Ejemplo04_05a {
    // acuerdate de usar constantes
    private static final String FIN = "fin";
    public static void main(String[] args) {
        System.out.println("Se han recibido " + args.length + " argumentos");
        // el bucle while itera hasta que se cumple la condicion
        // no podemos olvidar la posicion
        int i = 0; // punto de inicio
        do { // condicion de terminacion
            System.out.println((i+1) + ")" + args[i]);
            i++; // actualizacion
        } while (i < args.length && !args[i].equals(FIN));

        // como la i fue declarada fuera del bucle aqui aun podemos usarla
        System.out.println("\"fin\" estaba en la posicion nº " + ++i);
        
    }
}