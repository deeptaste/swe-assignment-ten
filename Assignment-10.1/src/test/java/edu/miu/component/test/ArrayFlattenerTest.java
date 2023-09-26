package edu.miu.component.test;

import edu.miu.component.ArrayFlattener;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArrayWithValidInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedArray = {1, 3, 0, 4, 5, 9};
        int[] a_out = flattener.flattenArray(a_in);
        assertArrayEquals(expectedArray, a_out);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        int[][] a_in = null;
        int[] a_out = flattener.flattenArray(a_in);
        assertNull(a_out);
    }
}