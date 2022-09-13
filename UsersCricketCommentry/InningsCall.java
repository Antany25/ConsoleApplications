package CricketScoreBoard;
public class InningsCall extends BattingBowling{
	public static void Innings(String Batting[],String Bowling[]) {
		InningsCall Four=new InningsCall();
		String Get[]= {"Dot","Single","Double","Triple","FOUR","Wide+Four","SIX","CATCH","LBW","BOWLED","Wide","NOBALL"};
		System.out.println("Okay Get ready Audience the Umpire and the Fielders are comming to the ground and also Batsmans are comming");
		System.out.println();
		System.out.println("Lets ready for the CountDown 10  9  8  7  6  5  4  3  2  !");
		System.out.println();
		int Target=Four.FirstInnings(Batting,Bowling,Get);
		System.out.println("The Target For the Opponent Team is "+Target);
		System.out.println();
		int Chasing=Four.FirstInnings(Bowling,Batting,Get);
		if(Target>Chasing) {
			int Score=Target-Chasing;
			System.out.println("The First Batted Team is Won by "+Score);
			System.out.println();}
		else {
			int Score=Chasing-Target;
			System.out.println("The Second Batted Team is Won by "+Score);}
	}
}
