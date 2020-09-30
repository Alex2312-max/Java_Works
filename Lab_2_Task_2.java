import java.util.Arrays;
import java.util.Scanner;

public class Lab_2_Task_2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String input;
        int size = 0;
        System.out.println("Do you want to set a number of elements in queue?");
        System.out.println("Y - Yes , N - No");
        input = scan.nextLine().toLowerCase();

        if (input.equals("y")){
            System.out.println("Enter the number of elements:");
            size = scan.nextInt();
        }else{
            System.out.println("The size will be initialized automatically.");
        }

        //Creating the first queue and adding some integers
        Queue queue1 = new Queue(size);
        queue1.push(1);
        queue1.push(2);
        queue1.push(4);
        queue1.pop();

        //Creating the second queue and adding some integers
        Queue queue2 = new Queue(size);
        queue2.push(1);
        queue2.push(2);
        queue2.push(4);
        queue2.pop();

        /*
        Prints the whole array
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
        Check if queue is empty
        */

        queue1.isEmpty();
        queue1.isEmpty();
        //Check if queue is full and estimate how may elements can be introduced
        queue1.isFull();
        queue2.isFull();
        //Prints the last element
        System.out.println(queue1.rear());
        System.out.println(queue2.rear());
    }
}
