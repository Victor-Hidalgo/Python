import java.util.*;

public class SilverAccount extends StandardAccount {
    
    public SilverAccount(int DaytimeMins, int WeekendMins, int MegabytesUsed){
        super(DaytimeMins, WeekendMins, MegabytesUsed);
    }
    
    public String getName(){
        
        return "Account Summary for Silver Account";
    }
    
    public double DaytimeCost(){
        
        return 0.12;
    }
    
    public double WeekendCost(){
        
        return 0.00;
    }
    
    public double PackageCost(){
        
        return 46.00;
    }
    
    public int Channels(){
        
        return 130;
    }
    
    public int Broadband(){
        
        return 1000;
    }
    
    public double BroadbandCost(){
        
        return 0.01;
    }
}
