package FoodOrder;
import java.util.*;
public class MealOrder {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String [] dishnames={"Parotta", "Chilli Parotta", "Kothu Parotta", "Naan", "Fried Rice","Grill Chicken","Briyani"};
		double [] prices={15.0, 60.0, 50.0, 70.0, 100.0,450.0,150.0};
		int [] praisenums=new int [7];
		String [] names=new String [7];
		String [] Dishes=new String [7];
		int [] dishnums=new int [7];
		int [] times=new int [7];
		String [] addresses=new String [7];
		int [] states=new int [7];
		double [] sumprices=new double [7];
		System.out.println ("Welcome to the Food Alliance Ordering System ");
		int num=1;
		boolean isexit=false;
		
		do {
			System.out.println ("************************");
			System.out.println ("1.I want to order");
			System.out.println ("2.view meal bag");
			System.out.println ("3.Signed order");
			System.out.println ("4.delete order");
			System.out.println ("5.I want to like it");
			System.out.println ("6.Exit the system");
			System.out.println ("************************");
			System.out.print ("Please select:");
			num=s.nextInt ();
			switch (num) {
			
			case 1:
				System.out.println ("*** I want to order a meal ***");
				boolean isadd=false;
				int z=1;
				for (int i=0;i<names.length;i ++) {
					if (names [i] == null) {
						isadd=false;
						System.out.print ("Please enter the orderer's name:");
						String name=s.next ();
						System.out.format("%-18s%-20s%-22s%-20s","Serial Number","Dish Name","Unit Price","Number of Likes");
						System.out.println();
						
						for (int j=0;j<dishnames.length;j ++) {
							System.out.format("%-18s%-20s%-22s%-20s",(j + 1),dishnames[j],prices[j]+"Rs",praisenums[j]);
							System.out.println();}
						int choosedish=0,number=0,time=0;
						String dishes="";
						while(z==1) {
						System.out.print ("Please select the number of your order:");
						choosedish=s.nextInt ();
						dishes=dishnames [choosedish-1];
						System.out.print ("Please select the number of copies you need:");
						number=s.nextInt ();
						System.out.print ("Please enter the delivery time (delivery time is from 10 am to 8 pm):");
						time=s.nextInt ();
						System.out.println("If you want to add more enter 1 or exit to enter 0");
						z=s.nextInt();}
						
						while (time<10 || time>20) {
							System.out.print ("Your input was incorrect.Please enter an integer between 10-20 ");
							time=s.nextInt ();}
						
						System.out.print ("Please enter the delivery address:");
						String address=s.next();
						System.out.println ("Order successfully!");
						System.out.println ("What you set is:"+dishnames[choosedish-1]+" "+number+" Nos");
						System.out.println ("Meal delivery time:"+time+"point");
						double sumprice=prices [choosedish-1] * number;
						double sendmoney=(sumprice>= 50)?0:5;
						System.out.println ("Meals: "+sumprice+" Rs, "+" Delivery Charge "+sendmoney+" Rs, "+" Total: "+(sumprice + sendmoney)+" Rs. ");
						names [i]=name;
						Dishes[i]=dishes;
						times [i]=time;
						dishnums [i]=number;
						addresses [i]=address;
						sumprices [i]=sumprice + sendmoney;
						
						}
					
					if (isadd) {
						System.out.println ("Sorry, your bag is full!");}
				}
				break;
				
			case 2:
				System.out.println ("*** View meal bag ***");
				System.out.format("%-15s%-16"
						+ "s%-17s%-18s%-19s%-20s%-21s%-22s","Serial number","Orderer","Meal name","Meal number","Delivery time","Delivery address","Total amount","Order status");
				System.out.println();
				for (int i=0;i<names.length;i ++) {
					if (names [i]!=null) {
						String state=(states [i] == 0)?"Booked":"Completed";
						System.out.format("%-15s%-16s%-17s%-18s%-19s%-20s%-21s%-22s",(i + 1),names [i],Dishes [i],dishnums [i]+" Nos",times [i],addresses [i],sumprices [i]+" Rs",state);}
					System.out.println();}
				break;
				
			case 3:
				System.out.println ("*** Sign up order ***");
				boolean issignfind=false;
				System.out.print ("Please select the order number to be signed for:");
				int sign=s.nextInt ();
				
				for (int i=0;i<names.length;i ++) {
					if (names [i]!=null&&states [i] == 0&&sign == i + 1) {
						states [i]=1;
						System.out.println ("Order received successfully!");
						issignfind=true;} 
					else if (names [i]!=null && states [i] == 1 && sign == i + 1) {
						System.out.println ("The order you selected has been signed for,Can't sign for it again! ");
						issignfind=true;}
				}
				
				if (! issignfind) {
					System.out.println ("The order you selected does not exist!");}
				break;
				
			case 4:
				System.out.println ("*** Delete order ***");
				boolean isdelfind=false;
				System.out.print ("Please enter the serial number of the order to be deleted:");
				int delid=s.nextInt ();
				
				for (int i=0;i<names.length;i ++) {
					
					if (names [i]!=null && states[i]==1 && delid==i + 1) {
						isdelfind=true;
						for (int j=delid-1;j<names.length-1;j ++) {
							names[j]=names[j+1];
							Dishes[j]=Dishes[j+1];
							dishnums[j]=dishnums[j+1];
							times[j]=times[j+1];
							addresses[j]=addresses[j+1];
							states[j]=states[j+1];
							sumprices[j]=sumprices[j+1];}
						
						names [names.length-1]=null;
						Dishes [names.length-1]=null;
						dishnums [names.length-1]=0;
						times [names.length-1]=0;
						addresses [names.length-1]=null;
						states [names.length-1]=0;
						sumprices [names.length-1]=0;
						System.out.println("Delete order successfully!");
						break;}
					
					else if (names [i]!=null && states[i]==0 && delid==i+1) {
						isdelfind=true;
						System.out.println("The order you selected is not signed,Cannot be deleted! ");
						break;}
				} 
				
				if (! isdelfind) {
					System.out.println("The order i want to delete does not exist!");}
				break;
				
			case 5:
				System.out.println("*** I want to like it ***");
				System.out.format("%-18s%-20s%-22s","Serial number","Name","Unit price");
				System.out.println();
				
				for (int i=0;i<dishnames.length;i ++) {
					String priaisenum=(praisenums[i]>0)?praisenums [i] + "like":"";
					System.out.format("%-18s%-20s%-22s",(i + 1),dishnames[i],prices[i]+"Rs",priaisenum);
					System.out.println();}
				
				System.out.print ("Please select the serial number of the dish i want to like:");
				int number=s.nextInt ();
				praisenums[number]++;
				System.out.println ("Like success");
				break;
				
			case 6:
				isexit=true;
				break;
				
			default:
				isexit=true;
				break;
			}
			
			if(!isexit) {
				System.out.print("Enter 0 to return:");
				num=s.nextInt ();} 
			
			else{
				break;}
		} 
		
		while (num == 0);
			s.close();}
}
