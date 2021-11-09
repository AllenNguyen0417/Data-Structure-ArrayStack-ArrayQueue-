/**
 * Main class
 * Used to test two ArrayStack and ArrayQueue classes
 */

public class Main {

    public static void main(String[] args)  {
        //Section for testing ArrayStak Class
        System.out.println("*************************************************************");
        System.out.println("*****************Start of Testing ArrayStack*****************");
        System.out.println("*************************************************************");
        //Just call methods, and all tests are in methods
        testStackCreation();
        testStackPush();
        testStackPop();
        testStackPeek();
        testStackResize();
        testStackEmptyOrNot();
        testStackClearing();
        testPopOnEmptyStack();
        System.out.println("*************************************************************");
        System.out.println("*****************End of Testing ArrayStack*****************");
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Section for testing ArrayQueue
        System.out.println("*************************************************************");
        System.out.println("*****************Start of Testing ArrayQueue*****************");
        System.out.println("*************************************************************");
        //Just call methods, and all tests are in methods
        testQueueCreation();
        testQueueEnqueue();
        testQueueDequeue();
        testQueueFront();
        testQueueResize();
        testQueueEmptyOrNot();
        testQueueClearing();
        testDequeuOnEmptyQueue();
        System.out.println("*************************************************************");
        System.out.println("*****************End of Testing ArrayQueue*****************");
        System.out.println("*************************************************************");
    }
    
    /**
     * Used to Test Creation of Stack 
     */
    public static void testStackCreation() {
        String report = "Testing ArrayStack Class: Stak Creation\n";
        report = report.concat("Creating Stack with capacity = 10\n");
        ArrayStack stack = new ArrayStack(10);
        report = report.concat("Stack is created.\n");
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }

