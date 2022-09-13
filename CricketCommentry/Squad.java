package Cricket;
public class Squad{
	public static void SquadTeam(int FirstTeam,int SecondTeam,int a) {
		Innings b=new Innings();
		String IndianPlayers[]= {"Rahul(BAT)","Rohit(CAPTAIN,BAT)","Virat Kholi(BAT)","Suryakumar Yadav(BAT)","Karthik(BAT & Wk)","Hardik Pandya(BAT & BOWL)","Jadeja(BAT & BOWL)","Axar(BAT & BOWL)","Chahal(BOWL)","D Chahar(BOWL)","Bhuvneshwar(BOWL)"};
		String PakistanPlayers[]= {"Rizwan(BAT & WK)","Babar Azam(CAPTAIN,BAT)","Fakhar Zaman(BAT)","Khushdil(BAT)","Ahmed(Bat & Bowl)","Shadab Khan(BAT & BOWL)","A Ali(BAT)","Nawaz(BAT & BOWL)","H Rauf(BOWL)","M Hasnain(BOWL)","N Shah(BOWL)"};
		String AustralianPlayers[]= {"D Warner(BAT)","A Finch(CAPTAIN,BAT)","S Smith(BAT)","G Maxwell(BAT)","M Stoinis(BAT & BOWL)","Al Carey(BAT & Wk)","Adam Zampa(Bowl)","P Cummins(BAT & BOWL)","M Starc(BOWL)","P Handscomb(BOWL)","N Coulter(BOWL)"};
		String EnglandPlayers[]= {"A Lees(BAT)","Z Crawley(BAT)","O Pope(BAT)","Root(BAT)","H Brook(BAT)","Strokes(CAPTAIN & BAT & BOWL)","Foakes(BAT & WK)","Broad(BOWL)","Robinson(BOWL)","J Leach(BOWL)","J Anderson(BOWL)"};
		if(FirstTeam==0) {
			System.out.println("INDIAN TEAM PLAYERS");	
			for(String i:IndianPlayers) {
				System.out.println(i);}
			System.out.println();
			if(SecondTeam==1) {
				System.out.println("PAKISTAN TEAM PLAYERS");
				for(String i:PakistanPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(IndianPlayers,PakistanPlayers);}
				else {b.innings(PakistanPlayers,IndianPlayers);}
			}
			if(SecondTeam==2) {
				System.out.println("AUSTRALIAN TEAM PLAYERS");
				for(String i:AustralianPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(IndianPlayers,AustralianPlayers);}
				else {b.innings(AustralianPlayers,IndianPlayers);}}
			if(SecondTeam==3) {
				System.out.println("ENGLAND TEAM PLAYERS");
				for(String i:EnglandPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(IndianPlayers,EnglandPlayers);}
				else {b.innings(EnglandPlayers,IndianPlayers);}}
			}
		if((FirstTeam==1)) {
			System.out.println("PAKISTAN TEAM PLAYERS");
			for(String i:PakistanPlayers) {
				System.out.println(i);}
			System.out.println();
			if(SecondTeam==0) {
				System.out.println("INDIAN TEAM PLAYERS");
				for(String i:IndianPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(PakistanPlayers,IndianPlayers);}
				else {b.innings(IndianPlayers,PakistanPlayers);}
				}
			if(SecondTeam==2) {
				System.out.println("AUSTRALIAN TEAM PLAYERS");
				for(String i:AustralianPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(PakistanPlayers,AustralianPlayers);}
				else {b.innings(AustralianPlayers,PakistanPlayers);}
				}
			if(SecondTeam==3) {
				System.out.println("ENGLAND TEAM PLAYERS");
				for(String i:EnglandPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(PakistanPlayers,EnglandPlayers);}
				else {b.innings(EnglandPlayers,IndianPlayers);}}
			}
		if(FirstTeam==2) {
			System.out.println("AUSTRALIAN TEAM PLAYERS");
			for(String i:AustralianPlayers) {
				System.out.println(i);}
			System.out.println();
			if(SecondTeam==0) {
				System.out.println("INDIAN TEAM PLAYERS");
				for(String i:IndianPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(AustralianPlayers,IndianPlayers);}
				else {b.innings(IndianPlayers,AustralianPlayers);}}
			if(SecondTeam==1) {
				System.out.println("PAKISTAN TEAM PLAYERS");
				for(String i:PakistanPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(AustralianPlayers,PakistanPlayers);}
				else {b.innings(PakistanPlayers,AustralianPlayers);}}
			if(SecondTeam==3) {
				System.out.println("ENGLAND TEAM PLAYERS");
				for(String i:EnglandPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(AustralianPlayers,EnglandPlayers);}
				else {b.innings(EnglandPlayers,AustralianPlayers);}}
			}
		if(FirstTeam==3) {
			System.out.println("ENGLAND TEAM PLAYERS");
			for(String i:EnglandPlayers) {
				System.out.println(i);}
			System.out.println();
			if(SecondTeam==0) {
				System.out.println("INDIAN TEAM PLAYERS");
				for(String i:IndianPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(EnglandPlayers,IndianPlayers);}
				else {b.innings(IndianPlayers,EnglandPlayers);}}
			if(SecondTeam==1) {
				System.out.println("PAKISTAN TEAM PLAYERS");
				for(String i:PakistanPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(EnglandPlayers,PakistanPlayers);}
				else {b.innings(PakistanPlayers,EnglandPlayers);}}
			if(SecondTeam==2) {
				System.out.println("AUSTRALIAN TEAM PLAYERS");
				for(String i:AustralianPlayers) {
					System.out.println(i);}
				System.out.println();
				if(a==0) {b.innings(EnglandPlayers,AustralianPlayers);}
				else {b.innings(AustralianPlayers,EnglandPlayers);}}
			}
	}
}
