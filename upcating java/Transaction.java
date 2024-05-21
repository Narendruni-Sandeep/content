class Transaction{
	   public void doAction(Account a){
		//perform deposit
		a.deposit(1200);
		a.withdraw(4200);
		//perform special operation
		if (a instanceof SavingsAccount){
		    SavingsAccount sa=(SavingsAccount)a;
		    sa.transferFunds();
		}else if (a instanceof CurrentAccount){
		    CurrentAccount ca=(CurrentAccount)a;
		    ca.calODInt();		
		}else if (a instanceof RecurrentAccount){
		    RecurrentAccount ra=(RecurrentAccount)a;
		    ra.calMatAmount();
		}
	   }
	}
