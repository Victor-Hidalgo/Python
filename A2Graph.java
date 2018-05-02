/*
	Name:
	Student ID:
	Departmental username:
	University email address;
*/

import java.util.*;
import java.io.*;

class A2Graph {

	private static final int MaxVertex = 100;
	private static final int MinVertex = 1;
	private static Scanner keyboardInput = new Scanner (System.in);
	// adjacency matrix, adjMatrix[i][j] = 1 means i and j are adjacent, 0 otherwise
	public static int[][] adjMatrix = new int[MaxVertex][MaxVertex];
	public static int numVertex; // total number of vertices

	// DO NOT change the main method
	public static void main(String[] args) throws Exception {
		boolean userContinue=true;
		int distance=1;
		int[][] neighbourMatrix = new int[MaxVertex][MaxVertex];
		
		input();

		try {
//			System.out.print("Enter a distance (" + MinVertex + "--" + numVertex + ", -1 to exit): ");
			distance = keyboardInput.nextInt();
		}
		catch (Exception e) {
			keyboardInput.next();
		}
		if (distance < MinVertex || distance > numVertex)
			System.out.println("incorrect range");
		else { 
			neighbourhood(distance, neighbourMatrix, numVertex);
			printSquareArray(neighbourMatrix, numVertex);
		}
		
		degreeSeparation();
	}

	// find the degree of separation of the graph using the method neightbourhood()
	static void degreeSeparation() {

	}

	// input parameter: an integer distance
	// output: compute neighbourhood matrix for distance 
	static void neighbourhood(int distance, int result[][], int size) {
        
        result = new int [size][size];
        int i = 0;
        int j = 0;
        int k = 0;
        int counter = 2;
        System.out.println("My distance to calculate is " + distance);
        while(counter<=distance){
            
            while(i<size){
                
                while(j<size){
                    
                    if(i == j){
                        
                        result[i][j] = 0;
                    }
                    
                    else if(adjMatrix[i][j] >= 1){
                        
                        result[i][j] = adjMatrix[i][j];
                    }
                    
                    else{
                        
                        k = 0;
                        
                        while(k<size){
                            
							
                            if(adjMatrix[k][i] > 0 && adjMatrix[j][k] > 0){
                                
                                result[i][j] = adjMatrix[k][i] + adjMatrix[j][k];
								System.out.println("Distance found between " + i + "," + j + " = " + result[i][j]);
                                break;
                            }
                            
                            else{
                                
                               // result[i][j] = 0;
                            }
                            
                            k++;
                        }
                        
                        if(adjMatrix[i][j] <= counter && adjMatrix[i][j]>1){
                            
                            //result[i][j] = adjMatrix[i][j];
                        }
                        
                        else{
                            
                            //result[i][j] = 0;
                        }
                    }
					
                    j++;
                } 
                
                j = 0;
                
                i++;
            }
            
            i = 0;
            counter++;
        }
		
		int l = 0;
		
		while(l<size){
			
			System.out.println(result[0][l]);
			l++;
		}

	}

	// DO NOT change this method
	static void printSquareArray(int array[][], int size) {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	// DO NOT change this method
	static void input() {
		int i, j;
		boolean success = false;

		try {
			success = true;
//			System.out.print("How many vertices (" + MinVertex + "--" + MaxVertex + ")? ");
			numVertex = keyboardInput.nextInt();
			if (numVertex > MaxVertex || numVertex < MinVertex) {
				success = false;
			}
			if (success) {
//				System.out.println("Enter adjacency matrix: ");
				for (i=0; i<numVertex; i++)
					for (j=0; j<numVertex; j++)
						adjMatrix[i][j] = keyboardInput.nextInt();
				for (i=0; i<numVertex && success; i++) {
					if (adjMatrix[i][i] != 0)
						success = false;
					for (j=0; j<numVertex; j++) {
						if (adjMatrix[i][j] != adjMatrix[j][i])
							success = false;
					}
				}
			}
			if (!success) {
				System.out.print("Incorrect range ");
				System.out.print("or adjacency matrix not symmetric ");
				System.out.println("or vertex connected to itself");
				System.exit(0);
			}
		}
		catch (Exception e) {
			keyboardInput.next();
		}
	}

}
