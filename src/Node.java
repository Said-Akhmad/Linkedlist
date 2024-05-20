public class Node <T>{
    public T value;
    Node<T> next;
    Node<T> qwerty;
    public Node(T t){
        this.value = t;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
