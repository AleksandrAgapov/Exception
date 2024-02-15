package HomeWorkLikedList2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        LinkList<String> list1 = new LinkList<>();

        list1.add("один");
        list1.add("два");
        list1.add("три");
        list1.add("четыре");
        list1.add("пять");


        LinkList<Integer> list2 = new LinkList<>();

        list2.add(2);
        list2.add(56);
        list2.add(85);
        list2.add(6546);
        list2.add(53587);



        list1.remove(0);
        System.out.println(list1.get(3));


       System.out.println(list1);

       for (String c : list1) {
           System.out.println(c);
}


        System.out.println(list2.get(4));

        list2.remove(3);
        list2.remove(0);


       for (Integer c : list2) {
            System.out.println(c);

        }


        }
    }


