public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
