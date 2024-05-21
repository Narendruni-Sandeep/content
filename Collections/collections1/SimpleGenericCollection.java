import java.util.*;
public class SimpleGenericCollection{
   public static void main(String[] args){

	//creating ArrayList with Generics
	ArrayList<String> al=new ArrayList<String>();

	//adding elements
	al.add("Nimai");
	al.add("Krsna");
	al.add("Harish");
	//al.add(100); //will return error

	//reading elements
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()){
	    System.out.println(itr.next());
	}

   }
}

	