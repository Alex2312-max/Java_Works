import java.util.Arrays;

public class Queue {
    int[] array ;
    int firstElement;
    int LastElement;
    int count;
    int maximum;

    public Queue(int size) {
        if (size > 0) {
            this.array = new int[size];
            this.maximum = size + 1;
        }else{
            this.array = new int[100];
            this.maximum = 101;
        }
        this.firstElement = 0;
        this.LastElement = -1;
        this.count = 0;
    }

    //Function to add an element
    public void push(int item){
        if(Full()) {
            System.out.println("OverFlow!!");
        }
        this.LastElement = (this.LastElement + 1) % this.maximum;
        this.array[this.LastElement] = item;
        this.count++;
    }

    //Function to remove an element
    public void pop(){
        if(Empty()){
            System.out.println("Queue does not have any elements!!");
        }
        this.firstElement = (this.firstElement + 1) % this.maximum;
        this.count--;
    }
    //Function to check if the queue is empty
    public Boolean Empty(){
        return (size() == 0);
    }

    public void isEmpty(){
        if (Empty()){
            System.out.println("It is never full!!");
        }
    }

    public void isFull(){
        if(Full() == Boolean.FALSE){
            System.out.println("The number of elements that can be introduced are:" +
                    + (maximum-size()));
        }
    }
    //Function to return the size of array
    public int size(){
        return this.count;
    }

    //Function to check if the queue is full
    public Boolean Full(){
        return(size() == this.maximum);
    }

    int rear(){
        return this.array[this.LastElement];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "array=" + Arrays.toString(this.array) + '}';
    }
}

