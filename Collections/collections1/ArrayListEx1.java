import java.util.*;
public class ArrayListEx1{
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

      //Iterate through ArrayList elements
      for(String cty : alcities){
         System.out.println(cty);
      }
   }
}
