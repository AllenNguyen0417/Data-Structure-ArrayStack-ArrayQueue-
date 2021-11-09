/**
 * ArrayStack class
 * Implements Stack Data Structure using an array.
 */
public class ArrayStack {
    
    //Constant used when creating instane of class without initial size
    private final int CST_INITIAL_CAPACITY = 1;
    
    //Main Data Structure. array of int will hold all items in stack
    private int[] store;
    //Variable to hold capacity (or size) of stack
    private int capacity;
    //Variable to hold current number of items in stack
    private int count;

    /**
     * Default constructor.
     */
    public ArrayStack() {
        store = new int[CST_INITIAL_CAPACITY];
        capacity = CST_INITIAL_CAPACITY;
        count = 0;
    }

    /**
     * Constructor with size parameter. Used to create a stack with specified size
     * @param size 
     */
    public ArrayStack(int size) {
        store = new int[size];
        capacity = size;
        count = 0;
    }

    /**
     * Used to add an entry to top of stack.
     * 
     * Pre: Stack should be created and initialized.
     * Post: Add newEntry in stack and increases the count variable of class
     * 
     * @param newEntry int value to be added in stack
     */
    public void push(int newEntry) {
        if (count == capacity) {
            resize();
        }
        store[count] = newEntry;
        //Increase count variable to consider newly added element in stack
        count++;
    }
    
    /**
     * Used to return and remove the top element from stack
     * 
     * Pre: Stack should be created and initialized.
     * Post: The top element is returned and removed from Stack and 
     *       decreases the count variable of class
     * @return The top element in stack
     * @throws EmptyStackException is the count variable is zero (i.e. stack is empty)
     */
    public int pop() {
        if (count == 0) {
            //Raise exception if stack is empty
            throw new EmptyStackException();
        }
        int top = store[count-1];
        //Decrease count variable to remove popped element from stack
        count--;
        return top;
    }
    
    /**
     * Used to return the top element from stack
     * 
     * Pre: Stack should be created and initialized.
     * Post: The top element is returned and no changed are made in Stack
     * @return The top element in stack
     * @throws EmptyStackException is the count variable is zero (i.e. stack is empty)
     */    
    public int peek() {
        if (count == 0) {
            //Raise exception if stack is empty
            throw new EmptyStackException();
        }
        return store[count-1];
    }
    
    /**
     * Used to specify if Stack is empty or not
     * 
     * Pre: Stack should be created and initialized.
     * Post: No post condition.
     * @return True if count variable is zero (i.e. stack is empty) and false otherwise
     */
    public boolean isEmpty() {
        //Zero count means Stack is empty
        return count == 0;
    }
    
    
    /**
     * Used to clear stack
     * 
     * Pre: Stack should be created and initialized.
     * Post: All elements will be removed from Stack (by setting count variable to zero)
     */   
    public void clear() {
        //Simply set the count to zero. Zero count means Stack is empty
        count = 0;
    }
    
    /**
     * Used to resize the stack size when it's full and we want to add new element
     * 
     * Pre: Stack should be created, initialized and full 
     *      (i.e. count and capacity variables are equal)
     * Post: The size of stack should be doubled (by doubling capacity variable)
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
     * Used to get current information of stack. 
     * including capacity, number of items and all items.
     * 
     * Pre: Stack should be created and initialized.
     * Post: No Post condition.
     * @return A string contains current information of stack
    */
    public String getInfo() {
        String info = "";
        info = info.concat("=======Stack Current Status=======\n");
        info = info.concat("Stack Capacity is: " + capacity + "\n");
        info = info.concat("Number of Items in Stack is: " + count + "\n");
        info = info.concat("Items in Stack are as follows (From First To Last):" + "\n");
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
