package ch13.p8;

/**
   A class for executing binary searches through an array.
*/
public class BinarySearcher
{  
   private int[] a;

   /**
      Constructs a BinarySearcher.
      @param anArray a sorted array of integers
   */
   public BinarySearcher(int[] anArray)
   {
      a = anArray;
   }
   
   /**
      Finds a value in a sorted array, using the binary
      search algorithm.
      @param v the value to search
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public int search(int v)
   {  
      int low = 0;
      int high = a.length - 1;
      
      
      while (low <= high)
      {
    	 // Middle position of the array 
         int mid = (low + high) / 2;
         
         // If diff is negative the number is to be found in the 
         // top half else it is to be found in the bottom half  
         int diff = a[mid] - v;

         // Number found at position mid
         if (diff == 0) // a[mid] == v
            return mid;
         else if (diff < 0) // a[mid] < v 
        	// Use the top half       
            low = mid + 1;
         else
        	// Use the bottom half
            high = mid - 1;         
      }
      // Hence negate the position just before the insertion point
      // An insert at 0 is coded as -1
      int insertPos = low - (2*low);
      return insertPos -1;
   }
}