public class Box {
    double height;
    double width;
    double depth;
    //Using the constructor
    public Box(double height,double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    //Implementing method for calculating the area
    double GetTheArea(double height,double width,double depth){
        double Area = 2 * (height * width) + 2 * (height * depth) + 2 * (width * depth);
        return Area;
    }
    //Implementing method for calculating the volume
    double GetTheVolume(double height,double width,double depth){
        double Volume = height * width * depth;
        return Volume;
    }
}
