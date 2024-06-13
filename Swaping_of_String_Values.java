package Java_Programs;

public class Swaping_of_String_Values {

	public static void main(String[] args) 
	{
        String a = "Suraj";
        String b = "Kadam";
        
        a = a+b;
        b = a.substring(0,a.length()-b.length()); //Suraj
        a = a.substring(b.length());
        
        System.out.println("After Swaping a : "+a);
        System.out.println("After Swaping b : "+b);

        //Swapping of numbers
        int x = 30;
        int y = 20;
        
        x = x+y; //x=50
        y = x-y; //y=50-20=30 
        x = x-y; //x=50-30=20
        
        System.out.println("After Swaping x :"+x);
        System.out.println("After Swaping y :"+y);
	}

}
