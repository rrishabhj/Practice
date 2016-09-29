
package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArratPrac {
    public static void main(String[] args) {

   // initializing unsorted int array
   int intArr[] = {30,20,5,12,55};

   // sorting array
   Arrays.sort(intArr);

   // let us print all the elements available in list
   System.out.println("The sorted int array is:");
   for (int number : intArr) {
   System.out.println("Number = " + number);
   }

   // entering the value to be searched
   int searchVal = 12;

   int retVal = Arrays.binarySearch(intArr,55);
	
   System.out.println("The index of element 12 is : " + retVal);
   int newarr[]=Arrays.copyOf(intArr, intArr.length);
   for(int io:newarr){
       System.out.println("number:"+io);
   }
   
   
    
    }
}
