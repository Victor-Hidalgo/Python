import java.util.*;

public class ThreeDiceScorer extends ThreeDice {
    
    private int die1;
    private int die2;
    private int die3;
    
    public ThreeDiceScorer (int s1, int s2, int s3) {
        super (s1, s2, s3);
    }
    
 
    public void Calculus () {
        System.out.print(getDie1() + " " + getDie2() + " " + getDie3() + "   ");
        
        int sumOfDice;
        
        if (threeSame()) {sumOfDice = getDie1() + getDie2() + getDie3() + 60;
        System.out.println ("Points: " + sumOfDice);}
        
        else if (runOfThree()) {sumOfDice = getDie1() + getDie2() + getDie3() + 40;
        System.out.println ("Points: " + sumOfDice);}
        
        else if (pair()) {sumOfDice = getDie1() + getDie2() + getDie3() + 20;
        System.out.println ("Points: " + sumOfDice);}
        
        else if (allDifferent()) {sumOfDice = getDie1() + getDie2() + getDie3();
        System.out.println ("Points: " + sumOfDice);}
        
    }
}