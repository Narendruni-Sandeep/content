import java.util.*;
public class TestComparator{

    public static void main(String[] args){

		//Create collecton
		ArrayList<Account> al=new ArrayList<Account>();
	
 		//adding elements
		al.add(new Account(101,"NS",50000));
		al.add(new Account(102,"NX",65000));
		al.add(new Account(103,"NK",31000));
	
		//sorting
		Collections.sort(al,new AccountSorter());

		//reading collection
		Iterator<Account> itr=al.iterator();

		//readinng elements
		Account a;
		while(itr.hasNext()){
		     a=itr.next();
		     System.out.println(a.getBalance());
		}
   }
}