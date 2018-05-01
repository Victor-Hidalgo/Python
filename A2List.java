/*
	Name:
	Student ID:
	Departmental username:
	University email address;
*/

import java.util.*;
import java.io.*;


// Implement a linked list from the object A2Node
class A2List {

	private static Scanner keyboardInput = new Scanner (System.in);
	public static A2Node head, tail; // head and tail of the linked list
	private static final int MaxInitCount = 10;
	private static final int MaxReqCount = 100;
	public static int initCount;
	public static int reqCount;

	public static int[] reqData = new int[MaxReqCount]; // store the requests, accessible to all methods


	// DO NOT change the main method
	public static void main(String[] args) throws Exception {
		A2Node curr;
		int tmp=-1;
		int[] initData = new int[MaxInitCount];

		initCount = 0;
		reqCount = 0;
		head = null;
		tail = null;

		try {
 			System.out.println();
  			System.out.print("Enter the initial number of files in the cabinet (1-" + MaxInitCount + "): ");
			initCount = keyboardInput.nextInt();
			if (initCount > MaxInitCount || initCount <= 0)
				System.exit(0);
 			System.out.print("Enter the initial file IDs in the cabinet (" + initCount + " different +ve integers): ");
			for (int i=0; i<initCount; i++)
				initData[i] = keyboardInput.nextInt();				
 			System.out.println();
	 		System.out.print("Enter the number of file requests (1=" + MaxReqCount + "): ");
			reqCount = keyboardInput.nextInt();
			if (reqCount > MaxReqCount || reqCount <= 0)
				System.exit(0);
 			System.out.print("Enter the request file IDs (" + reqCount + " different +ve integers): ");
			for (int i=0; i<reqCount; i++)
				reqData[i] = keyboardInput.nextInt();				
		}
		catch (Exception e) {
			keyboardInput.next();
			System.exit(0);
		}


		
		try {
			System.out.println("appendIfMiss...");
			// create a list with the input data
			// call appendIfMiss()
			for (int i=initCount-1; i>=0; i--) {
				insertNodeHead(new A2Node(initData[i]));
			}
			appendIfMiss();
		}
		catch (Exception e) {
			System.out.println("appendIfMiss exception! " + e);
		}

		try {
			System.out.println("moveToFront...");
			// empty the previous list and restart with the input data
			// then call moveToFront()
			emptyList();
			for (int i=initCount-1; i>=0; i--) {
				insertNodeHead(new A2Node(initData[i]));
			}
			moveToFront();
		}
		catch (Exception e) {
			System.out.println("moveToFront exception!");
		}

		try {
			System.out.println("freqCount...");
			// empty the previous list and restart with the input data
			// then call freqCount()
			emptyList();
			for (int i=initCount-1; i>=0; i--) {
				insertNodeHead(new A2Node(initData[i]));
			}
			freqCount();
		}
		catch (Exception e) {
			System.out.println("freqCount exception!");
		}		
	}
	
	// append to end of list when miss
	static void appendIfMiss() {
        
        A2Node curr;
        A2Node tercero;
        int i = 0;
        int comparisons = 0;
        int j = 0;
        int hits = 0;
        curr = head;
        boolean found = false;
        String sequence = "";
        String numbers = "";
        tercero = head;
        
        while(i<reqCount){
            
            while(curr != null){
                
                if(curr.data == reqData[i]){
                    
                   found = true;
                   
                   hits++; comparisons++; break;
                }
                
                comparisons++;
                curr = curr.next;
            }
            
            if(found == false){
                
                insertNodeHead(new A2Node(reqData[i]));
                
                curr = head;
                tercero = curr.next;
                
                while(tercero != null){
                    
                    j = tercero.data;
                    tercero.data = curr.data;
                    curr.data = j;
                    
                    tercero = tercero.next;
                    curr = curr.next;
                }
            
            }
            
            sequence = sequence + " " + comparisons;
            
            curr = head; comparisons = 0; found = false; j = 0;
            
            i++;
        }
        
        curr = head;
        
        System.out.println(sequence + "\n" + hits + " h");
        printList();
	}

