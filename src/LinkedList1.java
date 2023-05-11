import java.sql.SQLOutput;
import java.util.*;

public class LinkedList1 {

    public LinkedList1() {
        System.out.println("LinkedList1");
        System.out.println("-----------");
        linkedlist1();
        System.out.println("LinkedList2");
        System.out.println("-----------");
        linkedlist2();
        System.out.println("LinkedList3");
        System.out.println("-----------");
        linkedlist3();
    }

    public void linkedlist1() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addFirst(10);
        list1.addLast(20);
        list1.add(0, 5);
        list1.add(2, 15);
        System.out.println(list1.toString());
        for (int a : list1) {
            System.out.print(a + " ");
        }
        System.out.println("\nFirst = <" + list1.getFirst() + ">");
        System.out.println("Last = <" + list1.getLast() + ">");
    }

    public void linkedlist2() {
        LinkedList<String> list2 = new LinkedList<>();
        list2.addFirst("elephant");
        list2.addLast("lion");
        list2.addFirst("cheetah");
        list2.addLast("chimpanzee");
        list2.addFirst("giraffe");

        System.out.println(list2.toString());
        for (String a : list2) {
            System.out.print(a + " ");
        }

        System.out.println("\nFirst = <" + list2.getFirst() + ">");
        System.out.println("Last = <" + list2.getLast() + ">");

        Iterator iter = list2.iterator();
        while (iter.hasNext())
            System.out.println(iter.next() + "\t");

        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2.toString());
        System.out.println("First = <" + list2.getFirst() + ">");
        System.out.println("Last = <" + list2.getLast() + ">");
        list2.clear();
        if (list2.isEmpty())
            System.out.println("List is empty.");
    }

    public void linkedlist3() {
        LinkedList<Location> list3 = new LinkedList<>();
        list3.addLast(new Location(1,1));
        list3.addLast(new Location(2, 2));
        list3.addLast(new Location(3, 3));
        list3.addFirst(new Location(0, 0));
        Location loc = list3.getFirst();
        loc.setX(100);
        loc.setY(100);
        while (list3.isEmpty() == false) {
            System.out.println(list3.getFirst().toString());
            list3.removeFirst();
        }
    }

    public static void main(String[] args) {
        LinkedList1 app = new LinkedList1();
    }

}
