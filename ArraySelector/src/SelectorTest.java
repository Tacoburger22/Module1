import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectorTest {

    @Test
    public void kminTest() {
        int a[] = {8, 2, 8, 7, 3, 3, 4};
        int k = 1;
        int expected = 2;
        int actual = Selector.kmin(a, k);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void kmaxTest() {
        int a[] = {8, 2, 8, 7, 3, 3, 4};
        int k = 1;
        int expected = 8;
        int actual = Selector.kmax(a, k);
        Assert.assertEquals(expected, actual);
    }


    @ Test
    public void rangeTest() {
        int a[] = {8, 2, 8, 7, 3, 3, 4};
        int low = 3;
        int high = 7;
        int[] expected = {7, 3, 3, 4};
        int[] actual = Selector.range(a, low, high);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void ceilingTest() {
        int a[] = {8, 2, 8, 7, 3, 3, 4};
        int key = 5;
        int expected = 7;
        int actual = Selector.ceiling(a, key);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void floorTest() {
        int a[] = {8, 2, 8, 7, 3, 3, 4};
        int key = 5;
        int expected = 4;
        int actual = Selector.floor(a, key);
        Assert.assertEquals(expected, actual);
    }
}