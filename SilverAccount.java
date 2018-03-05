import java.util.*;

public class SilverAccount extends StandardAccount {
    
    protected int DaytimeMins;
    protected int WeekendMins;
    protected int MegabytesUsed;
    protected double DaytimeCost = 0.12;
    protected double WeekendCost = 0.00;
    protected double PackageCost = 46.00;
    protected int Channels = 130;
    protected int Broadband = 1000;
    protected double BroadbandCost = 0.01;
    protected String Name = "Account Summary for Silver Account";
    
    public SilverAccount(DaytimeMins, WeekendMins, MegabytesUsed){
        super(DaytimeMins, WeekendMins, MegabytesUsed);
    }
    
    public String getName() {
        
        return Name;
        
    }
}