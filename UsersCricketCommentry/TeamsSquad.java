package CricketScoreBoard;
public class TeamsSquad extends InningsCall {
	public static void Squad(int Toss1,int Toss2,int i,int j) {
		TeamsSquad Three=new TeamsSquad();
		String IndianPlayers[]= {"Rahul","Rohit","Virat Kholi","Suryakumar Yadav","Karthik","Hardik Pandya","Jadeja","Axar","Chahal","D Chahar","Bhuvneshwar"};
		String PakistanPlayers[]= {"Rizwan","Babar Azam","Fakhar Zaman","Khushdil","Ahmed","Shadab Khan","A Ali","Nawaz","H Rauf","M Hasnain","N Shah"};
		String AustralianPlayers[]= {"D Warner","A Finch","S Smith","G Maxwell","M Stoinis","Al Carey","Adam Zampa","P Cummins","M Starc","P Handscomb","N Coulter"};
		String EnglandPlayers[]= {"A Lees","Z Crawley","O Pope","Root","H Brook","Strokes","Foakes","Broad","Robinson","J Leach","J Anderson"};
		
		
		if(((i==1)&&(j==2))||((i==1)&&(j==3))||((i==1)&&(j==4))) {
			if(((Toss1==0)&&(Toss2==0))||((Toss1==1)&&(Toss2==1))) {
				if(j==2) {Three.Innings(IndianPlayers,PakistanPlayers);}
				else if(j==3) {Three.Innings(IndianPlayers,AustralianPlayers);}
				else {Three.Innings(IndianPlayers,EnglandPlayers);}}
			else {
				if(j==2) {Three.Innings(PakistanPlayers,IndianPlayers);}
				else if(j==3) {Three.Innings(AustralianPlayers,IndianPlayers);}
				else {Three.Innings(EnglandPlayers,IndianPlayers);}}
		}
		
		
		if(((i==2)&&(j==1))||((i==2)&&(j==3))||((i==2)&&(j==4))) {
			if(((Toss1==0)&&(Toss2==0))||((Toss1==1)&&(Toss2==1))) {
				if(j==1) {Three.Innings(PakistanPlayers,IndianPlayers);}
				else if(j==3) {Three.Innings(PakistanPlayers,AustralianPlayers);}
				else {Three.Innings(PakistanPlayers,EnglandPlayers);}}
			else {
				if(j==1) {Three.Innings(IndianPlayers,PakistanPlayers);}
				else if(j==3) {Three.Innings(AustralianPlayers,PakistanPlayers);}
				else {Three.Innings(EnglandPlayers,PakistanPlayers);}}
		}
		
		
		if(((i==3)&&(j==1))||((i==3)&&(j==2))||((i==3)&&(j==4))) {
			if(((Toss1==0)&&(Toss2==0))||((Toss1==1)&&(Toss2==1))) {
				if(j==1) {Three.Innings(AustralianPlayers,IndianPlayers);}
				else if(j==2) {Three.Innings(AustralianPlayers,PakistanPlayers);}
				else {Three.Innings(AustralianPlayers,EnglandPlayers);}}
			else {
				if(j==1) {Three.Innings(IndianPlayers,AustralianPlayers);}
				else if(j==2) {Three.Innings(PakistanPlayers,AustralianPlayers);}
				else {Three.Innings(EnglandPlayers,AustralianPlayers);}}
		}
		
		
		if(((i==4)&&(j==1))||((i==4)&&(j==2))||((i==4)&&(j==3))) {
			if(((Toss1==0)&&(Toss2==0))||((Toss1==1)&&(Toss2==1))) {
				if(j==1) {Three.Innings(EnglandPlayers,IndianPlayers);}
				else if(j==2) {Three.Innings(EnglandPlayers,PakistanPlayers);}
				else {Three.Innings(EnglandPlayers,AustralianPlayers);}}
			else {
				if(j==1) {Three.Innings(IndianPlayers,EnglandPlayers);}
				else if(j==2) {Three.Innings(PakistanPlayers,EnglandPlayers);}
				else {Three.Innings(AustralianPlayers,EnglandPlayers);}}
		}
	}
}
