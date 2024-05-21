import java.util.*;
public class GenericMethodEx1{
   public static <E> void printArray(E[] inputArray) {
  	  for(E element : inputArray){
 	         System.out.print(element+"  " ); 

      }
   }
   public static void main(String[] args){

       //Calling printArray() method : 
 	   Integer[] intArray = { 1, 2, 3, 4, 5 }; 
     	Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 }; 
    	Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 
	    printArray(intArray); // pass an Integer array 
       System.out.println(); 

       printArray(doubleArray); // pass a Double array 
       System.out.println(); 

       printArray(charArray); // pass a Character array
	}
}