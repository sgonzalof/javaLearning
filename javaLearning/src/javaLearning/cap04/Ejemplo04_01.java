public class Ejemplo04_01{
	

	public static void main(String[] args) {
		// El bucle for each (aunque realmente se escribe for), recorre
		// todos los elementos de una coleccion. En cada iteraccion, s tendra el 
		// valor de uno de los elementos, y podemos hacer con ella lo que hariamos
		// con cualquier otra variable
		for (String s : args) {
			System.out.println(s);
		}
	}
}