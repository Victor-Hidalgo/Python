import java.util.*;

public class BronzeAccount extends StandardAccount {
    
    protected int DaytimeMins;
    protected int WeekendMins;
    protected int MegabytesUsed;
    protected double DaytimeCost = 0.12;
    protected double WeekendCost = 0.05;
    protected double PackageCost = 36.00;
    protected int Channels = 60;
    protected int Broadband = 500;
    protected double BroadbandCost = 0.02;
    protected String Name = "Account Summary for Broze Account";
    
    public BronzeAccount(DaytimeMins, WeekendMins, MegabytesUsed){
        super(DaytimeMins, WeekendMins, MegabytesUsed);
    }
    
    public String getName() {
        
        return Name;
        
    }
}