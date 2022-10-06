package CarParkingController;
import java.util.*;
import CarParkingModel.AvailableSpacePojo;
import CarParkingModel.CustomerPojo;
import CarParkingModel.TokenPojo;
public class ParkingCache {
	
	 static Map<Integer,Map<String,ArrayList<AvailableSpacePojo>>> availableMap=new HashMap<>();
	Map<Integer,AvailableSpacePojo> occupiedSpace=new HashMap<>();
	Map<Long,CustomerPojo> customerMap=new HashMap<>();
	Map<Integer,TokenPojo> ticketMap=new HashMap<>();
	int ticket=1000;
	int customerId=200;
	int floorFinal=0;
	int floorSlot=0;
	String[] amount=new String[3];
	public int ticketGenerate(){
		return  ++ticket;}
	
	public int getCustomerId(){
		return ++customerId;}
	
	public String messageShown(int floor,String vehicleType) throws Exception{
		Map<String,ArrayList<AvailableSpacePojo>> map=availableMap.get(floor);
		String varCheck=setVehicleSize(vehicleType);
		ArrayList<AvailableSpacePojo> list=map.get(varCheck);
		if(list.size() != 0 && floor <= floorFinal){
			return "kindly go to floor "+ floor +" we have Spaces there.";}
		else if( floor > floorFinal){
			return "All slots are filled ";}
		else if(!map.containsKey(varCheck)){
			AvailableSpacePojo pojo=list.get(0);
			return "we have available spaces at floor "+ pojo.getFloor1() ;}
		else{
			return "we dont have available spaces at floor " ;}}
	
	public void floorSize(int floor,int spot){
		int k=0;floorFinal=floor;floorSlot=spot;
		for(int i=1;i<=floor;i++){
			Map<String,ArrayList<AvailableSpacePojo>> store=availableMap.get(i);
			if(store == null){
				store=new HashMap<>();
				availableMap.put(floor, store);}
			ArrayList<AvailableSpacePojo> list=new ArrayList<>();
		for(int j=1;j<=spot/spot;j++){
			AvailableSpacePojo pojo=new AvailableSpacePojo();
			pojo.setChargingPoint(false);
			pojo.setSlot1(j);
			pojo.setFloor1(i);
			pojo.setAvailableSpace(1+k);
			pojo.setVehicleType("compact");
			list.add(pojo);}
		store.put("compact", list);
		ArrayList<AvailableSpacePojo> list1=new ArrayList<>();
		for(int j=1;j<=spot/spot;j++){
			AvailableSpacePojo pojo=new AvailableSpacePojo();
			pojo.setChargingPoint(true);
			pojo.setSlot1(j);
			pojo.setFloor1(i);
			pojo.setAvailableSpace(k++);
			pojo.setVehicleType("electriccar");
			list1.add(pojo);}
		store.put("electriccar", list1);
		ArrayList<AvailableSpacePojo> list2=new ArrayList<>();
		for(int j=1;j<=spot/spot;j++){
			AvailableSpacePojo pojo=new AvailableSpacePojo();
			pojo.setChargingPoint(false);
			pojo.setSlot1(j);
			pojo.setFloor1(i);
			pojo.setAvailableSpace(k++);
			pojo.setVehicleType("car");
			list2.add(pojo);}
		store.put("compact", list2);
		ArrayList<AvailableSpacePojo> list3=new ArrayList<>();
		for(int j=1;j<=spot/spot;j++){
			AvailableSpacePojo pojo=new AvailableSpacePojo();
			pojo.setChargingPoint(false);
			pojo.setSlot1(j);
			pojo.setFloor1(i);
			pojo.setAvailableSpace(k++);
			pojo.setVehicleType("bike");
			list3.add(pojo);}
		store.put("small", list3);
		ArrayList<AvailableSpacePojo> list4=new ArrayList<>();
		for(int j=1;j<=spot/spot;j++){
			AvailableSpacePojo pojo=new AvailableSpacePojo();
			pojo.setChargingPoint(false);
			pojo.setSlot1(j);
			pojo.setFloor1(i);
			pojo.setAvailableSpace(k++);
			pojo.setVehicleType("truck");
			list4.add(pojo);}
		store.put("large", list4);
		availableMap.put(i, store);}
	}
	//to get the vehicle size of compct.
	public String setVehicleSize(String type) throws Exception{
		if(type == null){
			return " given String is empty ";}
		type.toLowerCase();
		switch(type){
		case "car":return "compact";
		
		case "bike":return "small";
		
		case "minivan": return "compact";
		
		case "truck": return "large";
		
		default:return "large";} 
	}
	
