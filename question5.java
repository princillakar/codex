public class question5 {
	static int smallestMultiple(int number1, int lastnumber){
		int lcm = number1;
		for (int i=2; i<=lastnumber ;i++) {
			int number2 = i;
			lcm = (number1 > number2) ? number1 :number2;

			while (true) {
				if (lcm % number1 == 0 && lcm % number2 == 0) {
					number1 = lcm;
					break;
				}
				++lcm;
			}
		}
		return lcm;
	}
	public static void main(String agrs[])
	{
		System.out.println(smallestMultiple(1,20));
	}
}
	
