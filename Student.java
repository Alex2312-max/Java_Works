public class Student {
    String name;
    int age;
    double mark;


    public Student(String Name,int age, double mark){
        this.name = Name;
        this.age = age;
        this.mark = mark;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public void setMark(double mark){
        this.mark = mark;
    }

    public double getMark(){
        return this.mark;
    }
}
