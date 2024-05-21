import java.io.*;
class ConsoleRead2{
     public static void main(String[] args){
 			String text;
		try{
			System.out.println("Enter your value");
  			InputStreamReader isr = new InputStreamReader(System.in);
  			BufferedReader br = new BufferedReader(isr);
  			text = br.readLine();          //Reading String 
  			System.out.println("Given Input : " + text);
		 }catch(IOException ex){
			ex.printStackTrace();
		 }
 	}
}
