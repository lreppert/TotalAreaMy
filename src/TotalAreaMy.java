/** Import library's */
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Mike on 2/22/2015.
 */
/** Declare my class */
public class TotalAreaMy {
    /** declare my varibles */
    public static final int ZERO = 0;
    public static final int FOUR = 4;
    public static final int ONEHUNDRED = 100;
    public static int number;
    public static double sum;
    /** declare my Main method */
    public static void main(String[] args) {

        /** declare and intialized my Arraylist and allocate my memory */
        ArrayList<Circles> circleRadius = new ArrayList<>();
        /** Declare and Intialize my Object and allocate my memory */
        Circles circleWithRadius = new Circles();

        /** Intialize my random number generator */
        Random random = new Random();
        /** Print out the first header for my output with perfered formating */
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        /** I go in to a for loop in order to loop through my arraylist */
        for (int i = ZERO; i <= FOUR; i++) {
            /** I'm going to generate a random number for every iteration, i then will set my object using setters/Mutators and then insert the
             *  object into the array list  */
            number=random.nextInt(ONEHUNDRED);
            circleWithRadius.setRadius(number);
            circleRadius.add(circleWithRadius);
            /** I will use my accessor in order to retrieve my Area through getters/Accessors  */
            sum +=Circles.getArea();
            /** I now will using my Accessors retrieve radius and Area data and print it to the screen
             * with some formatting specifiers to have clean readable output. */
            System.out.printf("%-30s%-15s\n", Circles.getRadius(), Circles.getArea());
        }

        /** I print some more fluff for readability with more formatting conventions */
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("%-30s%-15f\n", "The total area of circles  is" , sum );
    }

    }
