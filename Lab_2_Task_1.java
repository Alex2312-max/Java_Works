import java.util.Scanner;

public class Lab_2_Task_1 {
    public static void main(String[] args){
        //Giving some values to box1.box2 and box3
        Box box1 = new Box(1,1,1);
        Box box2 = new Box(3.5,3.5,3.5);
        Box box3 = new Box(2.4,3.7,6.5);

        double Area = box3.GetTheArea(box3.height,box3.width,box3.depth);
        double Volume = box3.GetTheVolume(box3.height,box3.width,box3.depth);

        System.out.println("The area and volume of the box are " +
                Area + " cm^2 and " + Volume + " cm^3");

    }
}
