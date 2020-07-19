package org.example;


public class App {

    public static void main( String[] args ) {

    }

    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++) {
            int temp = a[0];
            System.out.println("Storing " + temp);
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
                for (int k = 0; k < a.length; k++) {
                    // Helps visualization
                    System.out.print(a[k]);
                }
                System.out.println();
            }
            a[a.length - 1] = temp;
        }
        return a;
    }
}
