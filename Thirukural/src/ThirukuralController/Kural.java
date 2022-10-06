package ThirukuralController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Kural {
	public static void Two(File fileTwo)throws IOException{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ThiruKural Number");
		int Kuralnum=s.nextInt();
		int num=Kuralnum*2;
		FileReader r=new FileReader(fileTwo);
		BufferedReader Read=new BufferedReader(r);
		String Line=Read.readLine();
		int LineCount=0;
		for(int i=0;i<num;i++) {
			if(LineCount>=(num-2)) {System.out.print(Line);
				System.out.println();}
			Line=Read.readLine();
			LineCount++;}	
	}
}
