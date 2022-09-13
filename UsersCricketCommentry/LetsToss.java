package CricketScoreBoard;
import java.util.*;
public class LetsToss extends TeamsSquad{
	public static void Toss(String Team1,String Team2,int FirstTeam,int SecondTeam) {
		LetsToss Two=new LetsToss();
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		System.out.println("It's time to Toss the Coin");
		int TossChoose=r.nextInt(2);
		int Toss=r.nextInt(2);
		if(TossChoose==0) {
			System.out.println("So It's the "+Team1+" Chance Choose Head or Tail");
			String HT=s.nextLine();
			if(Toss==0) {
				System.out.println("OH It's a Lucky Day For "+Team1+" It's "+HT);}
			else {
				System.out.println("OH It's a Lucky Day For "+Team2+" to Won The Toss ");}
		}
		else {
			System.out.println("So It's the "+Team2+" Chance Choose Head or Tail");
			String ht=s.nextLine();
			if(Toss==0) {
				System.out.println("OH It's a Lucky Day For "+Team2+" It's "+ht);}
			else {
				System.out.println("OH It's a Lucky Day For "+Team1+" to Won the Toss");}
		}
		Two.Squad(TossChoose,Toss,FirstTeam,SecondTeam);
	}
}