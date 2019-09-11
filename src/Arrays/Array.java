package Arrays;

public class Array {
    //private container to store numbers.
    private int[] items;
    //Private variable to keep track of number of items in Array. Can't rely on default container initialized values.
    private int count;
    //Constructor, int:length parameter is the size of the array the user will want.
    public Array(int length){
        //initializing the back store container by the size given by user.
        items = new int[length];
    }


    //Implementing insert() method, item:int is the int item we want to insert.
    public void insert(int item){
        //Check if back store array is full, if so resize Array to twice the prev. size.
        if(items.length == count){
            int[] doubleSizedItemsContainer = new int[count*2];
            //Copy all existing items into the new back store array.
            for(int i = 0; i < count; i++){
                doubleSizedItemsContainer[i] = items[i];
            }
            //assign double sized array to back store array.
            items = doubleSizedItemsContainer;
        }
        //count++ is incremented after the current expression is evaluated,
        //so item is assigned to index count, then count gets incremented.
        items[count++] = item; // Adds item to the end of the array.
    }


    //removeAt() method removes the element at the index:int index.
    public void removeAt(int index){
        //Validates index so not to raise an error.
        if(index >= count || index < 0 ){
            // Throws argument so to crash application and notify of the problem.
            throw new IllegalArgumentException();
        }
        //Access the back store array at the given index and move every item in the array
        // over to the left by one space up starting from that given index + 1.
        for(int i = index; i < count-1; i++){
            items[i] = items[i + 1];
        }
        //Decrement count so when calling print() we only print the actual values we have.
        count--;
    }


    //indexOf() returns the index of the given value if it exists, OW returns -1.
    public int indexOf(int element){
        // If we find it, return index OW return -1
        if(count > 0){
            for(int i = 0; i < count; i++) {
                if (items[i] == element) {
                    return i;
                }
            }
        }
        return -1;
    }


    //Implementing print() method.
    public void print(){
        if(count == 0){
            System.out.println("Your array is empty.");
        }
        //Will iterate count number of times because count will keep track of Array's
        //true number of items, So if Array is empty nothing will print.
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
