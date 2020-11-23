import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;

public class Lab_6 {
    public static void main(String[] args){

    }
}


class department{
    public hospital hospital;
    public ArrayList<staff> staffList;
}
class doctor{
    public ArrayList<String> speciality;
    public ArrayList<String> location;
}

class hospital{
    public String name;
    public String address;
    public String phone;
    public ArrayList<person> persons;
    public ArrayList<department> departments;
}


class person{
    public String title;
    public String firstName;
    public String middleName;
    public String lastName;
    public String fullName;
    public Date birthDate;
    public Gender gender;
    public String homeAddress;
    public String phone;
    public ArrayList<hospital> hospitals;
}

enum Gender{
    Male,
    Female,
}

class patient extends person{
    public String id;
    public String fullName;
    public Gender gender;
    public Date birthDate;
    public int age;
    public Date dateJoin;
    public ArrayList<String> sickness;
    public ArrayList<String> prescriptions;
    public ArrayList<String> allergies;
    public ArrayList<String> specialRequirements;
    public ArrayList<operationStaff> operationalStaff;
}
class staff{
    public Date dateJoin;
    public ArrayList<String> education;
    public ArrayList<String> certification;
    public ArrayList<String> languages;
    public department department;
}

class administrativeStaff extends staff{

}
class nurse extends operationStaff{

}

class receptionist extends frontDeskStaff{

}

class surgeon extends doctor{

}

class surgicalTechnologist{

}

class technicalStaff extends staff{

}

class technician extends technicalStaff{

}

class frontDeskStaff extends administrativeStaff{

}
class technologist extends technicalStaff{

}
class operationStaff{
    public ArrayList<patient> patients;
}