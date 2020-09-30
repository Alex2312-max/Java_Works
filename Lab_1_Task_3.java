import java.lang.reflect.Array;
import java.util.*;

public class Lab_1_Task_3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<String> StudentList = new ArrayList<>();
        ArrayList<Double> listOfMarks = new ArrayList<>();

        ArrayList<String> StudentList2 = new ArrayList<>();
        ArrayList<Double> listOfMarks2 = new ArrayList<>();

        ArrayList<String> StudentList3 = new ArrayList<>();
        ArrayList<Double> listOfMarks3 = new ArrayList<>();

        //Creating the first object
        System.out.println("Enter the name of first university: ");
        Universities university1 = new Universities();
        university1.name = in.nextLine();
        int numStudents1 = NumberOfStudents();
        university1.listOfStudents = getStudents(StudentList, numStudents1);
        university1.listOfMarks = getMarks(listOfMarks,numStudents1);
        double average1 = getAverage(listOfMarks,numStudents1);

        //Creating the second object
        System.out.println("Enter the name of second university: ");
        Universities university2 = new Universities();
        university2.name = in.nextLine();
        int numStudents2 = NumberOfStudents();
        university2.listOfStudents = getStudents(StudentList2, numStudents2);
        university2.listOfMarks = getMarks(listOfMarks2,numStudents2);
        double average2 = getAverage(listOfMarks2,numStudents2);

        //Creating the third object
        System.out.println("Enter the name of third university: ");
        Universities university3 = new Universities();
        university3.name = in.nextLine();
        int numStudents3 = NumberOfStudents();
        university3.listOfStudents = getStudents(StudentList, numStudents3);
        university3.listOfMarks = getMarks(listOfMarks3,numStudents3);
        double average3 = getAverage(listOfMarks3,numStudents3);

        System.out.println("The average for 3 universities is:" + "\n" + university1.name + ": " + average1 + "\n"
        + university2.name + ": "+ average2 + "\n" + university3.name + ": " + average3);
    }
    //Get students
    public static ArrayList getStudents(ArrayList<String> StudentList,int numStudents){
        System.out.println("Enter the list of students: ");
        for (int i = 0; i < numStudents;i++){
            String nameOfStudent;
            nameOfStudent = in.nextLine();
            StudentList.add(nameOfStudent);
        }
        return StudentList;
    }
    //Initial number of students
    public static int NumberOfStudents(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many students do you want to initialize? ");
        int numStudents = in.nextInt();
        return numStudents;
    }
    //Get the marks of students
    public static ArrayList getMarks(ArrayList<Double> listOfMarks, int numStudents){
        System.out.println("Enter the marks: ");
        for(int i = 0; i < numStudents; i++){
            double marks = in.nextDouble();
            listOfMarks.add(marks);
        }
        return listOfMarks;
    }
    //Get average marks
    public static double getAverage(ArrayList<Double> listOfMarks,int numStudents){
        double sum = 0;
        for (Double mark:listOfMarks){
            sum += mark;
        }
        double average = sum / numStudents;
        return average;
    }
}
