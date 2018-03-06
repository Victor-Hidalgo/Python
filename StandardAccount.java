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
    protected String Name;
    
    public StandardAccount(int s1, int s2, int s3, double s4, double s5, double s6, int s7, int s8, double s9, String s10) {
    
    
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
    
    public String getName(){
        
        return Name;
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
        
        double BroadbandSum = (MegabytesUsed - Broadband) * BroadbandCost;
        
        return BroadbandSum;
    }
    
    public double TotalCost(){
        
        double Total = PackageCost + TotalDaytime() + TotalWeekend() + TotalBroadband();
        
        return Total;
    }
}
