import java.util.Scanner;

public class Monitor {
    Scanner in = new Scanner(System.in);
    String color;
    int dimension;
    int resolution;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setDimension(int dimension){
        this.dimension = dimension;
    }

    public int getDimension(){
        return this.dimension;
    }
    public void setResolution(int Resolution){
        this.dimension = dimension;
    }

    public int getResolution(){
        return this.dimension;
    }
    public String getTheColor() {
        System.out.println("Color: ");
        return in.nextLine().toLowerCase();
    }

    public int getTheResolution() {
        System.out.println("Resolution: ");
        return in.nextInt();
    }

    public int getTheDimension() {
        System.out.println("Dimension: ");
        return in.nextInt();
    }
}
