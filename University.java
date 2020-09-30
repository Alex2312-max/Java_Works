import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class University{

    String name;
    int foundationYear;
    public ArrayList<String> StudentList = new ArrayList<String>();

    public University(String name, int foundationYear, ArrayList<String> StudentList){

        this.name = name;
        this.foundationYear = foundationYear;
        this.StudentList = StudentList;

    }

}
