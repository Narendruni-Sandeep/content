import java.util.*;
public class AccountSorter implements Comparator<Account>{
    public int compare(Account a1,Account a2){
		return (int)a1.getBalance()- (int)a2.getBalance();
    }
}