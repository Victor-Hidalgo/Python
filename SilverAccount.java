import java.util.*;

public class SilverAccount extends StandardAccount { 
	
    public SilverAccount(int DaytimeMins, int WeekendMins, int MegabytesUsed, double DaytimeCost, double WeekendCost, double PackageCost, int Channels, int Broadband, double BroadbandCost){
        super(DaytimeMins, WeekendMins, MegabytesUsed, DaytimeCost, WeekendCost, PackageCost, Channels,Broadband,BroadbandCost);
    }
    
    public void getAccount() {
    
	 System.out.println("Account Summary for Silver Account \n Package Cost: " + getPackageCost() + "\n Cost of daytime calls: " + getDaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + getWeekendCost() + "/min \n Number of Channels: " + getChannels()
        + "\n Broadband Included: " + getBroadband() + "Mb \n Broadband Cost (above included limit): " + getBroadbandCost()
        + "/Mb \n Total daytime calls cost: " + TotalDaytime() + "\n Total evening calls: " + TotalWeekend() + "\n Total (extra) broadband cost: "
        + TotalBroadband() + "\n Total cost: " + TotalCost() + "\n Spotify Account provided");
        
    }
}
