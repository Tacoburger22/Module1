import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * IteratorError.java
 * Illustrates a common error when using Iterators.
 *
 * @author   Isaac Weiss
 * @version  2020-09-05
 *
 */
public class IteratorError {

   /**
    * Identify and eliminate the errors regarding the use
    * of the iterator itr in the following method. Test.
    */
   public static <T> int search(List<T> list, T target) {
      int i = 0;
      Iterator<T> itr = list.iterator();
      while ((itr.hasNext()) && (!itr.next().equals(target))) {
         i++;
      }
      if (itr.hasNext()) {
         return i;
      }
      else {
         return -1;
      }
   }

   /** Drives execution. */
   public static void main(String[] args) {
      List<Integer> ilist = new ArrayList<Integer>();
      ilist.add(2);
      ilist.add(4);
      ilist.add(6);
      ilist.add(8);
      ilist.add(10);

      int loc = IteratorError.<Integer>search(ilist, 8);
      System.out.println(loc);
      loc = IteratorError.<Integer>search(ilist, 5);
      System.out.println(loc);
   }

}
