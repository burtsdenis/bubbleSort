package bubbleSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(reader.readLine());
        BubbleSort array = new BubbleSort(arraySize);
        for (int i = 0; i < arraySize; i++) {
            array.adder(Integer.parseInt(reader.readLine()));
        }

        array.sortArray();
        array.printer();
    }

    public static class BubbleSort {
        private int[] a;
        int elems;

        public BubbleSort(int max) {
            a = new int[max];
            elems = 0;
        }

        public void sortArray() {
            for (int out = elems - 1; out >= 0; out--) {
                for (int in = 0; in < out; in++) {
                    if (a[in] > a[in + 1]) {
                        swap(in, in + 1);
                    }
                }
            }
        }

        public void adder(int value) {
            a[elems] = value;
            elems++;
        }

        public void swap(int first, int second) {
            int dummy = a[first];
            a[first] = a[second];
            a[second] = dummy;
        }

        public void printer() {
            for (int i = 0; i < elems; i++) {
                System.out.println(a[i]);
            }
        }

    }
}
