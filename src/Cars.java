
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {

    static ArrayList<String> coches;
    static Scanner input = new Scanner(System.in);
    static String coche;

    public static void main(String[] args) {

        coches = new ArrayList<String>();
        while (preguntarCoches()){
            coches.add(coche);
        }

        Collections.sort(coches);

        for (String coche : coches) {
            System.out.println(coche);
        }
    }

    private static boolean preguntarCoches() {
        System.out.print("Escribe el nombre de un coche para añadirlo (Linea en blanco para salir): ");
        coche = input.nextLine();

        return coche.length() != 0;
    }
}
