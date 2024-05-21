class BankAccount implements Transaction{

	//data members
	private int ano;
	private String title;
	private double balance;

	//constructor
	public BankAccount(){
		this(1000,"",0);
	}

	//constructor
	public BankAccount(int a,String t,double b){
		ano=a;
		title=t;
		balance=b;
	}

	public int getAno(){
		return ano;
	}

	
	public double getBalance(){
		return balance;
	}


	public String  getTitle(){
		return title;
	}


	public void setTitle(String t){
		title=t;
	}

	//interface implemented method
	public void deposit(double amt){
		balance+=amt;
		System.out.println("Balance after deposit is "+ balance);
	}

	//interface implemented method
	public void withdraw(double amt){
		if ((balance-amt)>0){
			balance-=amt;
			System.out.println("Balance after deposit is "+ balance);
		}else{
			System.out.println("Insufficient funds");
		}
	}

	public void transferFunds(){
		System.out.println("Transfer of funds");
	
	}
}