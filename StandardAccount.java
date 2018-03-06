import java.util.*;

public class StandardAccount {
    
    protected int DaytimeMins;
    protected int WeekendMins;
    protected int MegabytesUsed;
    
    public StandardAccount(int s1, int s2, int s3) {
    
    DaytimeMins=s1;
    WeekendMins=s2;
    MegabytesUsed=s3;
    }
    
    public double DaytimeCost(){
        
        return 0.00;
    }
    
    public double WeekendCost(){
        
        return 0.00;
    }
    
    public double PackageCost(){
        
        return 0.00;
    }
    
    public int Channels(){
        
        return 0;
    }
    
    public int Broadband(){
        
        return 0;
    }
    
    public double BroadbandCost(){
        
        return 0.00;
    }
    
    public String getName(){
        
        return "null";
    }
    
    public double TotalDaytime(){
        
        double DaytimeSum = DaytimeMins * DaytimeCost();
        
        return DaytimeSum;
    }
    
    public double TotalWeekend(){
        
        double WeekendSum = WeekendMins * WeekendCost();
        
        return WeekendSum;
    }
    
    public double TotalBroadband(){
        
         double BroadbandSum; 
		
		if (MegabytesUsed > Broadband()){BroadbandSum = (MegabytesUsed - Broadband()) * BroadbandCost();}
		
		else BroadbandSum = 0.00;
        
        return BroadbandSum;
    }
    
    public double TotalCost(){
        
        double Total = PackageCost() + TotalDaytime() + TotalWeekend() + TotalBroadband();
        
        return Total;
    }
}
