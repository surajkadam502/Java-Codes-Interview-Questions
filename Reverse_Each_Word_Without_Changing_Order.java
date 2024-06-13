package Java_Programs;

public class Reverse_Each_Word_Without_Changing_Order {

	public static void main(String[] args) 
	{
       String S = "Aishwarya Shinde";
       
       String reversed = "";
       
       String[]parts = S.split(" ");
       
       for (String part : parts) //will read each word from array as String
       {
    	   StringBuffer sb = new StringBuffer(part); //gives reverse method
    	   String revPart = new String(sb.reverse()); //will get rev word suraj=jarus
    	   reversed = reversed.concat((revPart)+" "); //jarus " " in next iteration jarus" "madak
       }
       System.out.println(reversed);
 	}

}
