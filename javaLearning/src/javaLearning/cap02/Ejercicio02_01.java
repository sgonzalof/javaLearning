package javaLearning.cap02;

public class Ejercicio02_01 {
	public static void main(String[] args) {
		if (args.length!=0)
				{
					System.out.println("El ultimo argumento que has introducido es "+ args[args.length-1]);}
		else {System.out.println("no hemos introducido ningun argumento");}
	}
}