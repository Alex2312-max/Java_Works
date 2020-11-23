import javafx.scene.shape.Circle;

import javax.print.DocFlavor;
import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Lab_7 {
    public static void main(String[] args){
        // Initializing and arraylist
        ArrayList<Figure> Figures = new ArrayList<>();
        // Initializing an object of type FigureController
        FigureController figControl = new FigureController();
        // Creating the three figures using classes created before
        // Values in cm
        Square Square = new Square(10);
        Rectangle Rectangle = new Rectangle(3,4);
        Triangle Triangle = new Triangle(3,4,5);
        // Creating the circle figure
        Figure Circle = new Figure() {

            double R = 4;

            @Override
            double getPerimeter() {
                return Math.PI * pow(R,2);
            }

            @Override
            double getArea() {
                return 2 * R * Math.PI;
            }

            @Override
            public String toString() {
                return "Circle";
            }
        };
        // Adding figures to arraylist
        Figures.add(Square);
        Figures.add(Rectangle);
        Figures.add(Triangle);
        Figures.add(Circle);
        // Printing the area nd perimeter for each figure
        System.out.println("Square perimeter = " + Square.getPerimeter());
        System.out.println("Square area = " + Square.getArea() + " cm^2");

        System.out.println("Rectangle perimeter = " + Rectangle.getPerimeter());
        System.out.println("Rectangle area = " + Rectangle.getArea() + " cm^2");

        System.out.println("Triangle perimeter = " + Triangle.getPerimeter());
        System.out.println("Triangle area = " + Triangle.getArea() + " cm^2");

        System.out.println("Circle perimeter = " + Circle.getPerimeter());
        System.out.println("Circle area = " + Circle.getArea() + " cm^2");

        // Printing the results
        System.out.println("Biggest perimeter - " + figControl.maxPerimeterFig(Figures));
        System.out.println("Biggest area - " + figControl.maxAreaFig(Figures));
    }
}

abstract class Figure{
    abstract double getPerimeter();
    abstract double getArea();
}

class Square extends Figure{

    double A;

    public Square(int A){
        this.A = A;
    }

    double getPerimeter(){
        return 4 * A;
    }

    double getArea() {
        return A * A;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
class Rectangle extends Figure{

    double A;
    double B;

    public Rectangle(double A, double B){
        this.A = A;
        this.B = B;
    }

    double getPerimeter(){
        return 2 * (A + B);
    }

    double getArea(){
        return A * B;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}

class Triangle extends Figure{

    double A;
    double B;
    Double C;

    public Triangle(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    double getPerimeter() {
        return A + B + C;
    }

    double getArea(){
        // Getting half of perimeter for applying the mathematical formula
        double P = (A + B + C) / 2;
        return sqrt((P - A) * (P - B) * (P - C) * P);
    }

    @Override
    public String toString() {
        return "Triangle ";
    }
}

class FigureController{

    Figure maxPerimeterFig(ArrayList<Figure> figures){

        // Setting the first figure as having the biggest perimeter
        Figure maxPerimeterFig = figures.get(0);

        // Checking if the another figure has a higher perimeter
        for(Figure figure : figures){
            if(figure.getPerimeter() > maxPerimeterFig.getPerimeter()){
                maxPerimeterFig = figure;
            }
        }
        return maxPerimeterFig;
    }
    Figure maxAreaFig(ArrayList<Figure> figures){

        // Setting the first figure as having the biggest area
        Figure maxAreaFig = figures.get(0);
        // Checking for each figure if it has an area bigger than the default set
        for(Figure figure : figures){
            if(figure.getArea() > maxAreaFig.getArea()){
                maxAreaFig = figure;
            }
        }
        return maxAreaFig;
    }
}