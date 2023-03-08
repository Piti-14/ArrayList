
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2_Heights {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Double> heights;
    static double height;

    public static void main(String[] args) {

        heights = new ArrayList<Double>();
        int students = numberOfStudents();

        readHeights(students);
        System.out.println("The average height of these students is: " + calculateAvg());
        showResults(calculateAvg());
    }

    private static int numberOfStudents(){
        System.out.print("How many students are in the class: ");
        int students = input.nextInt();
        input.nextLine();

        return students;
    }

    private static void readHeights(int students){
        for (int i = 0; i < students; i++){

            System.out.print("Enter the height of the student nº" + (i + 1) + ": ");
            height = input.nextDouble();
            input.nextLine();

            if (heightIsValid()) {
                heights.add(height);
            } else{
                System.out.println("Please enter a valid height.");
                i--;
            }
        }
    }

    private static boolean heightIsValid(){
       return height > 0;
    }

    private static double calculateAvg(){
        double avg = 0.0;
        for (Double height : heights) {
            avg += height;
        }
        avg /= heights.size();

        return avg;
    }

    private static int studentsAboveAvg(double avg){
        int n = 0;
        for (Double height : heights) {
            if (height > avg){
                n++;
            }
        }

        return n;
    }

    private static int studentsBelowAvg(double avg){
        int n = 0;
        for (Double height : heights) {
            if (height < avg){
                n++;
            }
        }

        return n;
    }

    public static void showResults(double avg){
        System.out.println("Heights of the class: ");
        for (Double height : heights) {
            System.out.println(height);
        }

        System.out.println("Nº of students above average height: " + studentsAboveAvg(avg));
        System.out.println("Nº of students below average height: " + studentsBelowAvg(avg));
    }
}
