import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    // Define a single standard queue
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    // Time Complexity: O(N) - Rotates the queue to keep the last item at the front
    public void push(int x) {
        queue.add(x);
        
        // Rotate the queue: Move all previous elements behind the new element 'x'
        int sizes = queue.size();
        for (int i = 0; i < sizes - 1; i++) {
            queue.add(queue.remove());
        }
    }
    
    // Time Complexity: O(1) - The top element is already at the front of the queue
    public int pop() {
        return queue.remove();
    }
    
    // Time Complexity: O(1) - Look at the front element without removing it
    public int top() {
        return queue.peek();
    }
    
    // Time Complexity: O(1) - Check if the queue is empty
    public boolean empty() {
        return queue.isEmpty();
    }
}