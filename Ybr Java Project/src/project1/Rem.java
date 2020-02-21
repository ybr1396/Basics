package project1;

public class Rem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noofdigits=0;
		int no = 56789;
		while (no > 0) {
			int rem = no % 10;
			System.out.println(rem);
			no = no / 10;
			noofdigits++;
		}
		System.out.println("count"+noofdigits);
	}
	

}
