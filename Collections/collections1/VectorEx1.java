import java.util.*;
public class VectorEx1{
   public static void main(String args[]) {

      // Vector of initial capacity(size) of 4
      Vector<String> vc = new Vector<String>(4);

      //addElementing elements to a vector*/
      vc.addElement("Chennai");
      vc.addElement("Bangalore");
      vc.addElement("Bhubaneswar");
      vc.addElement("Mangalore");
      vc.addElement("Vizag");
      vc.addElement("Amaravati");

      //Display Vector elements
       Enumeration<String> encities = vc.elements();

      System.out.println("\nElements are:");
      String cty;
      while(encities.hasMoreElements()){
		  cty=encities.nextElement();
         System.out.println(cty);
      }
   }
}
