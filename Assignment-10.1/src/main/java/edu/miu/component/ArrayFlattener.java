package edu.miu.component;

public class ArrayFlattener {
    public int[] flattenArray(int[][] a_in) {
        if (a_in == null) {
            return null;
        }

        int totalElements = 0;
        for (int[] arr : a_in) {
            totalElements += arr.length;
        }

        int[] a_out = new int[totalElements];
        int currentIndex = 0;

        for (int[] arr : a_in) {
            for (int element : arr) {
                a_out[currentIndex] = element;
                currentIndex++;
            }
        }

        return a_out;
    }
}

