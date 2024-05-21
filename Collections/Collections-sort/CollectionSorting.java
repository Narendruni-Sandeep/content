import java.util.*; 
public class CollectionSorting { 
    public static void main(String[] args) { 

        // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("jHere NKXGEN"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 

        // Sorting in ascending order 
       Collections.sort(al); 
       System.out.println("List after the use of sorting" +  " Collection.sort() :\n" + al); 
 
       System.out.println(); 

       // Sorting in descending order.
        Collections.sort(al, Collections.reverseOrder()); 

        // Let us print the sorted list  after sorting in descending
        System.out.println("List after the use of rev sort" + " Collection.sort() :\n" + al); 
    } 
}
