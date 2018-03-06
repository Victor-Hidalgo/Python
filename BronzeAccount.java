import java.util.*;

public class BronzeAccount extends StandardAccount {
    
    public BronzeAccount(int DaytimeMins, int WeekendMins, int MegabytesUsed){
        super(DaytimeMins, WeekendMins, MegabytesUsed);
    }
    
     public String getName(){
        
        return "Account Summary for Broze Account";
    }
    
    public double DaytimeCost(){
        
        return 0.12;
    }
    
    public double WeekendCost(){
        
        return 0.05;
    }
    
    public double PackageCost(){
        
        return 36.00;
    }
    
    public int Channels(){
        
        return 60;
    }
    
    public int Broadband(){
        
        return 500;
    }
    
    public double BroadbandCost(){
        
        return 0.02;
    }
    
}
