import java.util.*;

public class Average {

    public static void main (String args[]) {

    int die1 = 1, die2 = 1, die3 = 1;
    
    double average = 0;
    
    double sum = 0;
    
    int counter = 0;
    
    ThreeDiceScorer myobject = new ThreeDiceScorer (die1, die2, die3);
   
        while (counter < 216){
            
            sum = sum + myobject.Calculus();
            
            die1++;
                
            if (die1 == 7) {
            die1 = 1;die2++;}
            
            if (die2 == 7) {
            die2 = 1;die3++;}
            
        counter++;} 
            
    average = sum / 216;
    
    System.out.println("The sum is " + sum + " and the average is " + average);
    
    int [] myarray = new int [6];
    
    myarray [0] = 2;
    myarray [1] = 3;
    myarray [2] = 4;
    myarray [3] = 5;
    myarray [4] = 6;
    myarray [5] = 6;
    
    die1 = 1;
    die2 = 1;
    die3 = 0;
    counter = 0;
    
    ThreeDiceScorer myobject2 = new ThreeDiceScorer (die1, die2, myarray[0]);
    
        while (counter < 216){
            
            System.out.println(die1 + " " + die2 + " " + myarray[die3]);
            sum = sum + myobject2.Calculus();
            
            die1++;
                
            if (die1 == 7) {
            die1 = 1;die2++;}
            
            if (die2 == 7) {
            die2 = 1;die3++;}
            
            counter++;} 
            
    average = sum / 216;
    
    System.out.println("The sum is " + sum + " and the average is " + average);
    
}}