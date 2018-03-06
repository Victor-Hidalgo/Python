import java.util.*;

public class GoldAccount extends StandardAccount {
    
    public GoldAccount(int DaytimeMins, int WeekendMins, int MegabytesUsed){
        super(DaytimeMins, WeekendMins, MegabytesUsed);
    }
    
    public String getName(){
        
        return "Account Summary for Silver Account";
    }
    
    public double DaytimeCost(){
        
        return 0.00;
    }
    
    public double WeekendCost(){
        
        return 0.00;
    }
    
    public double PackageCost(){
        
        return 61.00;
    }
    
    public int Channels(){
        
        return 230;
    }
    
    public int Broadband(){
        
        return 1520;
    }
    
    public double BroadbandCost(){
        
        return 0.01;
    }
}
