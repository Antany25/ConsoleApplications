package CricketScoreBoard;
import java.util.*;
public class BattingBowling {
	public static int FirstInnings(String Batsmans[],String Bowlers[],String Get[]) {
		Scanner s=new Scanner(System.in);
		int Overs=0,Balls=0,Bat1=0,Bat2=1,Bowl=5,StrikeChange=0,Wicket=0,Extras=0,TotalScore=0;
		System.out.println("If you want type numbers 0 1 2 3 4 5 6");
		System.out.println("If you want Out type (7 to catch),(8 to LBW),(9 to RunOut)");
		System.out.println("If you want Extras type (10 to Wide),(11 to NoBall)");
		System.out.println();
		int BatScore[]=new int[11];
		a:for(;Overs<2;){
			b:for(;Bowl<11;) {
				c:for(;Bat1<11;) {
					d:for(;Bat2<11;)
						e:for(;Balls<6;){
							System.out.println("Type what you want in "+Overs+"."+Balls+" Balls");
							int Want=s.nextInt();
							if((Want>=0)&&(Want<7)&&(StrikeChange==0)) {
								BatScore[Bat1]+=Want;Balls++;
								System.out.println("Its a "+Get[Want]);
								System.out.println();TotalScore+=Want;
								if((Want==1)||(Want==3)) {StrikeChange++;}}
							else if((Want>=0)&&(Want<7)&&(StrikeChange==1)) {
								BatScore[Bat2]+=Want;Balls++;
								System.out.println("Its a "+Get[Want]);
								System.out.println();TotalScore+=Want;
								if((Want==1)||(Want==3)) {StrikeChange--;}}
							else if(Want==7) {
								if(StrikeChange==0) {System.out.println("Wow Its a "+Get[Want]);
									System.out.println("Batsman "+Batsmans[Bat1]+" is OUT for "+BatScore[Bat1]+" in "+Overs+"."+ Balls+" Balls");
									Bat1+=2;Balls++;Wicket++;continue c;}
								else {System.out.println("Wow Its a "+Get[Want]);
									System.out.println("Batsman "+Batsmans[Bat2]+" is OUT for "+BatScore[Bat2]+" in "+Overs+"."+ Balls+" Balls");
									Bat2+=2;Balls++;Wicket++;continue d;}
							}
							else if(Want==8) {
								if(StrikeChange==0) {System.out.println("Wow Its a "+Get[Want]);
									System.out.println("Batsman "+Batsmans[Bat1]+" is OUT for "+BatScore[Bat1]+" in "+Overs+"."+ Balls+" Balls");
									Bat1+=2;Balls++;Wicket++;continue c;}
								else {System.out.println("Wow Its a "+Get[Want]);
									System.out.println("Batsman "+Batsmans[Bat2]+" is OUT for "+BatScore[Bat2]+" in "+Overs+"."+ Balls+" Balls");
									Bat2+=2;Balls++;Wicket++;continue d;}
							}
							else if(Want==9) {
								if(StrikeChange==0) {System.out.println("Wow Its a "+Get[Want]);
									System.out.println("Batsman "+Batsmans[Bat1]+" is OUT for "+BatScore[Bat1]+" in "+Overs+"."+ Balls+" Balls");
									Bat1+=2;Balls++;Wicket++;continue c;}
								else {System.out.println("Wow Its a "+Get[Want]);
									System.out.println("Batsman "+Batsmans[Bat2]+" is OUT for "+BatScore[Bat2]+" in "+Overs+"."+ Balls+" Balls");
									Bat2+=2;Balls++;Wicket++;continue d;}
							}
							else {System.out.print("Its a "+Get[Want]);Extras+=1;}
							if(Balls==6) {Overs++;Bowl++;Balls=0;
							if(Bowl==11) {Bowl=5;}
							continue a;}
						}
					}
			}
		}TotalScore+=Extras;
		System.out.println("Total Score is "+TotalScore+" for "+Wicket+" Wickets");
		return TotalScore;}
}
