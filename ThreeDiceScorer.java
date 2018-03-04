import java.util.*;

public class ThreeDiceScorer extends ThreeDice {
    
    
    public ThreeDiceScorer (int s1, int s2, int s3) {
        super (s1, s2, s3);
    }
    
 
    public int Calculus () {
        
        int sumOfDice = 0;
        
        if (threeSame()) {sumOfDice = getDie1() + getDie2() + getDie3() + 60;}
        
        else if (runOfThree()) {sumOfDice = getDie1() + getDie2() + getDie3() + 40;}
        
        else if (pair()) {sumOfDice = getDie1() + getDie2() + getDie3() + 20;}
        
        else if (allDifferent()) {sumOfDice = getDie1() + getDie2() + getDie3();
        }
        
        return sumOfDice;}    
    }
