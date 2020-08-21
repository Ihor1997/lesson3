package main.java.homework_2;




public class Task1 {
    public static void main(String[] args) {
        //System.out.println(min(5,2,3));
    }
    public int numberminimun(int arr[]){
        int numbers = arr[0];
        for (int el: arr) {
            numbers = numbers < el ? numbers : el;
        }
        return numbers;
    }

}
