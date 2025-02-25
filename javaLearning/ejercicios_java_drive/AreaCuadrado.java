public class AreaCuadrado {
    
    // Método para calcular el área del cuadrado
    public static int calcularArea(int lado) {
        return lado * lado;
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            int lado = Integer.parseInt(args[0]);
            int area = calcularArea(lado);
            System.out.println("El área del cuadrado es: " + area);
        } else {
            System.out.println("No se ha proporcionado ningún argumento.");
        }
    }
}
