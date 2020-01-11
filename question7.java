public class question7 {

  

   	 public static void main(String args[])
	    {
	        int count=1;
	        long i=1, lastPrime=-1;
	        while(count<=10001){
	            if(isPrime(i))
	            {
	                lastPrime=i;
	                count++;
	            }
	            i++;
	        }
	        System.out.println(lastPrime);
	    }

		 static boolean isPrime(long i)
		    {
		        if(i<=1)
		            return false;
		        if(i<=3)
		            return true;
		        if(i%2==0 || i%3==0)
		            return  false;
		
		     for(int j=5; j*j<=i; j+=6)
		        {
		            if(i%j==0 || i%(j+2)==0)
		                return false;
		        }

		        return true;
		    }
	    }
