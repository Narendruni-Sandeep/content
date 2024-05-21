public class CurrentAccount extends Account{
    private int ano;
    private String title;
    private double balance;
    private double oDLimit;
    public CurrentAccount(int a,String t,double b,double o){
	super(a,t,b); 
	oDLimit=o;
    }
     //overriding method
     public void withdraw(double amt){
	if ((balance + oDLimit -amt)>=0){
	    balance-=amt;
	    System.out.println("Balance in your current account "+balance);
	}else
	     System.out.println("Sorry Od Limit is also over");
    }
}