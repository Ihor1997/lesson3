package main.java.lesson4;



public class A_object {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat barsik2 = new Cat("Barsik2", 20);

        barsik.setAge(-30);
        System.out.println(barsik.getAge());
        barsik.sayHello();
        System.out.println("Default age is: " + Cat.getDefaultAge());
        System.out.println("Total cat amount: " + barsik.totalamount);
        System.out.println(barsik.name);




//        Cat barsik3 =  barsik;
//        barsik3.name = "No name";
//
//        System.out.println(barsik.name);
//        System.out.println(barsik3.name);
//
//
//
//        int a = 50;
//        int b = 50;
//        System.out.println(a == b);
//        System.out.println(barsik == barsik2);
//        System.out.println(barsik == barsik3);


//        barsik.age = 50;
//        barsik2.name = "Barsik2";
//
////        System.out.println(barsik.age);
////        System.out.println(barsik2.age);
//
//        barsik.sayHello();
//        barsik2.sayHello();
    }
}