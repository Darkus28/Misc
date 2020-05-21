import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Sort {


	// we will use this field to count the total number 
	// of comparisons that the code executes
	int totalCounter = 0;

	public static void main(String[] args) {

		
				/**
				 * 
				 *   Read the files and load an unsorted int array
				 *   into memory.  you do not need to add any code to this.
				 * 
				 */
	try {	
		// input files.  these must be in project folder.
		// File file = new File("5k_random_ints.txt"); // the file with 5000 random integers
		File file = new File("10k_random_ints.txt"); // the file with 10,000 random integers
		
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String line = "";
    	line = br.readLine();
    	// the file is a single line.  Read and split into integers
    	String[] splitString = line.split(" ");
	    
    	int[] intArray = new int[splitString.length];
    	for(int k = 0; k < splitString.length; k++) intArray[k] = Integer.parseInt(splitString[k]);
	    // clean up after yourself!
	    br.close();
	
		/* you now have an array called arrayInts of 10,000 random integers.  */
		// for(int k = 0; k < 10; k++) System.out.println(intArray[k] + "  ");
	    
				/**
				 * 	use the sorting algorithms you've implemented as 
				 *  methods of the Sorting class
				 * 
				 */
		
		
		intArray = new Sort().simpleSort(intArray);
	//  new Sort().bubbleSort(intArray);
		
				/**
				 * 
				 * write your sorted array to file output to check it over
				 * you don't need to add any code to this....
				 * 
				 */
		 
		 try{
			 //	File outFil = new File("sorted_5k_output.txt");
			    File outFil = new File("sorted_10k_output.txt");
		  		PrintWriter output = new PrintWriter(outFil);
		  		
		  		for(int k = 0 ; k < intArray.length ; k++){
		  		// this does one line per integer, can do something else
		  			output.println(intArray[k]);
		  		}
		  			output.close();  // clean your streams, yo.
		  			
		  } catch (IOException ex2) {
		  		System.out.printf("Error: %s", ex2);
		  }
		
		
	    
	} catch (Exception ex) {
		System.out.printf("Error: %s", ex);
	} 
		

	}

	public int[] simpleSort(int[] list){
		
		// sort and verify that it scales like n^2 by using the 5000 and 10000 length lists
		// the method int maxInRange() which finds and returns the maximum value of 
		// an array of integers within a given subrange may help.
		
   /* your code  */
		
		// after list is sorted...
		// print out number of comparisons.  compare to 1/2 * (number of ints)^2
		System.out.println("list length:     " + list.length);
		System.out.println("total number of comparisons:  " + this.totalCounter);
		return list;
		
	}
	
	public int indexOfMax(int[] list, int xI, int xF){
		// finds and returns the index of the max value between index xI and xF, inclusive.
		if(xI > xF){
			System.out.println(xI + " is not strictly less than " + xF + " returning -1");
			return -1;
		}
		
		int max = list[xI];
		int indexOf = xI;
		for(int k = xI+1 ; k <= xF ; k++){
			
			// increment totalCounter for every comparison:
			this.totalCounter++;
			
			if(list[k] > max){
				max = list[k];
				indexOf = k;
			}
		}
		
		return indexOf;
	}
	
	public int bubbleSort(int[] list){
		// code meeeeee
		return 0;
	}
	
}

	

