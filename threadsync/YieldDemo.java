public class YieldDemo { 
    public static void main(String[]args){ 
        SimpleThread st = new SimpleThread(); 
        st.start(); 
  
        for (int i=0; i<5; i++)  { 
            // Control passes to child thread 
            Thread.yield(); 
  
            // After execution of child Thread  main thread takes over 
            System.out.println(Thread.currentThread().getName() +" in control"); 
        } 
    } 
} 
class SimpleThread extends Thread { 
   public void run() { 
        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()+ " in control"); 
   } 
}