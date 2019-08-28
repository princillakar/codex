public class question6
{
    public static void main(String args[])
   {
        int n=100;
        int sumOfSquare=0;
        int squareOfSum=0;
        int Sum=0;

        for(int i=1;i<=n;i++)
        {
            sumOfSquare+=i*i;
            Sum+=i;
        }
        squareOfSum=Sum*Sum;
        
        System.out.println(java.lang.Math.abs(squareOfSum-sumOfSquare));
    }
}
