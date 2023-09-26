package edu.miu.component;

import edu.miu.service.ArrayFlattenerService;

public class ArrayReverser {
    private final ArrayFlattenerService flattenerService;

    public ArrayReverser(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] a_in) {
        if (a_in == null)
            return null;

        int[] flattenedArray = flattenerService.flattenArray(a_in);

        int length = flattenedArray.length;
        int[] a_out = new int[length];

        for (int i = 0; i < length; i++) {
            a_out[i] = flattenedArray[length - 1 - i];
        }

        return a_out;
    }
}
