package edu.miu;

import edu.miu.component.ArrayFlattener;

public class Main {
    public static void main(String[] args) {
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        ArrayFlattener flattener = new ArrayFlattener();
        int[] a_out = flattener.flattenArray(a_in);

        System.out.print("Flattened Array: [");
        for (int i = 0; i < a_out.length; i++) {
            System.out.print(a_out[i]);
            if (i < a_out.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}