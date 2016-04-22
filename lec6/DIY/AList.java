/** Array based list.
 *  @author Josh Hug
 */
// zapisivanje
public class AList {
 int[] items;
 int size;
    /** Creates an empty list. */
    public AList() {
 size = 0;
 items = new int[100];
    }

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {
 items[size]=x;
 size=size+1;
    }

    /** Returns the item from the back of the list. */
    public int getBack() {
          int lastActuaItemIndex=size-1;
        return items[lastActuaItemIndex];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];       
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int deleteBack() {
      int back = getBack();
   items[size-1] = 0;
     size = size-1;
        return back;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }
} 
