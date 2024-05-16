import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        System.out.println("Handcrafted ArrayList Operations Repository by Pranjal Jatav");
        ArrayList<Integer> list = new ArrayList<>();
        // Here integer is class While all the elements are objects

        list.add(90); // adding at last
        list.add(89);
        list.add(34);
        list.add(34);
        System.out.println("Element Appended at last");
        System.out.println(list);

        list.add(3, 8); // Adding an element at particular index and other elements are shifting
        System.out.println("Element inserted at a particular index");
        System.out.println(list);
        // ----------------------------------------------------------------------
        System.out.println("Retrieving An element at given index 2");
        System.out.println(list.get(2)); // Retrieving an element

        // ---------------------------------------------------------------------
        System.out.println("checking if list contains a particular element or not 89 and 16");
        System.out.println(list.contains(89)); // Checking if an element exists or not in an array list
        System.out.println(list.contains(16));

        // ---------------------------------------------------------------------
        System.out.println("Length of array list");
        System.out.println(list.size()); // Length of array list

        // ---------------------------------------------------------------------
        System.out.println("Deleting an element from list from particular index 1");
        System.out.println(list.remove(1)); // Deleting an element from particular index
        System.out.println(list);

        // System.out.println("Deleting the first occurrence of repeated values");
        // list.remove(34);
        // System.out.println(list);

        // ---------------------------------------------------------------------
        System.out.println(list.set(1, 77)); // replace
        System.out.println("Replacing an element at particular index 1 value 77");
        System.out.println(list);
        // --------------------------------------------------------------------------
        System.out.println("Checking the quality of two arraylists list=list");
        System.out.println(list.equals(list)); // Equality checking of two ArrayLists
        // ------------------------------------------------------------------------
        System.out.println("Identification of the index of given element 77");
        System.out.println(list.indexOf(77)); // Index value of element/object
        // ---------------------------------------------------------------------------
        System.out.println("checking if arraylist has element or empty");
        System.out.println(list.isEmpty()); // Checking if the list is empty or not
        // -----------------------------------------------------------------------------
        System.out.println(list);

        System.out.println("Clearing arraylist");
        list.clear(); // Deleting all elements in an arraylist
        System.out.println(list.isEmpty());

        System.out.println(list);
        // -------------------------------------------------------------------------------------
        System.out.println("Conversion of array to Aarryist");
        int[] arr = { 3, 6, 7, 8, 5, 46, 6, 4, 64 };
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 6, 7, 8, 5, 46, 6, 4, 64));
        System.out.println(list2);

        Integer[] brr = list2.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(brr));
    }

}
