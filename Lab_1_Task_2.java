import java.util.ArrayList;
import java.util.Scanner;

public class Lab_1_Task_2 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        Student student1 = new Student("Alex", 20, 8.9);
        Student student2 = new Student("John", 19, 9.1);
        Student student3 = new Student("Kate", 20, 9.3);
        Student student4 = new Student("Angela",39, 8.4);
        //It was easier to implement the task in this way,for inserting tha names of students in an arraylist and
        //printing them together with the information about university

        /*Student[] students = {student1, new Student("John", 19, 9.1),
            new Student("Kate", 20, 9.3),new Student("Angela",39, 8.4)};*/

        //Made an arraylist to store only the names of objects Student
        ArrayList<String> StudentList = new ArrayList<String>();
        //Added only the list of students
        StudentList.add(student1.Name);
        StudentList.add(student2.Name);
        StudentList.add(student3.Name);
        StudentList.add(student4.Name);
        //Get some properties to the object universities
        University university1 = new University("Technical University", 1960, StudentList);

        System.out.println("The name of university: " + toString(university1) + "and the date of foundation: "
                + toInt(university1) + "\n" + "The list of students: " + university1.StudentList);
    }


    //Override the toString() method in my own class to print the name
    private static String toString(University university1) {
        return university1.name;
    }

    private static int toInt(University university1){
        return university1.foundationYear;
    }

}
