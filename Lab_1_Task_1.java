import java.util.Scanner;

public class Lab_1_Task_1 {

    static Scanner in = new Scanner(System.in);

    public  static void main(String[] args) {

        System.out.println("Enter the characteristics of the first monitor: ");
        Monitor monitor1 = new Monitor();
        monitor1.color = monitor1.getTheColor();
        monitor1.dimension = monitor1.getTheDimension();
        monitor1.resolution = monitor1.getTheResolution();

        System.out.println("Enter the characteristics of the second monitor: ");
        Monitor monitor2 = new Monitor();
        monitor2.color = monitor2.getTheColor();
        monitor2.dimension = monitor2.getTheDimension();
        monitor2.resolution = monitor2.getTheResolution();

        System.out.print("Monitors are of ");
        String differenceOfColors = (monitor1.color != monitor2.color) ? "different colors" : "the same color";
        String differenceOfDimension = (monitor1.dimension != monitor2.dimension) ? "different dimension" : "the same dimension";
        String differenceOfResolution = (monitor1.resolution != monitor2.resolution) ? "different resolution." : "the same resolution.";
        System.out.print(differenceOfColors);
        System.out.print(", " + differenceOfDimension);
        System.out.print(", " + differenceOfResolution);

    }

}
