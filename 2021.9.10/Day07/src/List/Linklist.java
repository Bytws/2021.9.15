package List;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String>  list = new LinkedList<>();

        list.add("马蓉");
        list.add("李小璐");
        list.add("白百合");

        System.out.println(list);

        list.addFirst("谷文杰");
        list.addLast("刘家衫");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
