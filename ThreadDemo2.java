class Table13 implements Runnable{
    public void run(){
	for(int i=1;i<=1000;i++)
	    System.out.println("13 *"+i+"="+(13*i));
    }
}
class Table17 implements Runnable{
    public void run(){
	for(int i=1;i<=1000;i++)
	    System.out.println("17 *"+i+"="+(17*i));
    }
}
class ThreadDemo2{
	public static void main(String[] args){
		Table13 t13=new Table13();
		Table17 t17=new Table17();
		Thread t1=new Thread(t13);
		Thread t2=new Thread(t17);
		t1.start();
		t2.start();
	}
}
