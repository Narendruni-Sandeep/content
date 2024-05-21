import java.lang.reflect.Array; 
import java.util.Arrays; 
  
public class ArraysReflect { 
    public static void main(String[] args) 
    { 
  
        // Get the size of the array 
        int sizeOfArray = 3; 
  
        // Create an integer array 
        // using reflect.Array class 
        // This is done using the newInstance() method 
        int[] intArray = (int[])Array.newInstance(int.class,sizeOfArray); 
  
        // Add elements from the array 
        // This is done using the getInt() method 
        Array.setInt(intArray, 0, 100); 
        Array.setInt(intArray, 1, 200); 
        Array.setInt(intArray, 2, 300); 
  
        // Printing the Array content 
        System.out.println(Arrays.toString(intArray)); 
  
        // Retrieve elements from the array 
        // This is done using the getInt() method 
        System.out.println("Element at index 0: "
                           + Array.getInt(intArray, 0)); 
        System.out.println("Element at index 1: "
                           + Array.getInt(intArray, 1)); 
        System.out.println("Element at index 2: "
                           + Array.getInt(intArray, 2)); 
    } 
} 