	public String  addCustomerEntry(TokenPojo custom,int floor,int amountCar,String checkChargeConfirm) throws Exception{
		if(floor > floorFinal){
			throw new Exception("Floor size is greater than Available ");}
		for(int i=0;i < amount.length;i+=2){
	    	 amount[0]="4.0";
	    	 amount[1]="7.5";
	    	 amount[2]="9.5";}
		TokenPojo token=new TokenPojo();
		if(custom == null || availableMap == null){
			System.out.println("The customer details are empty ");}
		checkFloorAndSpot(floor);
		Map<String,ArrayList<AvailableSpacePojo>> mapSpace=availableMap.get(floor);
		long time=System.currentTimeMillis();
		custom.setTime(time);
		double sum=custom.getAmount();
		String money=""+custom.getAmount();
		AvailableSpacePojo num=null;
		if(sum == 0 || amount[0].equals(money) || amount[1].equals(money) || amount[2].equals(money)){
			String vehicleSize=setVehicleSize(custom.getVehicleType());
			ArrayList<AvailableSpacePojo> list1=mapSpace.get(vehicleSize);
			if(list1.size() == 0){
				throw new Exception("All spaces are filled for your vehicle type");}
			int ticket=ticketGenerate();
			custom.setTicketNumber(ticket);
			num=list1.get(0);
			num.setTicketNumber(ticket);
			 if(num.getAvailableSpace() > floorSlot){
				   throw new Exception("All slots are filled in the floors ");  }
			token.setSpot(num.getSlot1());
			token.setTime(System.currentTimeMillis());
			token.setFloor(floor);
			token.setTicketNumber(ticket);
			token.setSpot(num.getSlot1());
			token.setPaymentAtEntry(custom.getPaymentAtEntry());
			token.setVehicleNumber(custom.getVehicleNumber());
			token.setVehicleType(vehicleSize);
			ticketMap.put(ticket, token);
			list1.remove(0);
			 occupiedSpace.put(num.getSlot1(),num);
			 if(vehicleSize.equals("electriccar")){
			   if(amountCar == 9 && checkChargeConfirm.equals("pay") || checkChargeConfirm.equals("yes"))
				  custom.setChargeAmount(amountCar);
			   else if(amountCar == 0 && checkChargeConfirm.equals("no") ){
				   custom.setChargeAmount(0);}
			   else {
				   System.out.println("sorry money is less than we offer ");}
			 }
		}
		return "your token number- "+ticket +"  parking floor- "+ token.getFloor() +   
				" and for your vehicle type- " +token.getVehicleType()  +" and the slot is- "+ num.getAvailableSpace() ;}
	
	public void checkFloorAndSpot(int floor)throws Exception{
		if(ticketMap == null && floor > 0 && floor < floorFinal){
			throw new Exception("Floor size for you vehicle type is filled");}
		//TokenPojo token=ticketMap.get(floor);
		Map<String,ArrayList<AvailableSpacePojo>> list=availableMap.get(floor);
		//ArrayList<AvailableSpacePojo> arrayList=list.get(token.getVehicleType());
		if(list.size() == 0){
			throw new Exception("All spots for this vehicle type is filled ");}
	}
	
	public void floorInside(int floor) throws Exception{
		if(floor > floorFinal){
			  throw new Exception("Floor size is exceeded");}
	}
	
