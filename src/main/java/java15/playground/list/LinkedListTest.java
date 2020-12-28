package java15.playground.list;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> emptyList = new LinkedList.Nil<>();
        System.out.println(emptyList);

        LinkedList<String> oneElementList = new LinkedList.Cons<>("Test", new LinkedList.Nil<>());
        System.out.println(oneElementList);

        LinkedList<Integer> list = new LinkedList.Nil<>();
        for (int i = 0; i < 10; i++) {
            list = list.addElement(list, i);
        }
        System.out.println(list);
    }
}
