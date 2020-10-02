package main.java.homework.lesson14;

public class ее {


    public static void main(String[] args) {
        fiba(3);
    }

    public static int fiba(int n){

        int first = 0;
        int second = 1;
        int[] a = new int[n];
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a [i - 2];

        }



        return first;
    }
}
