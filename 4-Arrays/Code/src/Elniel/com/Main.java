package Elniel.com;

public class Main {
    public static void main(String[] args) {

        // syntax
        // datatype[] variable_name = new datatype[size]
        int[] rnows = new int[4];

        // another way
        int[] rnows2 = {1,2,4,5,6,5};

        int[] rows; // declaration of array. ros is getting defined in the stack
        rows = new int[5]; // initialisation: actually here object is being created in the memory (heap)

        /*
        int: datatype
        rows: reference variable => created in Compile time
        new int[5]: creating the object in heap memory => created in Runtime
        new: create an object in heap of array of size 5
        {1,2,4,5,6,5}: internally create an object array and store elements in it

        Important Note:
        1 - array object are in heap
        2 - heap object are not continuous
        3 - Dynamic memory allocation

        array object may not be continuous?
        it's depend on JVM
         */

        System.out.println(rows[0]);

        String[] arr = new String[5];
        System.out.println(arr[0]);

        // null only can assign to non-primitive datatype
        arr = null;
        System.out.println(arr);
    }
}