package Cricket;
import java.util.*;
public class Toss extends Squad {
	static int toss(String Team1,String Team2) {
		System.out.println("Welcome Dubai Now It's the Toss Time");
		Random r=new Random();
		int Toss=r.nextInt(2);
		if(Toss == 0) {
			System.out.println(Team1+" Choose Head OH YEAH It's the Lucky Day for "+Team1+" It's HEAD");
				System.out.println(Team1+" win the toss and choose to Bat");}
		else {
			System.out.println(Team2+" Choose Tail OH YEAH It's the Lucky Day for "+Team2+" It's TAIL");
				System.out.println(Team2+" win the toss and choose to Bat");}
		System.out.println();
	return Toss;
	}
}