	// move the file requested to the beginning of the list
	static void moveToFront() {
        
        A2Node curr;
        A2Node maria = head;
        int i = 0;
        int comparisons = 0;
        int hits = 0;
        int ana = 0;
        int pedro = 0;
        curr = head;
        boolean found = false;
        String sequence = "";
        
        while(i<reqCount){
            
            while(curr != null){
                
                if(reqData[i] == curr.data){
                    
                    found = true;
                   
                    hits++;
                   
                    if(reqData[i] == maria.data){
                        
                        curr = curr;
                    }
                    
                    else{
                        
                        ana = maria.data;
                        maria.data = curr.data;
                        maria = maria.next;
                   
                       while(maria != curr.next){
                            
                            pedro = ana;
                            ana = maria.data;
                            maria.data = pedro;
                            maria = maria.next;
                            
                       }
                    }
                   
                   maria = head; ana = 0;
                   comparisons++;
                   
                   break;
                }
                
                comparisons++;
                curr = curr.next;
            }
            
            if(found == false){
                
                insertNodeHead(new A2Node(reqData[i]));
                
            }
            
            sequence = sequence + " " + comparisons;
            
            maria = head; curr = head; comparisons = 0; found = false;
            
            i++;
        }
        
        System.out.println(sequence + "\n" + hits + " h");
        printList();
	}
	
	// move the file requested so that order is by non-increasing frequency
	static void freqCount() {
        
        A2Node curr;
        A2Node sec = head;
        A2Node third = head;
        int i = 0;
        int j = 0;
        int comparisons = 0;
        int hits = 0;
        int counter1 = 0;
        int counter2 = 0;
        curr = head;
        boolean found = false;
        String sequence = "";
        
        while(i<reqCount){
            
            while(curr != null){
                
                if(reqData[i] == curr.data){
                    
                    found = true; comparisons++;
                    
                    curr.freq = curr.freq + 1;
                   
                    hits++;
                   
                    if(reqData[i] == head.data){
                        
                        curr = curr;
                    }
                    
                    else{
                        
                        counter1 = sec.data;
                        sec.data = curr.data;
                        sec = sec.next;
                   
                        while(sec != curr.next){
                            
                            counter2 = counter1;
                            counter1 = sec.data;
                            sec.data = counter2;
                            sec = sec.next;
                        }
                   
                        sec = head; counter1 = 0;
                        third = sec.next;
                       
                        while (third != null){
                            
                            if(sec.freq>third.freq){
                                
                                sec = head;
                                third = sec.next;
                                break;
                            }
                            
                            else{
                                counter1 = third.data;
                                third.data = sec.data;
                                sec.data = counter1;
                            }
                            
                            sec = sec.next;
                            third = third.next;
                        }
                        
                        sec = head;
                        third = sec.next;
                    }
                   
                    break;
                }
                
                comparisons++;
                curr = curr.next;
            }
            
            if(found == false){
                
                insertNodeHead(new A2Node(reqData[i]));
                curr = head;
                sec = curr.next;
                
                while(sec != null){
                    
                    j = sec.data;
                    sec.data = curr.data;
                    curr.data = j;
                    
                    sec = sec.next;
                    curr = curr.next;
                }
            }
            
            sequence = sequence + " " + comparisons;
            
            sec = head; curr = head; comparisons = 0; found = false;
            
            j = 0; third = head;
            
            i++;
        }
        
        sec = head;
        
            while(sec != null){
                System.out.println(sec.data + " " + sec.freq);
                
                sec = sec.next;
            }
        
        System.out.println(sequence + "\n" + hits + " h");
        printList();
	}

	static void insertNodeHead(A2Node newNode) {

		newNode.next = head;
		if (head == null)
			tail = newNode;
		head = newNode;
	}

	// DO NOT change this method
	// delete the node at the head of the linked list
	static A2Node deleteHead() {
		A2Node curr;

		curr = head;
		if (curr != null) {
			head = head.next;
			if (head == null)
				tail = null;
		}
		return curr;
	}

	// DO NOT change this method
	// print the content of the list in two orders:
	// from head to tail
	static void printList() {
		A2Node curr;

		System.out.print("List: ");
		curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	
	// DO NOT change this method
	static void emptyList() {
		
		while (head != null)
			deleteHead();
	}
}
