public class TypeWriter{
     public static void main(String[] args){
	String t=args[0]; //say NKXGEN
	try{
	for(int i=0;i<t.length();i++){
	      System.out.print(t.charAt(i));
	      Thread.sleep(1000);
	} 	
	}catch(InterruptedException iex){
	      iex.printStackTrace();
	}
     }     
}
