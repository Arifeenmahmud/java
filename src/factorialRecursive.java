public class factorialRecursive {
    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("The factorial of 6 is: " + fact(6));
        System.out.println("The factorial of 3 is: " + fact(3));
    }
}
