package CricketScoreBoard;
import java.util.*;
public class MainClass extends LetsToss{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass one=new MainClass();
		Scanner s=new Scanner(System.in);
		String Teams[] = {" ","INDIA","PAKISTAN","AUSTRALIA","ENGLAND"};
		System.out.println("Choose One Number in 1-4 you want to Match");
		int FirstTeam=s.nextInt();
		System.out.println("Choose One Number in 1-4 you want to Match Except"+FirstTeam);
		int SecondTeam=s.nextInt();
		one.Toss(Teams[FirstTeam],Teams[SecondTeam],FirstTeam,SecondTeam);
	}
}
