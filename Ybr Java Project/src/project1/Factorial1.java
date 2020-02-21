package project1;

public class Factorial1 {

	public static void main(String[] args) {
		int given = 5;
		// TODO Auto-generated method stub
		do {

			int fact = 1;
			int no = 1;
			while (no <= given) {

				fact = fact * no;
				no++;

			}
			System.out.println(fact);
			given = given - 1;
		} while (given > 0);

	}
}
