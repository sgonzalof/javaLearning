public class FamilyData{
    public static void main(String[] args){
        if (args.length==7){
            System.out.println("\nPadre: " + args[5] + " " + args [0]);
            System.out.println("\nMadre: " + args[6] + " " + args [1]);
            System.out.println("\nHijos: " );
            System.out.println(args[2] + " " + args[0] + " " + args[1]);
            System.out.println(args[3] + " " + args[0] + " " + args[1]);
            System.out.println(args[4] + " " + args[0] + " " + args[1]);
        } 
        else {
            System.out.println("No se han proporcionado los datos necesarios.");
        }
        
    }
}