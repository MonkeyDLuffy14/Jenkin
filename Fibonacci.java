public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        long[] fibonacciNumbers = new long[n];
      
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        
        // Printing the Fibonacci numbers
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }
}
