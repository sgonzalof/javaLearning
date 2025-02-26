public class FamilyDataImprimirPersona {
    public static void main(String[] args) {
        if (args.length == 7) {
            // Imprimir el nombre del padre
            System.out.println("Padre\n");
            String nombrePadre = construirNombreCompleto(args[5], args[0], " \n");
            pintarNombreCompleto(nombrePadre);

            // Imprimir el nombre de la madre
            System.out.println("Madre\n");
            String nombreMadre = construirNombreCompleto(args[6], args[1], " \n");
            pintarNombreCompleto(nombreMadre);

            // Imprimir los nombres de los hijos
            System.out.println("Hijos\n");
            String nombreHijo1 = construirNombreCompleto(args[2], args[0], args[1]);
            pintarNombreCompleto(nombreHijo1);

            String nombreHijo2 = construirNombreCompleto(args[3], args[0], args[1]);
            pintarNombreCompleto(nombreHijo2);

            String nombreHijo3 = construirNombreCompleto(args[4], args[0], args[1]);
            pintarNombreCompleto(nombreHijo3);
        } else {
            System.out.println("No se han proporcionado los datos necesarios.");
        }
    }

    // Método para construir el nombre completo a partir de los parámetros
    public static String construirNombreCompleto(String nombre, String apellido1, String apellido2) {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    // Método para imprimir el nombre completo
    public static void pintarNombreCompleto(String nombreCompleto) {
        System.out.println("Nombre Completo: " + nombreCompleto + "\n");
    }
}