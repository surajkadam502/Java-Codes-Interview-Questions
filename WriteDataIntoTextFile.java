package Java_Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException 
	{
       FileWriter fw = new FileWriter("C:\\Users\\suraj\\eclipse-workspace\\Maven_Automation\\ExcelSheet\\Test123.txt");
       BufferedWriter bw = new BufferedWriter(fw);  //file will be created if not present
       
       bw.write("Selenium with Java  ");
       bw.write("Selenium with python  ");
       bw.write("Selenium with c#  ");
       bw.write("Selenium with c++");
       
       bw.close();
       System.out.println("Finished!!!");

	}

}
