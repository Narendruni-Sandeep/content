import java.util.concurrent.*;
class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
			  System.out.println("Adding to the Queue :1"); 
            queue.put("1");
            Thread.sleep(1000);
			  System.out.println("Adding to the Queue :2");
            queue.put("2");
            Thread.sleep(1000);
			  System.out.println("Adding to the Queue :3");
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println("Taking from Queue :"+ queue.take());
            System.out.println("Taking from Queue :"+ queue.take());
            System.out.println("Taking from Queue :"+ queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LinkedBlockingQueueEx1{

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new LinkedBlockingQueue<String>();
        //BlockingQueue queue = new LinkedBlockingQueue<String>(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}