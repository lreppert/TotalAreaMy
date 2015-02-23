/**
 * Created by Mike on 2/22/2015.
 */
public class Circles {

    /** The radius of the circle */
    private static double radius = 1;

    /** The number of the objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public void CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public  void  CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public static  double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
        numberOfObjects++;
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    public static double getArea() {
        return radius * radius * Math.PI;
    }
}
