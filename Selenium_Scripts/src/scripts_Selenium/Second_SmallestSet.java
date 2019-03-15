package scripts_Selenium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Second_SmallestSet {
	
	public int[] removeDuplicates(int A[]) {    
		  HashSet<Integer> set = new HashSet<>();
		    final int len = A.length;
		    for(int i = 0; i < len; i++){
		        set.add(A[i]);
		    }
		    int[] whitelist = new int[set.size()];
		    int i = 0;
		    for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
		        whitelist[i++] = it.next();
		    }
		    return whitelist;
		}

		public static void main(String[] args) {        
		    int A[]={3,4,5,4};        
		    //A=removeDuplicates(A);        
		    Arrays.sort(A);//Sorts the specified array of objects into ascending order        
		 
		    /*System.out.println("Smallest:"+A[0]);        
		    System.out.println("2nd Smallest:"+A[1]);*/
		    System.out.println("Largest:"+A[A.length-1]);
		    System.out.println("2nd Largest:"+A[A.length-2]);
	}

}
