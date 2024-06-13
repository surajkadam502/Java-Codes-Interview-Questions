package Java_Programs;

public class Shifting_Operators {

	public static void main(String[] args) 
	{
	   //Right Shift Operators - 	
       int a = 25;  //11001
       int b = a << 2;   //1100100 add two 00 at end  = 1*2^6 + 1*2^5 + 1*2^2 = 100
       
       System.out.println(b);   //100
       
       int c = 100;   //1100100
       int d = c << 3; //1100100000 add three digit at the end= 2^9+2^8+2^5 =  512+ 256 +32 = 800
       
       System.out.println(d);
       
     //Left Shift Operators - 
       int x = 25;  //11001
       int y = x >> 2;   //110 remove two 00 at end  
       System.out.println(y); //110 = 2^2+2^1 = 4+2 = 6
       
       int k = 100;   //1100100
       int j = k >> 3; //1100
       System.out.println(j); // 1100 = 8+4 = 12
	}

}
