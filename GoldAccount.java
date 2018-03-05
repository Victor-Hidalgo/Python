import java.util.*;

public class GoldAccount extends StandardAccount {
    
    protected int DaytimeMins;
    protected int WeekendMins;
    protected int MegabytesUsed;
    protected double DaytimeCost = 0.00;
    protected double WeekendCost = 0.00;
    protected double PackageCost = 61.00;
    protected int Channels = 230;
    protected int Broadband = 1520;
    protected double BroadbandCost = 0.01;
    protected String Name = "Account Summary for Gold Account";
    
    public GoldAccount(DaytimeMins, WeekendMins, MegabytesUsed){
        super(DaytimeMins, WeekendMins, MegabytesUsed);
    }
    
    public String getName() {
        
        return Name;
        
    }
}