package Java_Programs;

public class Remove_Junk_SpecialChar {

	public static void main(String[] args) 
	{
         String s = "^%#&@*(#(Pune123648)&^%R7^R57$%78tvc76";
         String s1 = s.replaceAll("[^a-zA-Z0-9]",""); //only A-Z,a-z,0-9 will keep, other removed
         
        System.out.println(s1);
	}

}
