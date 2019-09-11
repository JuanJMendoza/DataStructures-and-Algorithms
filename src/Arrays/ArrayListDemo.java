package Arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        //initilizing list as new ArrayList of type Integer;
        ArrayList<Integer> list = new ArrayList<>();

        //adding to the end of and arraylist
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println("-----------");

        //adding into a specified index.
        list.add(0,3);
        System.out.println(list);
        System.out.println("-----------");

        //removes the first occurrence of the element in given index and returns that element.
        list.remove(0);
        System.out.println(list);
        System.out.println("-----------");

        //removes the first occurrence of the given object and returns true if it removed it else reuturns false.
        System.out.println(list.remove((Object)5));
        System.out.println(list);
        System.out.println("-----------");

        //returns the index of the first occurrence of given object.
        System.out.println(list.indexOf(9));
        System.out.println(list);
        System.out.println("-----------");

        //returns the index of the last occurrence of given object.
        System.out.println(list.lastIndexOf(9));
        System.out.println(list);
        System.out.println("-----------");

        //returns a boolean value if the object is contained.
        System.out.println(list.contains(9));
        System.out.println(list.contains(19));
        System.out.println(list);
        System.out.println("-----------");

        //returns the number of items in the arraylist
        System.out.println(list.size());
        System.out.println("-----------");

        //converts arraylist to an array
        list.toArray();
        System.out.println(list);
    }
}
