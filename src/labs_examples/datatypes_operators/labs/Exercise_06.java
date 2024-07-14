package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    static double pi = 3.14159265359;
    public static void surface(float r, float h){
        double surface = 2 * pi * r * h + 2 * pi * r*r;
        System.out.println("The surface of the cylinder is "+surface);
    }
    public static void volume(float r, float h){
        double volume = pi * r*r*h;
        System.out.println("The volume of the cylinder is "+volume);
    }
    public static void main(String[] args) {

        // write code here
        float radius = 3.14f;
        float height = 5f;


        surface(radius,height);
        volume(radius,height);

    }
}