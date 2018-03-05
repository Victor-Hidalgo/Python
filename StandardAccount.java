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
    
    public StandardAccount(DaytimeMins, WeekendMins, Megabytes) {

    }
    
    public abstract String getName();
    
    public double TotalDaytime(){
        
        double DaytimeSum = DaytimeMins * DaytimeCost;
        
        return DaytimeSum;
    }
    
    public double TotalWeekend(){
        
        double WeekendSum = WeekendMins * WeekendCost;
        
        return WeekendSum;
    }
    
    public double TotalBroadband(){
        
        double BroadbandSum = (MegabytesUsed - Broadband) * BroadbandCost;
        
        return BroadbandSum;
    }
    
    public double TotalCost(){
        
        double Total = PackageCost + TotalDaytime() + TotalWeekend() + TotalBroadband();
        
        return Total;
    }
}