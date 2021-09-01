/***
 * Class that contains a main method a recursive Fibonacci method. 
 */
public class Fibonacci {

    /***
     * This is the program main entry point.
     * @author Ethan J. Nephew
     * @param args command-line arguments.
     */
    public static void main(String[] args){
        int i = 10;
        System.out.println("The " + i + "nth term of the Fibonacci sequence is " + recursiveFibonacci(i) + ".");
    }

    /***
     * A recursive Fibonacci method. The method calls itself until the check requirement is satisfied.
     * @author Ethan J. Nephew
     * @param n specifies the upper bound of the Fibonacci sequence.
     * @return returns the Fib(x) in the form of an int.
     */
    public static int recursiveFibonacci(int n) {
        if(n < 2){
            return n;
        } else {
            return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
        }
    }
}