    /**
     * Used to test push() method of ArrayStackClass
     */
    public static void testStackPush() {
        String report = "Testing ArrayStack Class: Push Some values in Stack\n";
        report = report.concat("Creating Stack with capacity = 4\n");
        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        report = report.concat("Stack is created and pushed values 1, 2, 3, 4 in it.\n");
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test pop() method of ArrayStack class
     */
    public static void testStackPop() {
        String report = "Testing ArrayStack Class: Pop Some values from Stack\n";
        report = report.concat("Creating Stack with capacity = 10\n");
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        report = report.concat("Stack is created and pushed values 1, 2, 3, 4 \n");
        stack.getInfo();
        report = report.concat("Popped values is: " + stack.pop() + "\n");
        report = report.concat("Popped values is: " + stack.pop() + "\n");
        report = report.concat("Popped two last values from stack.\n");
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test peek() method of ArrayStack class
     */
    public static void testStackPeek() {
        String report = "Testing ArrayStack Class: Peek Some values from Stack\n";
        report = report.concat("Creating Stack with capacity = 10\n");
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        report = report.concat("Stack is created and pushed values 1, 2, 3, 4 \n");
        report = report.concat("Peeked value is: " + stack.peek() + "\n");
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test resize() method of ArrayStack class
     */
    public static void testStackResize() {
        String report = "Testing ArrayStack Class: Resize Stack\n";
        report = report.concat("Creating Stack with capacity = 4\n");
        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        report = report.concat("Stack is created and pushed values 1, 2, 3, 4, 5, 6 \n");
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test isEmpty() method of ArrayStack class
     */
    public static void testStackEmptyOrNot() {
        String report = "Testing ArrayStack Class: Check Stack is Empty or not\n";
        report = report.concat("Creating Stack with capacity = 4\n");        
        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        report = report.concat("Stack is created and pushed values 1, 2 \n");
        stack.pop();
        report = report.concat("One value is popped from Stack.\n");
        report = report.concat("Is Stack Empty? " + (stack.isEmpty() ? "Yes\n": "No\n"));
        stack.pop();
        report = report.concat("Another value is popped from Stack.\n");
        report = report.concat("Is Stack Empty? " + (stack.isEmpty() ? "Yes\n": "No\n"));        
        System.out.println(report);
    }
    
    /**
     * Used to test clear() method of ArrayStack class
     */
    public static void testStackClearing() {
        String report = "Testing ArrayStack Class: Clearing stack\n";
        report = report.concat("Creating Stack with capacity = 10\n");        
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        report = report.concat("Stack is created and pushed values 1, 2, 3, 4, 5, 6 \n");
        stack.clear();
        report = report.concat("Stack is cleared.\n");
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test raising exception when pop() is called on empty stack
     */
    public static void testPopOnEmptyStack() {
        String report = "Testing ArrayStack Class: Raising EmptyStackException\n";
        report = report.concat("Creating Stack with capacity = 4\n");
        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        report = report.concat("Stack is created and pushed values 1, 2, 3\n");
        stack.pop();
        stack.pop();
        stack.pop();
        report = report.concat("Stack is popped 3 times ans so it's empty now.\n");        
        try {
           stack.pop();
        } catch (EmptyStackException e) {
           report = report.concat("EmptyStackException is raised when pop on empty stack.\n"); 
        } 
        report = report.concat(stack.getInfo());
        System.out.println(report);
    }

    /**
     * Used to Test Creation of Queue 
     */    
    public static void testQueueCreation() {
        String report = "Testing ArrayQueue Class: Queue Creation\n";
        report = report.concat("Creating Queue with capacity = 10\n");
        ArrayQueue queue = new ArrayQueue(10);
        report = report.concat("Queue is created.\n");
        report = report.concat(queue.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test enqueue() method of ArrayQueue class
     */
    public static void testQueueEnqueue() {
        String report = "Testing ArrayQueue Class: Enqueue Some values in Queue\n";
        report = report.concat("Creating Queue with capacity = 4\n");
        ArrayQueue queue = new ArrayQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        report = report.concat("Queue is created and enqueued values 1, 2, 3, 4 in it.\n");
        report = report.concat(queue.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test dequeue() method of ArrayQueue class
     */
    public static void testQueueDequeue() {
        String report = "Testing ArrayQueue Class: Dequeue Some values from Queue\n";
        report = report.concat("Creating Queue with capacity = 10\n");
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        report = report.concat("Queue is created and enqueued values 1, 2, 3, 4 \n");
        queue.getInfo();
        report = report.concat("Dequeued value is: " + queue.dequeue() + "\n");
        report = report.concat("Dequeued value is: " + queue.dequeue() + "\n");
        report = report.concat("Dequeued two front values from Queue.\n");
        report = report.concat(queue.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test getFront() method of ArrayQueue class
     */
    public static void testQueueFront() {
        String report = "Testing ArrayQueue Class: Get front values from Queue\n";
        report = report.concat("Creating Queue with capacity = 10\n");
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        report = report.concat("Queue is created and enqueued values 1, 2, 3, 4 \n");
        report = report.concat("Front value is: " + queue.getFront() + "\n");
        report = report.concat(queue.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test resize() method of ArrayQueue class
     */
    public static void testQueueResize() {
        String report = "Testing ArrayQueue Class: Resize Queue\n";
        report = report.concat("Creating Queue with capacity = 4\n");
        ArrayQueue queue = new ArrayQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        report = report.concat("Queue is created and enqueued values 1, 2, 3, 4, 5, 6 \n");
        report = report.concat(queue.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test isEmpty() method of ArrayQueue class
     */
    public static void testQueueEmptyOrNot() {
        String report = "Testing ArrayQueue Class: Check Queue is Empty or not\n";
        report = report.concat("Creating Queue with capacity = 4\n");        
        ArrayQueue queue = new ArrayQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        report = report.concat("Queue is created and enqueued values 1, 2 \n");
        queue.dequeue();
        report = report.concat("One value is dequeued from Queue.\n");
        report = report.concat("Is Queue Empty? " + (queue.isEmpty() ? "Yes\n": "No\n"));
        queue.dequeue();
        report = report.concat("Another value is dequeued from Queue.\n");
        report = report.concat("Is Queue Empty? " + (queue.isEmpty() ? "Yes\n": "No\n"));        
        System.out.println(report);
    }
    
    /**
     * Used to test clear() method of ArrayQueue class
     */
    public static void testQueueClearing() {
        String report = "Testing ArrayQueue Class: Clearing Queue\n";
        report = report.concat("Creating Queue with capacity = 10\n");        
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        report = report.concat("Queue is created and enqueued values 1, 2, 3, 4, 5, 6 \n");
        queue.clear();
        report = report.concat("Queue is cleared.\n");
        report = report.concat(queue.getInfo());
        System.out.println(report);
    }
    
    /**
     * Used to test raising exception when dequeue() is called on empty queue
     */
    public static void testDequeuOnEmptyQueue() {
        String report = "Testing ArrayQueue Class: Raising EmptyQueueException\n";
        report = report.concat("Creating Queue with capacity = 4\n");
        ArrayQueue quque = new ArrayQueue(4);
        quque.enqueue(1);
        quque.enqueue(2);
        quque.enqueue(3);
        report = report.concat("Queue is created and enqueued values 1, 2, 3\n");
        quque.dequeue();
        quque.dequeue();
        quque.dequeue();
        report = report.concat("Queue is dequeued 3 times ans so it's empty now.\n");        
        try {
           quque.dequeue();
        } catch (EmptyQueueException e) {
           report = report.concat("EmptyQueueException is raised when dequeue on empty Queue.\n"); 
        } 
        report = report.concat(quque.getInfo());
        System.out.println(report);
    }
}
