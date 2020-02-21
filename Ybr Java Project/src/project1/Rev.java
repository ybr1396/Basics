package project1;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 121;
		int no1=no;
		int rev=0;
		while (no > 0) {
			int rem = no % 10;
			rev=(rev*10)+rem;
			System.out.println(rem);
			no = no / 10;
		}
		System.out.println("count"+rev);
	if(no1==rev) {
		System.out.println("PALINDROME");
	}
}
}