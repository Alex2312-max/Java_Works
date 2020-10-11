
public class Lab1_Task_3 {
    public static void main(String[] args){

        Student[] listofStudents1 = {new Student("Alex", 19,9.5),
                new Student("Ion", 19, 9.3)};
        Student[] listofStudents2 = {new Student("Radu", 19, 8.3),
                new Student("Jora", 19, 8.6)};
        Student[] listofStudents3 = {new Student("Alina", 19, 9.6),
                new Student("Diana", 19, 8.3)};

        univer1 university1 = new univer1("UTM",listofStudents1);
        univer1 university2 = new univer1("ASEM",listofStudents2);
        univer1 university3 = new univer1("USM",listofStudents3);

        System.out.println(university1.name + " ,average = " + university1.getAverage(listofStudents1));
        System.out.println(university2.name + " ,average = " + university2.getAverage(listofStudents2));
        System.out.println(university3.name + " ,average = " + university3.getAverage(listofStudents3));
        university1.getName("USM");
    }
}
//Implemented the class and the main class in the same file
class univer1{
    String name;
    Student[] student;

    public univer1(String name, Student[] student) {
        this.name = name;
        this.student = student;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(String name){
        return this.name;
    }

    public double getAverage(Student[] student){
        double sum = 1,average;
        for (int i = 0; i < student.length; i++){
            sum += student[i].mark;
        }
        sum = sum - 1;
        average = sum / student.length;
        return average;
    }
}


