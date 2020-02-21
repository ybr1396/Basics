package project1;

public class Sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 81;
		int div = 2;
		while (div <= no) {
			if (no / div == div) {
				System.out.println(div + "root");
				break;
			}
			div++;
		}

	}

}
