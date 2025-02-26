public class Ejemplo04_03 {
    public static void main(String[] args) {
      // el bucle for each recorre todos los elementos de una coleccion 
      // en cada iteracion, s tendra el valor de uno de los elementos, y podemos hacer con ella lo que
      // hariamos con cualquier otra variable
      for (int i = 0; i<args.length; i++) {
        String s = args[i];
        System.out.println(s);
      }
    }
}