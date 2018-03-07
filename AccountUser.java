import java.util.*;

public class AccountUser{
    
    public static void main (String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int DayTime = -1, NightTime = -1, MegabytesUsed = -1;
        
        while (DayTime < 0 || NightTime < 0 || MegabytesUsed < 0) {
        
        System.out.println("Please enter the number of daytime minutes used per month:");
        DayTime = input.nextInt();
        
        System.out.println("Please enter the number of nighttime minutes used per month:");
        NightTime = input.nextInt();
        
        System.out.println("Please enter the number of Megabytes used per month:");
        MegabytesUsed = input.nextInt();
        
        System.out.println("Negative numbers are not allowed;");}
        
        BronzeAccount bronze = new BronzeAccount (DayTime, NightTime, MegabytesUsed);
        SilverAccount silver = new SilverAccount (DayTime, NightTime, MegabytesUsed);
        GoldAccount gold = new GoldAccount (DayTime, NightTime, MegabytesUsed);
        
        System.out.println(bronze.getName() + "\n Package Cost: " + bronze.PackageCost() + "\n Cost of daytime calls: " + bronze.DaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + bronze.WeekendCost() + "/min \n Number of Channels: " + bronze.Channels()
        + "\n Broadband Included: " + bronze.Broadband() + "Mb \n Broadband Cost (above included limit): " + bronze.BroadbandCost()
        + "/Mb \n Total daytime calls cost: " + bronze.TotalDaytime() + "\n Total evening calls: " + bronze.TotalWeekend() + "\n Total (extra) broadband cost: "
        + bronze.TotalBroadband() + "\n Total cost: " + bronze.TotalCost());
        
        System.out.println(silver.getName() + "\n Package Cost: " + silver.PackageCost() + "\n Cost of daytime calls: " + silver.DaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + silver.WeekendCost() + "/min \n Number of Channels: " + silver.Channels()
        + "\n Broadband Included: " + silver.Broadband() + "Mb \n Broadband Cost (above included limit): " + silver.BroadbandCost()
        + "/Mb \n Total daytime calls cost: " + silver.TotalDaytime() + "\n Total evening calls: " + silver.TotalWeekend() + "\n Total (extra) broadband cost: "
        + silver.TotalBroadband() + "\n Total cost: " + silver.TotalCost() + "\n Spotify Account provided");
        
        System.out.println(gold.getName() + "\n Package Cost: " + gold.PackageCost() + "\n Cost of daytime calls: " + gold.DaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + gold.WeekendCost() + "/min \n Number of Channels: " + gold.Channels()
        + "\n Broadband Included: " + gold.Broadband() + "Mb \n Broadband Cost (above included limit): " + gold.BroadbandCost()
        + "/Mb \n Total daytime calls cost: " + gold.TotalDaytime() + "\n Total evening calls: " + gold.TotalWeekend() + "\n Total (extra) broadband cost: "
        + gold.TotalBroadband() + "\n Total cost: " + gold.TotalCost() + "\n Spotify Account provided \n Music on Demand provided");
        
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
}}
