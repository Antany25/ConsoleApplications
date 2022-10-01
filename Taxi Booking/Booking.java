package TaxiBooking;
public class Booking {
	int customer_id,pickUpTime,dropTime,taxiNo,earning;
    char pickUpPoint,dropPoint;
    public Booking(int cust_id,char pickupPoint,char droppoint,int pickupTime)
    {
        customer_id=cust_id;
        pickUpPoint=pickupPoint;
        dropPoint=droppoint;
        pickUpTime=pickupTime;
    }
    public void dropTime()
    {
        this.dropTime=pickUpTime+Math.abs(pickUpPoint-dropPoint);
    }
    public int checkAvailability(Taxi[] taxi,int taxiCount)
    {
        int taxiId,taxiid=0,shortestDistance=6;
        for(taxiId=0;taxiId<taxiCount;taxiId++)
        {
            if(taxi[taxiId].isTaxiFree(pickUpTime))
            {
                if(Math.abs(taxi[taxiId].currentPosition-pickUpPoint)<shortestDistance)
                {
                    taxiid=taxiId;
                }
                if(Math.abs(taxi[taxiId].currentPosition-pickUpPoint)==shortestDistance)
                {
                    if(taxi[taxiId].earning<taxi[taxiid].earning)
                        taxiid=taxiId;
                }
            }
            shortestDistance=Math.abs(taxi[taxiid].currentPosition-pickUpPoint);
        }
        if(shortestDistance!=6)
        {
            taxi[taxiid].departureTime(pickUpPoint,dropPoint,pickUpTime);
            taxi[taxiid].currentPosition=dropPoint;
            taxiNo=taxiid;
            return taxiNo;
        }
        return -1;
    }
}


