class LRUCache {

    HashMap<Integer, Node> map;
    int capacity, size;
    Node head, tail;

    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value, Node prev, Node next){
            this.key = key;
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }


    public LRUCache(int capacity) {
        this.map = new HashMap<Integer, Node>();
        this.capacity = capacity;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        removeNode(node);
        addtoHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        Node node;
        if (map.containsKey(key)) {
            node = map.get(key);
            node.value = value;

            // remove node
            removeNode(node);
            addtoHead(node);

        } else {
            node = new Node(key, value, null, null);

            addtoHead(node);

            map.put(key, node);
            size += 1;
        }

        if (size > capacity) {
            map.remove(tail.key);
            size--;

            tail.prev.next = null;
            tail = tail.prev;
            size = capacity;
        }

    }

    public void removeNode(Node node){
        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;

        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;
    }

    public void addtoHead(Node node){
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;
        head = node;
        if (tail == null)
            tail = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */