import java.util.*;

public class Game {

    public static void main (String args[]) {
        
        Random rand = new Random ();
        int [] first = new int [3];
        int [] second = new int [3];
        int win1 = 0, win2 = 0;
        int currentscore1 = 0, currentscore2 = 0;
        double totalscore1 = 0, totalscore2 = 0;
        double average1, average2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int rounds = input.nextInt();
        int i = 1;
        
        if (rounds >= 0) {
            
            while (rounds >= i) {
                
                int s1 = rand.nextInt(6) + 1;
                int s2 = rand.nextInt(6) + 1;
                int s3 = rand.nextInt(6) + 1;
        
                ThreeDiceScorer rekt = new ThreeDiceScorer(s1, s2, s3);
                
                first[0] = s1;
                first[1] = s2;
                first[2] = s3;
                
                int f1 = rand.nextInt(6) + 1;
                int f2 = rand.nextInt(6) + 1;
                int f3 = rand.nextInt(6) + 1;
        
                ThreeDiceScorer lebron = new ThreeDiceScorer(f1, f2, f3);
                
                second[0] = f1;
                second[1] = f2;
                second[2] = f3;
                
                currentscore1 = rekt.Calculus();
                currentscore2 = lebron.Calculus();
                    
                System.out.println("Round " + i + " Player 1: " + first[0] + " " + first[1] + " " + first[2] + " Points: " +  currentscore1);
                System.out.println("Player 2: " + second[0] + " " + second[1] + " " + second[2] + " Points: " +  currentscore2);
                
                if (currentscore1 > currentscore2) {
                    System.out.println("Round winner is player 1");
                    win1++;
                }
                
                else if (currentscore1 < currentscore2) {
                    System.out.println("Round winner is player 2");
                    win2++;
                }
                
                else if (currentscore1 == currentscore2){
                    System.out.println("The round is tie!");}
                    
                totalscore1 = totalscore1 + currentscore1;
                totalscore2 = totalscore2 + currentscore2;
                
            i++;}
            
            average1 = totalscore1 / rounds;
            average2 = totalscore2 / rounds;
            
            System.out.println("Total wins: \n Player 1: " + win1 + " Player 2: " + win2 + "\nTotal points:"
            + "\n Player 1: " + totalscore1 + " Player 2: " + totalscore2 + "\n Average points per round:"
            + "\n Player 1: " + average1 + " Player 2: " + average2);
            
            if (totalscore1 > totalscore2) {
                System.out.println("Overall points winner is player 1");}
                
            else if (totalscore1 < totalscore2) {
                System.out.println("Overall points winner is player 2");}
                
            else if (totalscore1 == totalscore2) {
                System.out.println("Overall points are equal, nobody wins");}
        
        else {System.out.println("Negative values are not allowed, please try again");}
        
        
    }
    
}
