package Java_Programs;

import java.util.Scanner;

public class Average_Program {

	public static void main(String[] args)
	{
	  System.out.println("Enter Values = ");	
      Scanner sc = new Scanner(System.in);
      int value1 = sc.nextInt();
      int value2 = sc.nextInt();
      int value3 = sc.nextInt();
      
      int sum = value1+value2+value3;
      
      System.out.println(sum);
      
     int average = sum/3;
     System.out.println(average);
     
     double percentage = average/100;
     System.out.println(percentage);
	}

}
