public class MyAccount implements Comparable<MyAccount>{
    private int ano;
    private String title;
    private double balance;
    public MyAccount(int a,String t,double b){
			ano=a;
			title=t;
			balance=b;  
    }
    public int getAno(){
		return ano;
    }
     public void setTitle(String t){
		title=t;
     }
     public String getTitle(){
		return title;
     }
     public double getBalance(){
		return balance;
     }

     public void deposit(double amt){
			balance+=amt;
			System.out.println("Balance after deposit is "+balance);
     }
     public void withdraw(double amt){
		if ((balance-amt)>=0){
	 	   balance-=amt;
	  	   System.out.println("Balance after withdrawl is "+balance);
		}else
	   	   System.out.println("Sorry insufficient funds");
     }
	  //method override
     public int compareTo(MyAccount a){
			return (int)this.balance - (int)a.getBalance();
     }
}