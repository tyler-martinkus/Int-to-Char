public class Driver 
{
	public static void main(String[] args)
	{
		System.out.println(Driver.decimalToBase(2989, 16));
	}
	
	static String decimalToBase(int decimalNumber,int radix)
	{
		char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
	    'B', 'C', 'D', 'E', 'F' };
		String convertedNum = "";
		
	    do 
	    {
	    	convertedNum += array[decimalNumber % radix];
	    	decimalNumber = decimalNumber / radix;
	    } while (decimalNumber > 0);
	    return Driver.reverseString(convertedNum);
	}
	

	static String reverseString(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >= 0; i = i - 1)
		{
			answer = answer + s.charAt(i);
		}
		return answer;
	}
}