package project1;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=3,no2=2;
		int big=no1>no2?no1:no2;
		int small=no1<no2?no1:no2;
		int big2=big;
		while(true)
		{
			if(big%small==0) 
			{
				System.out.println("LCM"+big);
				break;
			}
			big=big+big2;
		}

	}

}
