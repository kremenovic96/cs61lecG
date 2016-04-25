/*import org.junit.Test;
import static org.junit.Assert.*;*/
/** Tests the methods of the Sort class */
public class TestSort {
 public static void testSort(){
String[] inputs = {"milvia","zero","josh","trump"};
String[] expected={"josh","milvia","trump","zero"};
String[] actual=Sort.sort(inputs);
 org.junit.Assert.assertArrayEquals(expected,actual);
 }
 public static void testIndexOfSmallest()
 {
String[] inputs = {"milvia","zero","josh","trump"};
//int indexOfSmallest= Sort.indexOfSmallest(inputs,2);
int expected = 2;
int actual = Sort.indexOfSmallest(inputs,2);
org.junit.Assert.assertEquals(expected,actual);
 }
	public static void main(String[] args) {
 testSort();
testIndexOfSmallest();
	}
} 
