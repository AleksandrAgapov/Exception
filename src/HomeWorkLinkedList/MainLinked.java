package HomeWorkLinkedList;

public class MainLinked {
    public static void main(String[] args) {

        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addFirst("abc");
        stringLinked.addFirst("abc");
        stringLinked.addFirst("abc");
        stringLinked.addFirst("abc");
        stringLinked.addLast("df");
        System.out.println(stringLinked);
//        System.out.println(stringLinked.size());
//       System.out.println(stringLinked.getElementByIndex(1));

        for (String c : stringLinked)
            System.out.println(c);
//


    }
}
