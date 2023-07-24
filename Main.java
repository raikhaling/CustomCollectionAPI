package Collections;



public class Main {
    public static void main(String[] args) {
        System.out.println("----------ArrayList----------");
        System.out.println("------customStringList intialized with no argument---- ");
        System.out.println("------Adding first 10 elements using add(value)------");
        CustomStringList obj = new CustomStringList();
        obj.add("1");
        obj.add("2");
        obj.add("3");
        obj.add("4");
        obj.add("5");
        obj.add("6");
        obj.add("7");
        obj.add("8");
        obj.add("9");
        obj.add("10");
        System.out.println(obj);
//        try {
//            Thread.sleep(2000); // Sleep the main thread for 2 seconds (2000 milliseconds)
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("-----exceeds the 10 element so resizing the list-----");
        System.out.println("--------and adding more elements-------");
        obj.add("11");
        obj.add("12");

        System.out.println(obj);
        System.out.println("---using get(index) method-----");
        System.out.println("index : 1 => "+obj.get(1));
        System.out.println("-------check if empty by isEmpty()---");
        System.out.println(obj.isEmpty());
        System.out.println("-------remove 3rd element--remove(3)----");
        obj.remove(2);
        System.out.println(obj);
        System.out.println("--------use clear method-clear()-----");
        obj.clear();
        System.out.println(obj);
        System.out.println("-------after using clear method calling isEmpty()---");
        System.out.println(obj.isEmpty());



        System.out.println("----------Linked List ------------");
        CustomIntLinkedList link = new CustomIntLinkedList();
        link.add(12);
        link.add(13);
        link.add(14);
        link.add(15);
        System.out.println("----printing printList()-----");
        link.printList();

        System.out.println("------printing toString()------");
        System.out.println(link);

        System.out.println("------using addFirst(value)-- to add element at the begining-----");
        link.addFirst(0);
        link.printList();



        System.out.println("---------remove a node -------");
        link.remove(0);
        link.printList();

        System.out.println("------using remove(value)--> to remove element at the index 2-----");
        link.remove(2);
        link.printList();


        //  System.out.println(link);
        System.out.println();
        System.out.println("-------------------------------------");


    }
}
