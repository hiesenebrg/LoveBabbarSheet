import java.util.*;
class Node {
    int key;
    int value;
    Node pre;
    Node next;
  
    public Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
}
public class LRUcache {
    
    class LRUCache
    {
         private static HashMap<Integer, Node> map;
        private static int capacity, count;
        private static Node head, tail;
        //Constructor for initializing the cache capacity with the given value.
        LRUCache(int cap)
        {
              this.capacity = cap;
            map = new HashMap<>();
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
            head.pre = null;
            tail.next = null;
            count = 0;
        }
         public static void deleteNode(Node node)
        {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
      
        public static void addToHead(Node node)
        {
            node.next = head.next;
            node.next.pre = node;
            node.pre = head;
            head.next = node;
        }
    
        //Function to return value corresponding to the key.
        public static int get(int key)
        {
            
            if (map.get(key) != null) {
                Node node = map.get(key);
                int result = node.value;
                deleteNode(node);
                addToHead(node);
                // System.out.println("Got the value : " + result
                //                   + " for the key: " + key);
                return result;
            }
            // System.out.println("Did not get any value"
            //                   + " for the key: " + key);
            return -1;
        }
    
        //Function for storing key-value pair.
        public static void set(int key, int value)
        {
        //   System.out.println("Going to set the (key, "
        //                       + "value) : (" + key + ", "
        //                       + value + ")");
            if (map.get(key) != null) {
                Node node = map.get(key);
                node.value = value;
                deleteNode(node);
                addToHead(node);
            }
            else {
                Node node = new Node(key, value);
                map.put(key, node);
                if (count < capacity) {
                    count++;
                    addToHead(node);
                }
                else {
                    map.remove(tail.pre.key);
                    deleteNode(tail.pre);
                    addToHead(node);
                }
            }
        }
        
}
