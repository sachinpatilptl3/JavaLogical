package numbers;

public class Disarium {
	static int countDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("No of digits:"+count);
		return count;
	}
	static int findPower(int n,int r)
	{
		int pw = 1;
		System.out.print(n+"^"+r+"=");
		while(r>0)
		{
			pw = pw * n;
			r--;
		}
		System.out.println(pw);
		return pw;
	}
	static void isDisarium(int n)
	{
		int count = countDigits(n);
		int res = 0,t=n;
		while(n>0)
		{
			int rem = n%10;
			res = res + findPower(rem, count);
			n = n/10;
			count--;//change from ArmStrong
		}
		System.out.println("result:"+res);
		if(res == t)
			System.out.println("Disarium NUmber:"+t);
		else
			System.out.println("Not Disarium NUmber:"+t);
	}
	public static void main(String[] args) {
		int n=17;
//		int count = countDigits(n);
//		findPower(2, 3);
		isDisarium(n);
	}
}