	public ArrayList<AvailableSpacePojo> checkAvailable(String vehicleType,int floor) throws Exception{
		Map<String,ArrayList<AvailableSpacePojo>> storeMap=availableMap.get(floor);
		if(storeMap == null){
			throw new Exception("Given floor not found ");}
		ArrayList<AvailableSpacePojo> space=storeMap.get(vehicleType);
		if(space == null){
			throw new Exception(" For given vehicle type spaces are filled ");}
		return space;}
	
	public AvailableSpacePojo checkSpace(int floor) throws Exception{
		AvailableSpacePojo space=occupiedSpace.get(floor);
		if(space == null){
			throw new Exception("Getting slots are empty in checkSpace ");}
		return space;}
	
	public String vehicleExits(int ticket,long mobileNumber) throws Exception{
		TokenPojo token=ticketMap.get(ticket);
		if(ticketMap == null ||  token == null){
			return "Given details are not updated ";}
		if(ticketMap.containsKey(ticket)){
			long time=token.getTime();
	    	long exitTime=System.currentTimeMillis();
	    	long timeValue=timeCalculate(time,exitTime);
	    	timeValue=timeValue/60; 
	    	CustomerPojo custom=customerMap.get(mobileNumber);
	    	if(mobileNumber == 0){
	    		System.out.println();}
	    	if(custom != null && custom.getAmount() == 0){
	    		if(timeValue <10000){
	    			return "kindly pay 4$";}
	    		else if(timeValue >10000 && timeValue <30000 ){
	    			return "pay $8";}
	    		else {
	    			return "pay $10";}
	    	}
	    	if( custom == null || custom.getMobileNumber() != mobileNumber && token.getPaymentAtEntry().equals("no")){
	    		System.out.println("your customer portal is not registered ");
	    		if (token.getPaymentAtEntry().equals("no") || timeValue < 10000 ){
	    			return "kindly pay $4";}
	    		else if( token.getPaymentAtEntry().equals("no") || timeValue > 10000 && timeValue < 30000 ) {
	    			return " Kindly pay $7.5";}
	    		else if(timeValue >30000){
	    			return "Pay $9.5";}
	    		else if(token.getAmount() != 0){
	    			return "Already paid";}
	    	}
	    	if(token.getPaymentAtEntry().equals("yes")){
	    		if(timeValue <10000){
	    			return "Amount already paid";}
	    		else if(timeValue >10000 && timeValue < 30000){
	    			return "pay amount $3";}
	    		else {
	    			return "pay amount $5";}
	    	}
	      }
		return "Amount debited from your Id";}
	
	public String callExits(int ticket,double amount,long mobileNumber,double returnMoney) throws Exception{
		TokenPojo token=ticketMap.get(ticket);
		ArrayList<AvailableSpacePojo> array=checkAvailable(token.getVehicleType(),token.getFloor());
		AvailableSpacePojo pojo=checkSpace(token.getSpot());
		if(pojo.getTicketNumber() == ticket){
			array.add(pojo);
			occupiedSpace.remove(token.getSpot());}
		ticketMap.remove(ticket);
		token.setAmount(amount);
		boolean status=false;
		if(customerMap.containsKey(mobileNumber) ){
			CustomerPojo custom=customerMap.get(mobileNumber);
			status=statusOfMoney(mobileNumber);
			if(custom.getMobileNumber()== mobileNumber){
			double amountMoney=custom.getAmount()-returnMoney;
			custom.setAmount(amountMoney);
			customerMap.put(mobileNumber, custom);
	    	return "vehicle Exits Successfully";}
		else if(custom != null && custom.getAmount() < 12.0 && custom.getCustomerId()== token.getCustomerId()){
			return "please add money in your customer id account";}
		}
		if(token.getAmount() == 0 && status == true){
			return "please pay the amount";}
		else {
	    	return "vehicle Exits Successfully";}
	}
 
	public String vehicleSpots(int ticket) throws Exception{
		TokenPojo token=ticketMap.get(ticket);
		if(token == null){
			return "given tickets are not registered ";}
		return "The ticket Number "+ token.getTicketNumber() +" parks at "	+ token.getFloor() + " and spot is "+ token.getSpot();	}
	
