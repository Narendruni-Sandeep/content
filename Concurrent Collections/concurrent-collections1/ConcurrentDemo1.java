// Java program to illustrate Traditional
// Collections Problem

import java.util.*;
class ConcurrentDemo1 extends Thread {
    static ArrayList al = new ArrayList();
    public void run(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println("Child Thread" + " going to add element");
        }
 
        // Child thread trying to add new element 
        al.add("Delhi");
    }
 
    public static void main(String[] args) throws InterruptedException{
        al.add("Amaravati");
        al.add("Mumbai");
        al.add("Chennai");
 
        // We create a child thread that is
        // going to modify ArrayList l.
        ConcurrentDemo1 cd1 = new ConcurrentDemo1();
        cd1.start();
 
        // Now we iterate through the ArrayList
        // and get exception.
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(4000);
        }
        System.out.println(al);
    }
}

