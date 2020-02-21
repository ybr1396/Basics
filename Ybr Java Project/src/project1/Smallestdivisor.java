package project1;

public class Smallestdivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=105;
int div=2;
while(div<=no)
{
	if(no%div==0)
	{
		System.out.println(div);
		break;
	}
	div++;
}
	}

}