	public String generateCustomerId(CustomerPojo custom) throws Exception{
		String res="";
		if (custom == null){
			return "given details are null";}
		int id=getCustomerId();
		custom.setCustomerId(id);
		customerMap.put(custom.getMobileNumber(), custom);
		String tyope=setVehicleSize(custom.getVehicleType());
		custom.setVehicleType(tyope);
		if(customerMap == null){
			return " given details are invalid ";}
		else {
		    res="Customer Id generated successfully and your id is "+id; 	}
		return res;}
	
	public String addAmountInCustomerAccount(long mobileNumber,double amount) throws Exception{
		if(customerMap == null){
			return "The details are not in the list ";}
		CustomerPojo custom=customerMap.get(mobileNumber);
		if(custom == null || amount < 9.0){
			return " the customer details are empty ";}
	   double amount1=custom.getAmount()+amount;
	   custom.setAmount(amount1);
	   customerMap.put(mobileNumber, custom);
	   if(customerMap != null){
		   return " Amount credited in your Account Successfully ";}
	   else{
		   return "Amount is not acceptable ";}
	}
	
	public Map<Long, CustomerPojo> customerDetails() throws Exception{
		if(customerMap == null){
			System.out.println("The details are empty ");}
		return customerMap;}
	
	public int amountReturnedInCache(long mobileNumber) throws Exception{
		if(customerMap == null || !customerMap.containsKey(mobileNumber)){
			return 0;}
		CustomerPojo customer=customerMap.get(mobileNumber);
		double amount=customer.getAmount();
		return (int)amount;}
	
	public boolean statusOfMoney(long mobileNumber) throws Exception{
		if(mobileNumber == 0){
			return false;}
		if(!customerMap.containsKey(mobileNumber)){
			throw new Exception("Mobile number not registered");}
		CustomerPojo customer=customerMap.get(mobileNumber);
		if(customer.getAmount() > 0){
			return true;}
		else {
			return false;}
	}
	
	public String amountAddedInWallet(long mobileNumber,String paymentType,double walletAmount) throws Exception{
       if(customerMap == null){
    	   return "details are not registered ";}
       double amount=0;
       if(customerMap.containsKey(mobileNumber) && walletAmount > 0){
    	   CustomerPojo custom=customerMap.get(mobileNumber);
    	   amount=custom.getAmount();
    	   custom.setPaymentType(paymentType);
    	   amount+=walletAmount;
    	   custom.setAmount(amount);}
       return "your id "+mobileNumber+" respective given amount "+ walletAmount+" amount has been added "+
       "your total amount in portal are "+ amount;}
	
	public long timeCalculate(long time,long exit) throws Exception{
		long result=exit-time;
		return result;}
	
	public String customerPortalChecking(long mobileNumber) throws Exception{
		if(!customerMap.containsKey(mobileNumber)){
			return "sorry your mobile Number is not registered ";}
	return "yes";}
	
	public void checkFloor(int floor) throws Exception{
		if( occupiedSpace != null && occupiedSpace.size() < floor && !availableMap.containsKey(floor)){
			throw new Exception("The Floor number is exceeded");}
	}
	
	public void checktypeFloor(int floor,String type) throws Exception{
	   AvailableSpacePojo pojo=occupiedSpace.get(floor);
	   if(pojo.getVehicleType().equals(type)){
		   if(pojo.getAvailableSpace() > floorSlot){
			   throw new Exception("All slots are filled for your vehicle type ");  }
		   return;}
	   else  if(pojo.getAvailableSpace() > floorSlot){
		   throw new Exception("All slots are filled for your vehicle type ");  }
	   else {
		   throw new Exception("All slots are filled for your vehicle type ");}
	}
	
	public void tokenCheck(int ticket) throws Exception{
		if(!ticketMap.containsKey(ticket)){
			throw new Exception("ticketNumber is not registered ");}
		return;}
}

