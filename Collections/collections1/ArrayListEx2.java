import java.util.*;
public class ArrayListEx2{
   public static void main(String args[]) {

      // ArrayList creation
      ArrayList<String> alcities = new ArrayList<String>();

      /* Adding elements to a ArrayList*/
      alcities.add("Chennai");
      alcities.add("Bangalore");
      alcities.add("Bhubaneswar");
      alcities.add("Mangalore");
      alcities.add("Vizag");
      alcities.add("Amaravati");

      //Enumerate through ArrayList elements
      Iterator<String> icities = alcities.iterator();

      System.out.println("\nElements in the Array Lst are:");
      String cty;
      while(icities.hasNext()){
			 cty=icities.next();
           System.out.println(cty);
      }
   }
}
