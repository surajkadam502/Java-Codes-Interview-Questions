package Java_Programs;

public class Count_Occurances_Of_Char {

	public static void main(String[] args)
	{
       String str = "Java Programming Java oops";
       
       String lowerStr = str.toLowerCase();  // only if required
       
       int totalcount = lowerStr.length(); // total characters
       
       int count_after_removing_char = lowerStr.replace("p", "").length(); //count after removing required character
       
       int count = totalcount - count_after_removing_char; //gives us count of removed char
       
       System.out.println("Number of occurances of given char :"+count);
	}

}
