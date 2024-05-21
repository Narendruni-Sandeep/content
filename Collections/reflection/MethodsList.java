
import java.lang.reflect.*;
class MethodsList{
   public static void main(String[] args){
	Class cls=null;
	Method m[];
	try{
		//loading the class into memory
		cls=Class.forName(args[0]);
		

		//get all methods
		
		m = cls.getDeclaredMethods();
		//Iterate through the methods
		for(int i=0;i<m.length;i++){
	   		 System.out.println(m[i].getReturnType() +"        "+m[i].getName());
		}

	}catch(Exception ex){
	     ex.printStackTrace();
	}
   }
}
	