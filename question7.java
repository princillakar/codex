public class question7 {

  

    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }
    
  
    public static long nthPrime(long n) {
        int numberOfPrimes = 0;
        long prime = 1;
        
        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }
    
      public static boolean isPrime(long n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}