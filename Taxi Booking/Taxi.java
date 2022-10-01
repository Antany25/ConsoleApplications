package TaxiBooking;
public class Taxi {
	char currentPosition;
    int earning,departureTime;
    public Taxi() {
        currentPosition='a'; }
    public boolean isTaxiFree(int pickupTime) {
        if(departureTime<pickupTime)
            return false;
        return true;  }
    public void departureTime(char pickUpPoint,char dropPoint,int pickUpTime){
        departureTime=pickUpTime+Math.abs(pickUpPoint-dropPoint);}
}
