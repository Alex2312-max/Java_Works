import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class University{

    String name;
    int foundationYear;
    public ArrayList<String> StudentList;
    private ArrayList studentList;

    public University(String name, int foundationYear, ArrayList<String> StudentList){

        this.name = name;
        this.foundationYear = foundationYear;
        this.StudentList = StudentList;

    }
    public void setName(String name){
        this.name = name;
    }



    public void setFoundationYear(int Name){
        this.foundationYear = foundationYear;
    }

    public int getFoundationYear(){
        return this.foundationYear;
    }
    public void setStudentList(ArrayList studentList){
        this.studentList = studentList;
    }

    public String getName(){
        return this.name;
    }
}
