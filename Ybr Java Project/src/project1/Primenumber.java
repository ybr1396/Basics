package project1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
int no=1;
int div=5;
int primecount=1;
 boolean check=true;
 while(primecount<=20)
 {
 if(no%2!=0)
      {
     while(div<no)
      {
    	  if(no%div==0)
      {
    	//  System.out.println("not prime");
    	  check=false;
    	  break;
      }
    	  div=div+2;
   	}
     no=no+2;     
      }
      if(check==true)
      {
    	  System.out.println(no+"is a Prime no");
    	  primecount++;
      }
}
 //else
 {
	// System.out.println("not prime");
	// check=true;
 }
}
}


