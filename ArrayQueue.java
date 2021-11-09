/**
 * ArrayQueue class
 * Implements Queue Data Structure using an array.
 */
public class ArrayQueue {
    
    //Constant used when creating instane of class without initial size
    private final int CST_INITIAL_CAPACITY = 1;

    //Main Data Structure. array of int will hold all items in queue
    private int[] store;
    //Variable to hold capacity (or size) of queue
    private int capacity;
    //Variable to hold current number of items in queue
    private int count;

    /**
     * Default constructor.
     */    
    public ArrayQueue() {
        store = new int[CST_INITIAL_CAPACITY];
        capacity = CST_INITIAL_CAPACITY;
        count = 0;
    }

    /**
     * Constructor with size parameter. Used to create a queue with specified size
     * @param size 
     */
    public ArrayQueue(int size) {
        store = new int[size];
        capacity = size;
        count = 0;
    }

    /**
     * Used to add an entry to rear of queue.
     * 
     * Pre: Queue should be created and initialized.
     * Post: Add newEntry in Queue and increases the count variable of class
     * 
     * @param newEntry int value to be added in Queue
     */        
    public void enqueue(int newEntry) {
        if (count == capacity) {
            resize();
        }
        store[count] = newEntry;
        //Increase count variable to consider newly added element in queue
        count++;       
    }
    
    /**
     * Used to return and remove the front element from queue
     * 
     * Pre: Queue should be created and initialized.
     * Post: The front element is returned and removed from Queue and 
     *       decreases the count variable of class
     * @return The front element in queue
     * @throws EmptyQueueException is the count variable is zero (i.e. queue is empty)
     */
    public int dequeue() {
        int[] tempQueue = new int[capacity];
        if (count == 0) {
            //Raise exception if queue is empty
            throw new EmptyQueueException();
        }
        //The front element is always element in position 0 in store array.
        int ret = store[0];
        //Now shift the left all items in store array to remove front element
        for (int i=0;i<count;i++) {
            tempQueue[i] = store[i+1];
        }
        store = tempQueue;
        //Decrease count variable to remove popped element from stack
        count--;
        return ret;
    }

    /**
     * Used to return the front element from queue
     * 
     * Pre: Queue should be created and initialized.
     * Post: The front element is returned and no changed are made in Queue
     * @return The front element in queue
     * @throws EmptyQueueException is the count variable is zero (i.e. queue is empty)
     */        
    public int getFront() {
        if (count == 0) {
            //Raise exception if queue is empty
            throw new EmptyQueueException();
        }
        return store[0];
    }
    
    /**
     * Used to specify if Queue is empty or not
     * 
     * Pre: Queue should be created and initialized.
     * Post: No post condition.
     * @return True if count variable is zero (i.e. Queue is empty) and false otherwise
     */    
    public boolean isEmpty() {
        //Zero count means Queue is empty
        return count == 0;
    }
    
    /**
     * Used to clear Queue
     * 
     * Pre: Queue should be created and initialized.
     * Post: All elements will be removed from Queue (by setting count variable to zero)
     */       
    public void clear() {
        //Simply set the count to zero. Zero count means Queue is empty
        count = 0;
    }

    /**
     * Used to resize the Queue size when it's full and we want to add new element
     * 
     * Pre: Queue should be created, initialized and full 
     *      (i.e. count and capacity variables are equal)
     * Post: The size of queue should be doubled (by doubling capacity variable)
    */    
    public void resize() {
        //First create a new array with doubled capacity         
        int[] tempStore = new int[capacity * 2];
        //Go to a for loop and put all items in current store array into new temp array
        for (int i=0; i<count;i++) {
            tempStore[i] = store[i];
        }
        //Now set store array to doubled temp array
        store = tempStore;
        //Double the capacity as our array size is doubled now        
        capacity *= 2;
    }

    /**
     * Used to get current information of queue. 
     * including capacity, number of items and all items.
     * 
     * Pre: Queue should be created and initialized.
     * Post: No Post condition.
     * @return A string contains current information of Queue
    */    
    public String getInfo() {
        String info = "";
        info = info.concat("=======Queue Current Status=======\n");
        info = info.concat("Queue Capacity is: " + capacity + "\n");
        info = info.concat("Number of Items in Queue is: " + count + "\n");
        info = info.concat("Items in Queue are as follows (From Front To Rear):" + "\n");
        for (int i=0; i<count; i++) {
            info = info.concat(String.valueOf(store[i]).concat("\n"));
        }
        info = info.concat("==================================\n");
        return info;
    }
    
    /**
     * Getter method for store variable
     * @return store variable
     */    
    public int[] getStore() {
        return store;
    }

    /**
     * Getter method for capacity variable
     * @return capacity variable
     */    
    public int getCapacity() {
        return capacity;
    }

    /**
     * Getter method for count variable
     * @return count variable
     */    
    public int getCount() {
        return count;
    }

    
    /**
     * Setter method for store variable
     * @param store The store should be set
     */
    public void setStore(int[] store) {
        this.store = store;
    }

    /**
     * Setter method for capacity variable
     * @param capacity The capacity should be set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Setter method for count variable
     * @param count The count should be set
     */
    public void setCount(int count) {
        this.count = count;
    }    
}
