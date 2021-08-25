import java.util.Scanner;

public class CreditCard{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		CreditCard c = new CreditCard();
//		System.out.println("Enter card number");
//		int n = stdin.nextInt();
		int n = 128;
		System.out.println(c.validateCard(n));
		System.out.println(c.validateCard(1234567890123456));
		System.out.println(c.validateCard(1234567890123452));
	}
	public boolean validateCard(int card){
		boolean res = false;
		int check = card%10;
		int n = card/10;
		StringBuilder s = new StringBuilder(Integer.toString(n));
		s = s.reverse();
		int arr[]= new int[s.length()];
		for (int i=0;i< arr.length; i++){
			
		}
		return res;
	}
}