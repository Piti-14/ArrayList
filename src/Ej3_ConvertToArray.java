
import java.util.ArrayList;
import java.util.Scanner;

public class Ej3_ConvertToArray {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<String>();

        fillArrayList();
        createArray();
    }

    private static void fillArrayList() {
        System.out.print("Please enter a value to add to the ArrayList (blank line to exit): ");
        String value = input.nextLine();

        if (value.length() != 0) {
            list.add(value);
            fillArrayList();
        }
    }

    private static void createArray(){
        String[] list2 = new String[list.size()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = list.get(i);
        }

        showArray(list2);
    }

    private static void showArray(String[] array){
        System.out.print("\nThe content of your array is: ");
        for (String str : array){
            System.out.print(str + " ");
        }
    }
}
