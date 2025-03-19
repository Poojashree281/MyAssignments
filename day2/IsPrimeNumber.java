package week1.day2;

public class IsPrimeNumber {

    public static void main(String[] args) {
        int n=5;
        boolean isPrime = true;

            for (int i = 2; i <= n-1; i++) { 
                if (n % i == 0) {
                    isPrime = false;
                    break;  
            }
         }
      
        if (isPrime) {
            System.out.println("The number " + n + " is prime");
        } else {
            System.out.println("The number " + n + " is non-prime");
        }
    }    
}