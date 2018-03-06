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
        
        BronzeAccount bronze = new BronzeAccount (DayTime, NightTime, MegabytesUsed);
        SilverAccount silver = new SilverAccount (DayTime, NightTime, MegabytesUsed);
        GoldAccount gold = new GoldAccount (DayTime, NightTime, MegabytesUsed);
        
        System.out.println(bronze.getName() + "\n Package Cost: " + bronze.getPackageCost() + "\n Cost of daytime calls: " + bronze.getDaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + bronze.getWeekendCost() + "/min \n Number of Channels: " + bronze.getChannels()
        + "\n Broadband Included: " + bronze.getBroadband() + "Mb \n Broadband Cost (above included limit): " + bronze.getBroadbandCost()
        + "/Mb \n Total daytime calls cost: " + bronze.TotalDaytime() + "Total evening calls: " + bronze.TotalWeekend() + "\n Total (extra) broadband cost: "
        + bronze.TotalBroadband() + "\n Total cost: " + bronze.TotalCost());
        
        System.out.println(silver.getName() + "\n Package Cost: " + silver.getPackageCost() + "\n Cost of daytime calls: " + silver.getDaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + silver.getWeekendCost() + "/min \n Number of Channels: " + silver.getChannels()
        + "\n Broadband Included: " + silver.getBroadband() + "Mb \n Broadband Cost (above included limit): " + silver.getBroadbandCost()
        + "/Mb \n Total daytime calls cost: " + silver.TotalDaytime() + "Total evening calls: " + silver.TotalWeekend() + "\n Total (extra) broadband cost: "
        + silver.TotalBroadband() + "\n Total cost: " + silver.TotalCost() + "\n Spotify Account provided");
        
        System.out.println(gold.getName() + "\n Package Cost: " + gold.getPackageCost() + "\n Cost of daytime calls: " + gold.getDaytimeCost()
        + "/min \n Cost of evening and weekend calls: " + gold.getWeekendCost() + "/min \n Number of Channels: " + gold.getChannels()
        + "\n Broadband Included: " + gold.getBroadband() + "Mb \n Broadband Cost (above included limit): " + gold.getBroadbandCost()
        + "/Mb \n Total daytime calls cost: " + gold.TotalDaytime() + "Total evening calls: " + gold.TotalWeekend() + "\n Total (extra) broadband cost: "
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