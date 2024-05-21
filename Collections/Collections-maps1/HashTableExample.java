import java.util.Hashtable;
import java.util.Map;
public class HashTableExample {
    public static void main(String[] args) {

        Map<String, Integer> vehicles = new Hashtable<>();
 
        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
		 //vehicles.put(null,null); //ERROR
 
        System.out.println("Total vehicles: " + vehicles.size());
 
        // Iterate over all vehicles, using the keySet method.
        for (String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));

        System.out.println();
 
    }
}
