package homework_Advanced;

public class Task1 {

    /* Минимум n чисел
    Написать функцию, которая вычисляет минимум из массива чисел.
    */
    public static void main(String[] args) {
        int a[]={10,2,5,6,3,2};
        System.out.println(min(a));

    }

    public static int min(int[] arrayForFindingTheMinimum) {

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arrayForFindingTheMinimum.length; i++)
        {
            minimum = Math.min(minimum, arrayForFindingTheMinimum[i]);


        }

        return minimum;
    }






}
