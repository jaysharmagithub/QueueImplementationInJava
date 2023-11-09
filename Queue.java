public class Queue {

    //fields - instance variables
    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

  /*    public Queue(){
        this.queue = new LinkedList();
        this.size = 0;
    } */

    public Queue(){
        this(DEFAULT_MAX_SIZE);
    
    }

    public Queue(int maxSize){
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace(){
        if (this.size < this.maxSize){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (this.size == 0) {
            return true;
        }
        else{
            return false;
        }
    }

        public void enqueue(String data){
            if(this.hasSpace()){ 
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added " + data + "! Queue size is now "+ this.size );
            }
            else{
                throw new Error("Queue is full");
            }
        }
        

        public String dequeue(){
            if (!this.isEmpty()) {
        String data = this.queue.removeHead();
            this.size--;
            System.out.println("Removed " + data + "Queue size is now " + this.size   );
            return data;
            }
            else { 
                throw new Error("Queue is empty!");
            }
            
        }

        public String peek(){
            if(this.isEmpty()){
                return null;
            }
            else{ 
            return this.queue.head.data;
            }
        }

        

    public static void main(String[] args) {




         Queue queueOne = new Queue(10);
        System.out.println("queueOne can have "+ queueOne.maxSize +" nodes!");
        Queue queueTwo = new Queue();
        System.out.println("queueTwo can have "+ queueTwo.maxSize +" nodes!");
        Queue newQueue = new Queue();
        System.out.println("This queue has " + newQueue.size + " nodes. ");


        Queue coffeeOrder = new Queue();
        System.out.println("coffeeOrder queue has " + coffeeOrder.size + "orders.");
        coffeeOrder.enqueue("latte");
        coffeeOrder.enqueue("espresso");
        coffeeOrder.enqueue("cappucino"); 


        Queue smoothieOrders = new Queue();
        smoothieOrders.enqueue("strawberry banana");
        smoothieOrders.enqueue("Blending the smoothies...");
        smoothieOrders.dequeue();
        smoothieOrders.dequeue();
        System.out.println("All orders are complete!");  

        Queue queueOne_1= new Queue(25);
        Queue queueTwo_2 = new Queue(0);
        System.out.println("queueOne's got space for more nodes; " + queueOne_1.hasSpace());
        System.out.println("queueTwo has space for more nodes: " + queueTwo_2.hasSpace());
        System.out.println("queueOne is empty; " + queueOne_1.isEmpty());
        System.out.println("queueTwo is empty; " + queueTwo_2.isEmpty());

        Queue boundedQueue = new Queue(3);
        boundedQueue.enqueue("one");
        boundedQueue.enqueue("two");
        boundedQueue.enqueue("three");

        Queue boundedQueue_1 = new Queue(0);
        boundedQueue_1.dequeue();
        boundedQueue_1.enqueue("latte");
    }

}
