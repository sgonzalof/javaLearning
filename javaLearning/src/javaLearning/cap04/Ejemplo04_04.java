public class Ejemplo04_04 {
    // acuerdate de usar constantes
    private static final String FIN = "fin";
    public static void main(String[] args) {
        System.out.println("se han recibido " + args.length + " argumentos");

        // el bucle while itera hasta que se cumple la condicion
        // no podemos olvidar la posicion
        int i = 0; // punto de inicio
        // cuidado!! no podemos comparar strings con ==
        while (i < args.length && !args[i].equals(FIN)) { // condicion de terminacion
            System.out.println(i + ")" + args[i]);
            i++; // actualizacion
           
        }

        
        // como la i fue declarada fuera del bucle aquin aun podemos usarla
        if (args[i].equals(FIN)){
            System.out.println("\"fin\" estaba en la posicion nº " + (i+1));
        }
        else {
            System.out.println("\"fin\" no estaba en la lista");
            }
            
    }  
}
    