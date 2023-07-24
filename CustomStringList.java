package Collections;

public class CustomStringList {
    private final int INTIAL_CAPACITY = 10; //default capacity
    private int currentCapacity; //keeps tracks of the current array capacity
    private int size; //keeps tracks of the current element size
    String[] obj;

    public CustomStringList() {
        obj = new String[INTIAL_CAPACITY];
        currentCapacity = INTIAL_CAPACITY;
        size = 0;
//        for (int i = 0; i < currentCapacity; i++) {
//            obj[i] = "";
//
//        }
    }

    public CustomStringList(int size) {
        obj = new String[size];
        currentCapacity = size;
        this.size = 0;
//        for (int i = 0; i < currentCapacity; i++) {
//            obj[i] = "";
//
//        }
    }

    public void add(String s) {

        //check current size exceed the obj capacity
//        if(!obj[obj.length-1].equals("")){
//            resize();
//        }
        //check current size exceeds the obj capacity
        if (this.size == currentCapacity) {
            resize();
        }
        //insert at the end of element
        for (int i = 0; i < currentCapacity; i++) {
            if (obj[i] == null) {
                obj[i] = s;
                size++;
                break;
            }
        }
    }

    //method to resize array
    private void resize() {
        System.out.println("-----in resize method------");
        String[] newArray = new String[currentCapacity * 2]; //create new array with double size
        //copy old values to the new array
        for (int i = 0; i < currentCapacity; i++) {
            newArray[i] = obj[i];
        }
        obj = newArray; //update the reference

        // Update the size to reflect the actual number of elements in the resized array
        size = currentCapacity;
        currentCapacity = currentCapacity * 2;
    }

    //remove element
    public void remove(int position) {
//        for (int i = 0; i < currentCapacity; i++){
//            if(i == position){
//                obj[i] = "";
//            }
//        }
        //shifting the elements
        for (int i = position; i < size - 1; i++) {
            obj[i] = obj[i + 1];
        }
        obj[size - 1] = null;

        //decrement the size to reflect the change in no of elemets
        size--;

    }

    //get element
    public String get(int index) {
        for (int i = 0; i < currentCapacity; i++) {
            if (i == index) {
                return obj[i];
            }
        }
        return null;
    }

    //clear method => removes all the elements
    public void clear() {
        for (int i = 0; i < currentCapacity; i++) {
            obj[i] = "";
        }
    }

    public boolean isEmpty() {

        for (int i = 0; i < currentCapacity; i++) {
            if (obj[i] != "") {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String print = "[";
        boolean isFirstElement = true;
        for (String s : obj) {
            // If empty or null, do not print
            if (s == null || s.equals(""))
                continue;

            if (!isFirstElement) {
                print += ", ";
            }
            print += s;
            isFirstElement = false;
        }
        print += "]";
        return print;
    }
}
