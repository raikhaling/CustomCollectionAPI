package Collections;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        /***------------------LINKEDLIST()----------*/
        /**
         * The LinkedList class is an implementation of a doubly linked list collection, in
         * which every object in the list maintains with it a pointer to the following object in
         * the list and another pointer to the preceding object in the list.
         */
        //usng genrics to create a linked list
        LinkedList<String> days = new LinkedList<>();
        //adding items to link list
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        System.out.println("----using for loop to days the elements of the linked list-----");
        for (String s : days) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("------using addfirst() to add elements at the front of the list---");
        //add first method adds items to the front of the list
        days.addFirst("second day");
        days.addFirst("first day");
        System.out.println(days);

        System.out.println();
        System.out.println("---------add elements at a specified position add(index, value)-------");
        //To insert an object into a specific position into the list, specify the index
        days.add(2, "third day");
        System.out.println(days);

        System.out.println();
        System.out.println("---------upate a list using set(postion, value)----------");
        //update a link list
        days.set(3, "fouth day");
        System.out.println(days);

        System.out.println();
        System.out.println("-------removing form list using remove(index)-----");
        days.remove(3);
        System.out.println(days);

        /**------ ARRAYLIST------------*/

        ArrayList sign = new ArrayList();
        //You can (and should) also specify the type of elements the array list is allowed
        //to contain. This statement creates an array list that holds String objects
        ArrayList<String> signs = new ArrayList<String>();

        ArrayList<Integer> number = new ArrayList<>();//if left and right are same you can omit the rigth side

        //adding elements
        signs.add("Nabin");
        signs.add("Sabin");
        signs.add("Rabin");
        signs.add("Pabin");
        //default toString method()
        System.out.println(signs);
        System.out.println("Using for each");
        for (String s : signs) {
            System.out.print(s + " ");
        }
        System.out.println();
        /**
         * >>If an array list is already at its capacity when you add an element, the
         * array list automatically expands its capacity. Although this capacity is flexible,
         * it’s also inefficient. Whenever possible, you should anticipate how many
         * elements you’re adding to an array list and set the list’s initial capacity
         * accordingly. (You can also change the capacity at any time by calling the
         * ensureCapacity method.)
         * >> Like arrays, array lists are indexed starting with zero. Keep this in mind when
         * you use methods that accept an index number as a parameter.
         * >> The add method that inserts elements at a specific index position throws the
         * unchecked exception IndexOutOfBoundsException if an object isn’t already
         * at the index position you specify
         */
        //to access elemetns in the arrayList
        System.out.println("------------------------");
        System.out.println("Using for loop");
        for (int i = 0; i < signs.size(); i++) {
            System.out.println(signs.get(i)); //get() is used to get the element of specified position
        }
        //if you need to get the index of each string
        System.out.println("-----------------------------");
        for (String s : signs) {
            int i = signs.indexOf(s);
            System.out.println("Item: " + i + ": " + s);
        }
        //Using an iterator method
        /**
         * The Iterator interface itself defines the methods used for sequential access. The
         * common pattern is for this interface to provide at least two methods:
         * • hasNext: Returns a boolean value that indicates whether another item is available.
         * • next: Returns the next item.
         */
        System.out.println("---------------");
        System.out.println("Using iterator method");

        // Obtain an iterator for the ArrayList
        Iterator<String> it = signs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /** --------HashMap - Unordered map with key-value pairs------- */
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Grapes");

        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /**---------- LinkedHashMap - Ordered map that maintains insertion order-------*/
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Red");
        linkedHashMap.put(2, "Green");
        linkedHashMap.put(3, "Blue");
        linkedHashMap.put(4, "Yellow");

        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Removing an element from HashMap and LinkedHashMap
        hashMap.remove(2);
        linkedHashMap.remove(3);

        System.out.println("\nHashMap after removing:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nLinkedHashMap after removing:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /**------ Create a Deque using ArrayDeque-------*/
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front of the deque
        deque.addFirst("First");
        deque.addFirst("Second");
        deque.addFirst("Third");

        // System.out.println(deque);

        // Add elements to the end of the deque
        deque.addLast("Last");
        deque.addLast("Second Last");
        //  System.out.println(deque);
        System.out.println();

        System.out.println("Deque elements:");
        for (String element : deque) {
            System.out.println(element);
        }
        System.out.println("-------------------");

        // Access elements from both ends
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Remove elements from both ends
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing elements from both ends:");
        for (String element : deque) {
            System.out.println(element);
        }


    }
}

