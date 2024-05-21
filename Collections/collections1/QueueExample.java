import java.util.*;
class Main{
 public static void main(String args[]){
   //creatng PriroityQueue obj
   PriorityQueue queue=new PriorityQueue();
   //adding elements to Q
   queue.add("Hari");
   queue.add("Ram");
   queue.add("Krishna"); // adding elements
   //readinng elements using methods of Queue
   System.out.println("head:"+queue.element());
   System.out.println("head:"+queue.peek());

   System.out.println("iterating the queue elements:");
   Iterator itr=queue.iterator();
   while(itr.hasNext()){
	System.out.println(itr.next());
   }

   queue.remove();
   queue.poll();
   System.out.println("after removing two elements:");
   Iterator itr2=queue.iterator();
   while(itr2.hasNext()){
	System.out.println(itr2.next());
   }
 }
}
