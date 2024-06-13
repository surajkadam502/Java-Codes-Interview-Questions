package Java_Programs;

public class Reverse_String 
{
   public void next_line() 
   {
       String str = "Suraj Kadam";
       
       for (int i = str.length()-1; i>=0; i--) 
       {
    	   System.out.print(str.charAt(i)); //dont use println ,use print only
       }
   }
	public static void main(String[] args)
	{
       
       //alternate way
        String m1 = "MMMMMy name M is SURAJ"; //Reverse the whole string
		
		for(int i = m1.indexOf("J"); i>= m1.indexOf("M"); i--) 
		{
			System.out.print(m1.charAt(i));
			
		}
		System.out.println();
        Reverse_String output = new Reverse_String();
        output.next_line();
	}

}
