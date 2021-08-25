import java.util.Scanner;

public class CreditCard{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		CreditCard c = new CreditCard();
		System.out.println("Enter card number");
		long n = stdin.nextLong();
		System.out.println(c.validateCard(n));
		System.out.println(c.validateCard(1234567890123456l));
		System.out.println(c.validateCard(1234567890123452l));
	}
	public boolean validateCard(long card){
		int check = (int)card%10;
		int count=0;
		long n = card/10;
		StringBuilder s = new StringBuilder(Long.toString(n));
		s = s.reverse();
		int arr[]= new int[s.length()];
		for (int i=0;i< arr.length; i++){
			if (i%2==0){
				arr[i]= 2*(s.charAt(i)-'0');
				if (arr[i]/10>0){
					arr[i]= (arr[i]/10)+(arr[i]%10);
				}
				count+=arr[i];
			}else{
				arr[i]= (s.charAt(i)-'0');
				count+=arr[i];
			}
		}
		if(10-(count%10)==check){
			return true;
		}else {
			return false;
		}
	}
}