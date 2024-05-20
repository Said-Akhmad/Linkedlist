public class MyLinkedList<T> {
    Node<T> head;
    private int size = 0;
    public void add(T t) {
        if (head == null) {
            head = new Node<>(t);
            size++;
        } else {
            addLast(t);
        }
    }

    public void addFirst(T t) {
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
        size++;
    }

    public int size(){
        return size;
    }

    public void addLast(T t) {

        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<T>(t);
        size++;
    }

    public int getIndex(T t) {
        if (head == null) {
            return -1;
        }
        if (head.value == t) {
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            result++;
            if (currentNode.next.value == t) {
                return result;

            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return (T) result.value;
    }

    public void remove(T t) {
        if (head == null) {
            return;
        }
        if (head.value == t) {
            head = head.next;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {

            if (currentNode.next.value == t) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }


    @Override
    public String toString() {
        return
                "head=" + head
                ;
    }


}

