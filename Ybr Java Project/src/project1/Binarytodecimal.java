package project1;

public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1001, power = 0, dec = 0;
		while (no > 0) {
			int rem = no % 10;
			dec = (int) (dec + (rem * Math.pow(2, power)));
			no = no / 10;
			power++;
		}
		System.out.println(dec);
	}

}
