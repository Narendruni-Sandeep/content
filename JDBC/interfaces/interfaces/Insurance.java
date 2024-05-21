class Insurance implements Transaction{

	//interface implemented method
	public void deposit(double amt){
			
			System.out.println("Insurance implementatn of deposit");
	}

	//interface implemented method
	public void withdraw(double amt){
			
			System.out.println("Insurance implementatn of wthdraw");
	}

	public void calPremium(){
		System.out.println("Premium Calculaton");
	
	}
}