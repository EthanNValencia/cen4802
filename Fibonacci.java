public class Fibonacci {

    public static void main(String[] args){
        int i = 10;
        System.out.println("The " + i + "nth term of the Fibonacci sequence is " + recursiveFibonacci(i) + ".");
    }

    public static int recursiveFibonacci(int n) {
        if(n<2){
            return n;
        } else {
            return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
        }
    }
}
