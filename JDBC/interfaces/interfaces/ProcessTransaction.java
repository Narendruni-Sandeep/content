class ProcessTransaction{
	   public void doAction(Transaction t){
		//perform deposit
		t.deposit(1200);
		t.withdraw(4200);

		//perform special operation
		if (t instanceof BankAccount){
		    BankAccount ba=(BankAccount)t;
		    ba.transferFunds();
		}else if (t instanceof Insurance){
		    Insurance ins=(Insurance)t;
		    ins.calPremium();		
		}else if (t instanceof ProvidentFund){
		    ProvidentFund pf=(ProvidentFund)t;
		    pf.calPFAmount();
		}
	   }
	}
