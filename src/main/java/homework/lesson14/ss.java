package main.java.homework.lesson14;

public class ss {


    public static void main(String[] args) {

        String name = "abbabba";
        StringBuffer stringBuffer = new StringBuffer(name).reverse();
        String strRev = stringBuffer.toString();        System.out.println(strRev);
        if (name.equalsIgnoreCase(strRev)){
            System.out.println("Cool");
        } else {
            System.out.println("No");
        }
    }
}
