package Cricket;
import java.util.*;
public class BattingBowling {
 public static int BatBowl(String Batsman[],String Bowler[]) {
	 Random r=new Random();
		int BatsmanScore[]=new int[11];	
		int TotalScore=0,Extras=0,a=0,Balls=1;
		int j=1,k=1,e=5,BowlerWicket=0,BowlerScore=0,score=0,run;
		a:for(int i=0;i<11;) {
			b:for(;j<11;) {
				for(;k<21;k++) {
					if(e==11) {e=5;}
					System.out.println("The "+k+" Over is Bowled by "+Bowler[e]);
					if(Balls<=6) {
						int Run=r.nextInt(-2,7);
						run=Run+Run;
						if((Run>=0)&&(Run!=5)) {
							BowlerScore+=run;}
						if(((Run==1)||(Run==3)||(Run%2==0))&&(Run!=5)&&(Run>=0)&&(a==0)) {
							BatsmanScore[i]+=run;
							Balls=Balls+1;
							if((Run==1)||(Run==3)) {a++;}
						}
						else if(((Run==1)||(Run==3)||(Run%2==0))&&(Run!=5)&&(Run>=0)&&(a==1)) {
							BatsmanScore[j]+=run;
							Balls=Balls+1;
							if((Run==1)||(Run==3)) {a--;}
						}
						else if((Run==-1)||(Run==5)) {
							Extras+=1;}
						else if(Run==-2) {
							BowlerWicket++;
							int b=r.nextInt(2);
							if(b==0) {
								System.out.println(Batsman[i]+" is OUT in "+BatsmanScore[i]);i=i+2;Balls=Balls+1;
								continue a;}
							else {
								System.out.println(Batsman[j]+" is OUT in "+BatsmanScore[j]);j=j+2;Balls=Balls+1;
								continue b;}
						}
						else {
							Extras+=1;}
					}e++;
					score+=BowlerScore;
					System.out.println(Batsman[i]+" is "+BatsmanScore[i]+" upto "+k+" Overs ");
					System.out.println(Batsman[j]+" is "+BatsmanScore[j]+" upto "+k+" Overs ");
					System.out.println("Extras upto "+k+" Overs is "+Extras+" runs");
					System.out.println("The Bowler Gives "+BowlerScore+" Runs");
					Balls=1;System.out.println();BowlerScore=0;}
				TotalScore+=score+Extras;
				System.out.println("Total Score upto  "+(k-1)+" Overs is "+TotalScore+" runs and "+BowlerWicket+" Wickets");	
				System.out.println("Total Score in the First Innings is  "+TotalScore); 
				break a;}
		    }return TotalScore;
	}
}