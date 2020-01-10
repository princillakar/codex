public class question6
{
    public static void main(String args[]) {

	 int N = 100;
	
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			sum2 += i * i;
		}
		System.out.println(sum * sum - sum2);
	} 
}
