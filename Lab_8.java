import java.util.ArrayList;

public class Lab_8 {
    public static void main(String[] args) {
        Cub cub = new Cub(3);
        Parallelepiped parallelepiped = new Parallelepiped(3,3,4);
        Sphere sphere = new Sphere(3);

        ArrayList<GeometricBody> geometricBodiesList = new ArrayList<>();

        geometricBodiesList.add(cub);
        geometricBodiesList.add(parallelepiped);
        geometricBodiesList.add(sphere);

        GeometricBodyController geometricBodyController = new GeometricBodyController();
        System.out.println("Body with the biggest Surface " + geometricBodyController.biggestSurfaceBody(geometricBodiesList));
        System.out.println("Body with the biggest Volume " + geometricBodyController.biggestVolumeBody(geometricBodiesList));
    }
}


class Cub implements GeometricBody {
    int cubeEdge;

    public Cub(int cubeEdge) {
        this.cubeEdge = cubeEdge;
    }

    public double getSurface() {
        return 6 * Math.pow(cubeEdge, 2);
    }


    public double getVolume() {
        return Math.pow(cubeEdge, 3);
    }
    @Override
    public String toString() {
        return "Cub{" +
                "cubeEdge=" + cubeEdge +
                '}';
    }
}

class Parallelepiped implements GeometricBody {
    int h, l , L;

    public Parallelepiped(int h, int l, int L) {
        this.h = h;
        this.l = l;
        this.L = L;
    }

    public double getSurface() {
        return 2 * h * l + 2 * h * L + 2 * L * l;
    }

    public double getVolume() {
        return h * l * L;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "h=" + h +
                ", l=" + l +
                ", L=" + L +
                '}';
    }
}

class Sphere implements GeometricBody {
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
class GeometricBodyController {

    GeometricBody biggestVolumeBody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody maxVolumeBody = geometricBodies.get(0);

        for(GeometricBody body : geometricBodies){
            if(maxVolumeBody.getVolume() < body.getVolume()){
                maxVolumeBody = body;
            }
        }

        return maxVolumeBody;
    }

    GeometricBody biggestSurfaceBody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody maxSurfaceBody = geometricBodies.get(0);

        for(GeometricBody body:geometricBodies){
            if(maxSurfaceBody.getSurface() < body.getSurface()){
                maxSurfaceBody = body;
            }
        }

        return maxSurfaceBody;
    }
}
interface GeometricBody {
    double getSurface();

    double getVolume();
}