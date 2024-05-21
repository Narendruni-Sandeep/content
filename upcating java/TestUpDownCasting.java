class TestUpDownCasting{
	public static void main(String[] args){
		Transaction t=new Transaction();

		SavingsAccount sa=new SavingsAccount();
		t.doAction(sa);

		CurrentAccount ca=new CurrentAccount();
		t.doAction(ca);

		RecurrentAccount ra=new RecurrentAccount();
		t.doAction(ra);


	}
}