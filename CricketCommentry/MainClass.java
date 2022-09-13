package Cricket;
import java.util.Scanner;
public class MainClass extends Toss {
	public static void main(String[] args) {
		MainClass z=new MainClass();
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String Teams[]= {"0.INDIA","1.PAKISTAN","2.AUSTRALIA","3.ENGLAND"};
		for(String i:Teams) {
			System.out.println(i);}
		System.out.println("Choose 0-3 numbers you want to match :");
		int FirstTeam=s.nextInt();
		System.out.println("Choose 0-3 numbers you want to match it for opponent EXCEPT "+FirstTeam);
		int SecondTeam=s.nextInt();
		System.out.println("Match Between : "+Teams[FirstTeam]+" Vs "+Teams[SecondTeam]);
		System.out.println();
		int a=z.toss(Teams[FirstTeam],Teams[SecondTeam]);
		z.SquadTeam(FirstTeam,SecondTeam,a);
	}
}
