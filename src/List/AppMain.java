package List;

import List.impl.GbArrayList;

public class AppMain {

    public static void main(String[] args) {

        GbList<Integer> gbList = new GbArrayList<>();

        gbList.add(34);
        gbList.add(5643);
        gbList.add(12);
        gbList.add(22);

//        System.out.println(gbList);
//        System.out.println(gbList.get(1));
////        gbList.sort();
////        System.out.println();
//        gbList.remove(1);
//        System.out.println(gbList);
//

        for (int i: gbList){
            System.out.println(i);
        }
    }
}
