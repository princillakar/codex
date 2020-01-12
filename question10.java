public class question10 {

	public static void main(String args[])
    {
        long sum=0;
        for(long i=3;i<=2000000;i+=2)
        {
            if(isPrime(i))

                sum=sum+i;
        }
        System.out.println(sum+2);
    }
	 static boolean isPrime(long i) {
		 if (i <= 1)
	            return false ;
	        if (i <= 3)
	            return true;
	        if (i % 2 == 0 || i % 3 == 0)
	            return false;
	
	        for (int j = 5; j * j <= i; j += 6) {
	            if (i % j == 0 || i % (j + 2) == 0)
	                return false;
	        }
	        return true;
	    }
	    
	    }
                           //142913828922
