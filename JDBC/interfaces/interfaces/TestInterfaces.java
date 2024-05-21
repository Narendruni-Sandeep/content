class TestInterfaces{
	public static void main(String[] args){
		ProcessTransaction pt=new ProcessTransaction();

		BankAccount ba=new BankAccount();
		pt.doAction(ba);


		Insurance ins=new Insurance();
		pt.doAction(ins);


		ProvidentFund pf=new ProvidentFund();
		pt.doAction(pf);


	}
}