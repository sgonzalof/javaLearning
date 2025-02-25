public class Ejemplo02_06{
    public static void main (String[] args){
        int x = 3;
        int y = 3;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x == y? " + (x == y));
        System.out.println("x != y? " + (x != y));
        String a = new String("hola");
        String b = new String("hola");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a == b? " + (a == b));  // "String" son objetos, por lo que se comparan las referencias
        System.out.println("a != b? " + (a != b));  // aunque tengan el mismo valor, son objetos distintos
    }
}