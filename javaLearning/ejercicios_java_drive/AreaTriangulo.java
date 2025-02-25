public class AreaTriangulo {
    public static void main(String[] args) {
        if (args.length == 2) {
            double base = Double.parseDouble(args[0]);
            double altura = Double.parseDouble(args[1]);
            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
        } else {
            System.out.println("Error: Debe proporcionar dos argumentos.");
        }
    }
}