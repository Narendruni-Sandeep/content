public interface TransactionInterface{

	public void deposit(double amt);

	public void withdraw(double amt);

	default double calulateOtherCharges() {
        // default method implementation
		 return  0;
   }

	static double calculateInterest(float pamt, float roi,short nom) {
		 float iamt=pamt*roi*nom/1200;
        return iamt;
   }
}
	

	