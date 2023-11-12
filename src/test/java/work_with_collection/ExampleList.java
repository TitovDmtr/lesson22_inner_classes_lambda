package work_with_collection;

import java.util.*;

public class ExampleList {
    public static void main(String[] args) {
        // List
//        List<String> list = new ArrayList<>();
//        list.add("How");
//        list.add("are");
//        list.add("you");
//
//        System.out.println("ArrayList:");
//        //get iterator for the list
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()) { //check if there are elements
//            String s = iterator.next(); //get current element and move to the next
//            System.out.println(s);
//        }
//
//        System.out.println();
//        for(String listElement : list) {
//            System.out.println(listElement);
//        }

        //Set
//        System.out.println("HashSet:");
//        Set<String> set = new HashSet<>();
//        set.add("How");
//        set.add("are");
//        set.add("are");
//        set.add("you");
//        //get iterator for the set
//        Iterator<String> iterator1 = set.iterator();
//        while (iterator1.hasNext()) { //check if there are elements
//            String s = iterator1.next(); //get current element and move to the next
//            System.out.println(s);
//        }
//        System.out.println();
//        for (String s : set) {
//            System.out.println(s);
//        }

        // Map
        //All the elements keeps in pairs
//        System.out.println("HashMap:");
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "How");
//        map.put(2, "are");
//        map.put(3, "you");
//        //get iterator for the set
//        Iterator<Map.Entry<Integer, String>> iterator2 = map.entrySet().iterator();
//        while (iterator2.hasNext()) { //check if there are elements
//            //get pair of elements
//            Map.Entry<Integer, String> pair = iterator2.next();
//            int key = pair.getKey(); //key
//            String value = pair.getValue(); //value
//            System.out.println(key + ":" + value);
//        }
//        System.out.println();
//        for (Map.Entry<Integer, String> pair : map.entrySet()) {
//            int key = pair.getKey(); //key
//            String value = pair.getValue(); //value
//            System.out.println(key + ":" + value);
//        }

        // LinkedList
        System.out.println("LinkedList:");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("How");
        linkedList.add("are");
        linkedList.add("you");
        //get iterator for the list
        Iterator<String> iteratorLinkedList = linkedList.iterator();

        while (iteratorLinkedList.hasNext()) { //check if there are elements
            String s = iteratorLinkedList.next(); //get current element and move to the next
            System.out.println(s);
        }

        System.out.println();
        for(String listElement : linkedList) {
            System.out.println(listElement);
        }

    }
}