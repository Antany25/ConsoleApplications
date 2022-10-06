package ThirukuralView;
import java.util.*;

import ThirukuralController.Adhikaram;
import ThirukuralController.Kural;
import ThirukuralModel.ThirukuraWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ThirukuralMain{
public static void main(String[] args) throws IOException{
	long start=System.currentTimeMillis();
		Adhikaram Zero=new Adhikaram();
		Kural k=new Kural();
		ThirukuraWrite z=new ThirukuraWrite();
		int cont=0;
		Scanner Thiru=new Scanner(System.in);
		File fileOne=new File("C:\\Adhigaram.txt");
		File fileTwo=new File("C:\\Kural.txt");
		z.adhi(fileOne);
		z.kurals(fileTwo);
		while(cont==0) {
		System.out.println("If you want Adhigaram enter 1 or if you want particular Kural enter 2");
		int get=Thiru.nextInt();
			switch(get){
				case 1:Zero.One(fileOne);break;
				case 2:k.Two(fileTwo);break;}
			System.out.println("If You Want to Continue enter 0 or break enter 1");
			cont=Thiru.nextInt();}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}	
} 