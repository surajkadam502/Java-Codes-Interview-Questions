package Java_Programs;

public class FibonacciSeriese {

// 0 1 1 2 3 5 8 13 . . . . . sum of preceding two numbers
	public static void main(String[] args) 
	{
        int n1=0, n2=1, sum=0;
        System.out.println("Start of Fibonacci Serise  "+n1+","+n2);
        for (int i=2; i<10; i++) //serise upto 10 digits
        {
        	sum=n1+n2;
        	System.out.println(sum);
        	//Swap the values
        	n1=n2;  //n2 becomes n1 
        	n2=sum; //sum becomes n2 and loop will continue till 10th digits
        }
	}

}
