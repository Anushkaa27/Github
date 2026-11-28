class MyHashMap {
    public Node[] buckets;
    public int capacity = 10009; 
    public class Node {
        int key;
        int value;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;//for now only
        }
    }
    public MyHashMap() {
        buckets = new Node[capacity];
    }
    private int getIndex(int key){
        return key%capacity;
    }
    
    public void put(int key, int value) {
        int index = getIndex(key);
        Node current = buckets[index];

        while(current != null){
            if(current.key == key){
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];//pehle head se connect kraa a->b(head)->c->other nodes....
        buckets[index] = newNode;//fir head ko update krdiya a(head)->b->c.....so one
    }
    
    public int get(int key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while(current != null){
            if(current.key == key){
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node previous = null;

        while(current != null){
            if(current.key == key){
                if(previous == null){
                    buckets[index] = current.next;
                }
                else 
                {
                    previous.next = current.next;//beechme se current ka patta cut 
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */