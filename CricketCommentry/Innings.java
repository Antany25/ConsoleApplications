package Cricket;

public class Innings {
	public static void innings(String BattingTeam[],String BowlingTeam[]) {
		BattingBowling x=new BattingBowling();
		int Target=x.BatBowl(BattingTeam,BowlingTeam);
		System.out.println("Okay The First Innings is Over and the target for the Opponent Team is "+Target);
		System.out.println();
		System.out.println();
		int Score=x.BatBowl(BowlingTeam, BattingTeam);
		if(Target>Score) {
			System.out.println("The First Batted Team is WON");}
		else if(Target<Score) {
			System.out.println("The Second Batted Team is WON");}
		else {
			System.out.println("The Match between Two Teams are TIED");
		}
	}
}
