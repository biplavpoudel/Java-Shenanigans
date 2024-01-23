//To use a lambda expression in a method (in my example, printFormattedLambda())...
// ...the method should have a parameter with a single-method interface as its type.
// Calling the interface's method runs the lambda expression

public class LambdaDemo {
    public interface StringFunction {
        String run(String str);  //this abstract function is defined by lambda expressions below
    }
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";   //perfectly allowed for lambda expressions using functional interface
        StringFunction ask = (s) -> s + "?";
        printFormattedLambda("Oi", exclaim);
        printFormattedLambda("Hello", ask);
    }
    public static void printFormattedLambda(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

}
