package Java_Programs;

public class Removing_WhiteSpaces {

	public static void main(String[] args) 
	{
        String str = "     My name is  Suraj Kadam ";
        System.out.println("String Before removing the white spaces = "+str);
        
        String str1 = str.replaceAll("\\s", ""); //'\\s'this will remove space at start too
        System.out.println("String After removing the white spaces ="+str1);
        
	}

}
