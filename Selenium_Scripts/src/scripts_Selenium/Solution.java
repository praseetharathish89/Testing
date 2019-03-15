package scripts_Selenium;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator; 

class Solution {
   // public static int solution(int[] A) {
         public static int[] removeDuplicates(int A[]) {    
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
		    A=removeDuplicates(A);        
		    Arrays.sort(A);       
		   // Integer[] ip1 = new Integer[ip1_size];
		    System.out.println("Largest tree:"+A[A.length-1]);
		    System.out.println("2nd Largest tree:"+A[A.length-2]);
	}
}