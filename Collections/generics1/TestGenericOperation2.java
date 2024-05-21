class Account{
        private int ano;
        private String title;
        private double balance;
        
        public Account(int a,String t,double b)
        {
            ano = a;
            title = t;
            balance = b;
        }

        public void deposit(double amt)
        {
				balance+=amt;
              System.out.println("Balance is : "+ balance);
        }

        public void withdraw(double amt)
        {
            this.balance -= amt;
            System.out.println("Balance is : "+ balance);
        }
		 public String toString(){
			 return "Accno : "+ano +"  Title : "+ title + "  Balance : "+ balance;
		 }
}
class GenericOperation<A,B>{

		A element1;
		B element2;	

		public GenericOperation(A x,B y){
				element1=x;
				element2=y;
		}
		public void display(){
				System.out.println(element1);
				System.out.println(element2);
		}
		
}
class TestGenericOperation2{
		public static void main(String[] args){

			GenericOperation<Integer,Integer> go1=new GenericOperation<>(40,30);
			go1.display();

			GenericOperation<Double,Double> go2=new GenericOperation<>(54.34,66.23);
			go2.display();

			GenericOperation<String,String> go3=new GenericOperation<String,String>("hello","hai");
			go3.display();


			Account a1=new Account(101,"NKX",10000);
			Account a2=new Account(102,"NG",50000);

			GenericOperation<Account,Account> go4=new GenericOperation<>(a1,a2);
			go4.display();

		}
}