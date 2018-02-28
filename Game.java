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
        
                ThreeDice lethal = new ThreeDice(s1, s2, s3);
                ThreeDiceScorer rekt = new ThreeDiceScorer(s1, s2, s3);
                
                first[0] = s1;
                first[1] = s2;
                first[2] = s3;
                
                int f1 = rand.nextInt(6) + 1;
                int f2 = rand.nextInt(6) + 1;
                int f3 = rand.nextInt(6) + 1;
        
                ThreeDice curry = new ThreeDice(f1, f2, f3);
                ThreeDiceScorer lebron = new ThreeDiceScorer(f1, f2, f3);
                
                first[0] = s1;
                first[1] = s2;
                first[2] = s3;
                
                second[0] = f1;
                second[1] = f2;
                second[2] = f3;
                
                if (lethal.threeSame()) {
                    currentscore1 = lethal.getDie1() + lethal.getDie2() + lethal.getDie3() + 60;} 
                else if (lethal.runOfThree()) {
                    currentscore1 = lethal.getDie1() + lethal.getDie2() + lethal.getDie3() + 40;}
                else if (lethal.pair()) {
                    currentscore1 = lethal.getDie1() + lethal.getDie2() + lethal.getDie3() + 20;}
                else if (lethal.allDifferent()) {
                    currentscore1 = lethal.getDie1() + lethal.getDie2() + lethal.getDie3();}
                
                
                if (curry.threeSame()) {
                    currentscore2 = curry.getDie1() + curry.getDie2() + curry.getDie3() + 60;} 
                else if (curry.runOfThree()) {
                    currentscore2 = curry.getDie1() + curry.getDie2() + curry.getDie3() + 40;}
                else if (curry.pair()) {
                    currentscore2 = curry.getDie1() + curry.getDie2() + curry.getDie3() + 20;}
                else if (curry.allDifferent()) {
                    currentscore2 = curry.getDie1() + curry.getDie2() + curry.getDie3();}
                    
                System.out.println("Round " + i + " \nPlayer 1: "); rekt.Calculus();
                System.out.println("Player 2: "); lebron.Calculus();
                
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
                
            else {System.out.println("Overall points winner is player 2");}
            
            System.out.println("Tom Brady is the GOAT");}
        
        else {System.out.println("Who is the GOAT?");}
        
        
    }
    
}