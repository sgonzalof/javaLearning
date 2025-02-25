import java.util.HashMap;
import java.util.Map;

public class Ejercicio03_04 {
    // Mapa para almacenar los meses y sus días
    private static final Map<String, Integer> meses = new HashMap<>();
    
    static {
        meses.put("JAN", 31);
        meses.put("FEB", 28); // Suponiendo que no es un año bisiesto
        meses.put("MAR", 31);
        meses.put("APR", 30);
        meses.put("MAY", 31);
        meses.put("JUN", 30);
        meses.put("JUL", 31);
        meses.put("AUG", 31);
        meses.put("SEP", 30);
        meses.put("OCT", 31);
        meses.put("NOV", 30);
        meses.put("DEC", 31);
    }

    public static int getDiasDelMes(String mes) {
        return meses.getOrDefault(mes.toUpperCase(), -1); // Retorna -1 si el mes no es válido
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, ingrese un mes en formato de 3 letras (ej: JAN, FEB, MAR).");
            System.out.println(getDiasDelMes(args[0]));
        }
        
        String mes = args[0].toUpperCase();
        int dias = getDiasDelMes(mes);

        if (dias == -1) {
            System.out.println("Mes no válido.");
        } else {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }
    }
}
