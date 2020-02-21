package project1;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1234;
		int no1=no;
		int rev=0;
		int sumofdigits=0;
		while (no > 0) {
			int rem = no % 10;
			sumofdigits=sumofdigits+rem;
			no = no / 10;
		}
		System.out.println(sumofdigits);
	
	}
	}


