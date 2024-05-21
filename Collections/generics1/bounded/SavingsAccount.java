public class SavingsAccount extends Account{
    private int ano;
    private String title;
    private double balance;
    private boolean chqFacility;
    public SavingsAccount(int a,String t,double b,boolean c){
	super(a,t,b); 
	chqFacility=c;
    }
     //overriding method
     public void withdraw(double amt){
       if (chqFacility){
	if ((balance-amt)>=1000){
	    balance-=amt;
	    System.out.println("Balance in your current account "+balance);
	}else
	     System.out.println("Sorry chq book accounts should maintain min 1k");
      }else
	super.withdraw(amt);
    }
}