public  class Ejemplo04_05b{
    // acuerdate de usar constantes

    private static final String FIN = "fin";
    // != sera cierto si ambos operandos son distintos
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Se han recibido " + args.length + " argumentos");
            // el bucle while itera hasta que se cumple la condicion
            // y hasta que se cumple la condicion
            int i = 0; // punto de inicio
            String palabra; // debemos declararla fuera del bucle para poderlo usar en la condicion
            do { 
                palabra = args[i];
                System.out.println((i) + ")" + palabra);
                i++; // actualizacion
            } while (!palabra.equals(FIN) && i < args.length);
        } 
        else {
            System.err.println("No se han recibido argumentos");
        }
        
    }
}