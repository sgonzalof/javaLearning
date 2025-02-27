import java.util.Random;
import java.util.Scanner;


public class PiedraPapelTijera {


    //public static void main(String args[]) {
    public static void main(String[] args) {
        // Get the user's choice
        String userChoice = handUser();
        
        // Get the computer's choice
        String pcChoice = handPc();
        
        // Compare the choices and determine the result
        compareHands(userChoice, pcChoice);
    }
        
        
        
    // handUser();
        
    public static String handUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: PIEDRA, PAPEL, TIJERA");
        String y = scanner.nextLine().toUpperCase();
        System.out.println("elegiste " + y);
        return y;
    }


    // handPc();

    public static String handPc(){
        String[] x = {"PIEDRA", "PAPEL", "TIJERA"};
        Random handPc = new Random();

        int n = handPc.nextInt(3);
        String z = x [n];

        System.out.println("el ordenador eligió " + z);
        return z;
    }

    // compareHands();
    public static void compareHands(String y, String z){
        if (y.equals(z)){
            System.out.println("Empate");
        } 
            
        else if (y.equals("PIEDRA") && z.equals("TIJERA") || y.equals("PAPEL") && z.equals("PIEDRA") || y.equals("TIJERA") && z.equals("PAPEL")){
            System.out.println("Ganaste");   
        } 
            
        else {
            System.out.println("Perdiste");
        }
    }



}