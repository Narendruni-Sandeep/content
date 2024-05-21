import java.util.*;
public class TestComparable{
    public static void main(String[] args){

		//Create collecton
		ArrayList<MyAccount> al=new ArrayList<MyAccount>();
	
 		//adding elements
		al.add(new MyAccount(101,"NS",50000));
		al.add(new MyAccount(102,"NX",65000));
		al.add(new MyAccount(103,"NK",31000));
	
		//sorting
		Collections.sort(al);
		//reverse sorting
		//Collections.sort(al,Collections.reverseOrder());

		//reading collection
		Iterator<MyAccount> itr=al.iterator();
	
		//readinng elements
		MyAccount a;
		while(itr.hasNext()){
	   	     a=itr.next();
	    	 System.out.println(a.getBalance());
		}
   }
}