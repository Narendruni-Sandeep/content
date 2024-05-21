import java.util.concurrent.CopyOnWriteArrayList; 
import java.util.*; 
class ConcurrentDemo2 extends Thread { 
    static CopyOnWriteArrayList cal =   new CopyOnWriteArrayList(); 
    public void run() { 
        try { 
            Thread.sleep(2000); 
        } 
        catch (InterruptedException e) { 
            System.out.println("Child Thread"
                     + " going to add element"); 
        } 
  
        // Child thread trying to add new element 
	    cal.add("New Delhi"); 
    } 
    public static void main(String[] args) 
        throws InterruptedException  { 
        cal.add("Amaravati"); 
        cal.add("Mumbai"); 
        cal.add("Chennai"); 
  
        // We create a child thread that is 
        // going to modify ArrayList l. 
        ConcurrentDemo2 cd2 = new ConcurrentDemo2(); 
        cd2.start(); 
  
        // Now we iterate through the ArrayList 
        // and get exception. 
        Iterator itr = cal.iterator(); 
        while (itr.hasNext()) { 
            String s = (String)itr.next(); 
            System.out.println(s); 
            Thread.sleep(2000); 
        } 
        System.out.println(cal); 
    } 
} 