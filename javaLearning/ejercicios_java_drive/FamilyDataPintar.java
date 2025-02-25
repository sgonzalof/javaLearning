public class FamilyDataPintar{
    public static void main(String[] args){

        if (args.length==7){
            System.out.println("Padre\n");
            pintarPersona(args[5], args[0], "  \n");
            System.out.println("Madre\n");
            pintarPersona(args[6], args[1], " \n");
            System.out.println("Hijos\n");
            pintarPersona(args[2], args[0], args[1]);
            pintarPersona(args[3], args[0], args[1]);
            pintarPersona(args[4], args[0], args[1]);
        } 

        else {
            System.out.println("No se han proporcionado los datos necesarios.");
        }
    }

    public static void pintarPersona(String nombre, String apellido1, String apellido2){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2 + "\n");
    }

}
