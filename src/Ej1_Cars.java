
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej1_Cars {

    static ArrayList<String> cars;
    static Scanner input = new Scanner(System.in);
    static String car;

    public static void main(String[] args) {

        cars = new ArrayList<String>();
        while (askCars()){
            cars.add(car);
        }

        Collections.sort(cars);

        for (String coche : cars) {
            System.out.println(coche);
        }
    }

    private static boolean askCars() {
        System.out.print("Write the name of a car to add it (Enter a blank line to exit): ");
        car = input.nextLine();

        return car.length() != 0;
    }
}
