package lesson3.homework;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(min(5,2,3));
    }

    public static int min(int a, int b, int c) {


        if (a < b || a < c) {

            return a;
        }
        if (b < c || b < a) {
            return b;
        }

        if (c < a || c < b) ;
        {
            return c;
        }


    }


}
