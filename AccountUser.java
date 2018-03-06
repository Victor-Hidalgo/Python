import java.util.*;

public class AccountUser{
    
    public static void main (String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of daytime minutes used per month:");
        int DayTime = input.nextInt();
        
        System.out.println("Please enter the number of nighttime minutes used per month:");
        int NightTime = input.nextInt();
        
        System.out.println("Please enter the number of Megabytes used per month:");
        int MegabytesUsed = input.nextInt();
        
        BronzeAccount bronze = new BronzeAccount (DayTime, NightTime, MegabytesUsed, 0.12, 0.05, 36.00, 60, 500, 0.02);
        SilverAccount silver = new SilverAccount (DayTime, NightTime, MegabytesUsed, 0.12, 0.00, 46.00, 130, 1000, 0.01);
        GoldAccount gold = new GoldAccount (DayTime, NightTime, MegabytesUsed, 0.00, 0.00, 61.00, 230, 1520, 0.01);
		
		bronze.getAccount();
		silver.getAccount();
		gold.getAccount();
		
		if (bronze.TotalCost() < silver.TotalCost() && bronze.TotalCost() < gold.TotalCost()){
            
            System.out.println("Bronze Account is cheapest cost");
        }
        
        else if (bronze.TotalCost() > silver.TotalCost() && silver.TotalCost() < gold.TotalCost()){
            
            System.out.println("Silver Account is cheapest cost");
        }
        
        else if (bronze.TotalCost() > gold.TotalCost() && silver.TotalCost() > gold.TotalCost()){
            
            System.out.println("Gold Account is cheapest cost");
        }
        
        else if (bronze.TotalCost() == gold.TotalCost() || silver.TotalCost() == gold.TotalCost()){
            
            System.out.println("The costs are equal, however, Gold Account is recommended");
    }
    
        else if (bronze.TotalCost() == silver.TotalCost()){
            
            System.out.println("The costs are equal, however, Silver Account is recommended");
    }
	
} }
