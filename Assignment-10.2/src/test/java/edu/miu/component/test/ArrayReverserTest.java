package edu.miu.component.test;

import edu.miu.component.ArrayReverser;
import edu.miu.service.ArrayFlattenerService;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ArrayReverserTest {
    private ArrayReverser arrayReverser;
    private ArrayFlattenerService flattenerServiceMock;

    @Before
    public void setUp() {
        flattenerServiceMock = mock(ArrayFlattenerService.class);
        arrayReverser = new ArrayReverser(flattenerServiceMock);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};

        when(flattenerServiceMock.flattenArray(a_in)).thenReturn(flattenedArray);

        int[] a_out = arrayReverser.reverseArray(a_in);
        int[] expectedArray = {9, 5, 4, 0, 3, 1};

        assertArrayEquals(expectedArray, a_out);

        // Verify that flattenArray method was called
        verify(flattenerServiceMock, times(1)).flattenArray(a_in);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] a_in = null;
        int[] a_out = arrayReverser.reverseArray(a_in);

        assertNull(a_out);

        // Verify that flattenArray method was not called
        verify(flattenerServiceMock, never()).flattenArray(a_in);
    }
}