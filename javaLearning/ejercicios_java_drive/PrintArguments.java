public class PrintArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumentos recibidos:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No se ha proporcionado ningún argumento.");
        }
    }
}

