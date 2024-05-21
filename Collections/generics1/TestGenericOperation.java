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
class TestGenericOperation{
	 public static void main(String[] args){

		GenericOperation<Integer,Integer> go1=new GenericOperation<>(40,30);
		go1.display();

		GenericOperation<Double,Double> go2=new GenericOperation<>(54.34,66.23);
		go2.display();

		GenericOperation<String,String> go3=new GenericOperation<String,String>("hello","hai");
		go3.display();

	}
}