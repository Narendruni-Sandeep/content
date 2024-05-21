class Table14 extends Thread{
    public void run(){
	for(int i=1;i<=1000;i++)
	    System.out.println("13 *"+i+"="+(13*i));
    }
}
class Table19 extends Thread{
    public void run(){
	for(int i=1;i<=1000;i++){
	    System.out.println("17 *"+i+"="+(17*i));
	
	}
    }
}
class ThreadDemo1{
	public static void main(String[] args){
		Table14 t14=new Table14();
		Table19 t19=new Table19();
		t14.start();
		t19.start();
	}
}




















