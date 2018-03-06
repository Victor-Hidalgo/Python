import java.util.*;

public class StandardAccount {
    
    protected int DaytimeMins;
    protected int WeekendMins;
    protected int MegabytesUsed;
    protected double DaytimeCost;
    protected double WeekendCost;
    protected double PackageCost;
    protected int Channels;
    protected int Broadband;
    protected double BroadbandCost;
    
    public StandardAccount(int s1, int s2, int s3, double s4, double s5, double s6, int s7, int s8, double s9) {
    
    DaytimeMins = s1;
	WeekendMins = s2;
	MegabytesUsed = s3;
	DaytimeCost = s4;
	WeekendCost = s5;
	PackageCost = s6;
	Channels = s7;
	Broadband = s8;
	BroadbandCost = s9;
	
    }
    
    public double getDaytimeCost(){
        
        return DaytimeCost;
    }
    
    public double getWeekendCost(){
        
        return WeekendCost;
    }
    
    public double getPackageCost(){
        
        return PackageCost;
    }
    
    public int getChannels(){
        
        return Channels;
    }
    
    public int getBroadband(){
        
        return Broadband;
    }
    
    public double getBroadbandCost(){
        
        return BroadbandCost;
    }
    
    public double TotalDaytime(){
        
        double DaytimeSum = DaytimeMins * DaytimeCost;
        
        return DaytimeSum;
    }
    
    public double TotalWeekend(){
        
        double WeekendSum = WeekendMins * WeekendCost;
        
        return WeekendSum;
    }
    
    public double TotalBroadband(){
        
        double BroadbandSum; 
		
		if (MegabytesUsed > Broadband){BroadbandSum = (MegabytesUsed - Broadband) * BroadbandCost;}
		
		else BroadbandSum = 0.00;
        
        return BroadbandSum;
    }
    
    public double TotalCost(){
        
        double Total = PackageCost + TotalDaytime() + TotalWeekend() + TotalBroadband();
        
        return Total;
    }
}
