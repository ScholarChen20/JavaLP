package Operator;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})

class Vehicle {}

public class Instanceof extends Vehicle {
    public static void main(String[] args){
        /*
         * The instanceof operator checks if an object is an instance of a class or a subclass of a class.
         * It returns true if the object is an instance of the specified class or a subclass of the specified class, and false otherwise.
         */
        Vehicle a = new Instanceof();
        boolean result =  a instanceof Instanceof;
        System.out.println( result);
    }
}