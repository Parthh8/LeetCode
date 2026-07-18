import java.util.HashMap;
import java.util.Map;

class LRUCache {

    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;

    // Dummy nodes
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);

        if (node == null) {
            return -1;
        }

        // This key was recently accessed
        removeNode(node);
        addToFront(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Key already exists
        if (map.containsKey(key)) {
            Node node = map.get(key);

            node.value = value;

            // Move updated node to the front
            removeNode(node);
            addToFront(node);

            return;
        }

        // Create and insert a new node
        Node newNode = new Node(key, value);

        map.put(key, newNode);
        addToFront(newNode);

        // Remove least recently used node
        if (map.size() > capacity) {
            Node leastRecentlyUsed = tail.prev;

            removeNode(leastRecentlyUsed);
            map.remove(leastRecentlyUsed.key);
        }
    }

    // Adds a node immediately after head
    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    // Removes a node from the linked list
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}