package ThirukuralController;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Adhikaram {
	public static void One(File  fileOne) throws IOException  {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the ADHIGARAM Number You Want");
		int Adhigaram=s.nextInt();
		int a=Adhigaram*22;
		FileReader r=new FileReader(fileOne);
		BufferedReader Read=new BufferedReader(r);
		String Line=Read.readLine();
		int LineCount=0;
		for(int i=0;i<a;i++) {
			if(LineCount>=(a-22)) {System.out.print(Line);
				System.out.println();}
			Line=Read.readLine(); 
			LineCount++;}	
	}
}

