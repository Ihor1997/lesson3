package main.java.lesson9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A_list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("List size: " + list.size());
        list.add(45);
        list.add(46);
        list.add(0,80);

        for (Integer el: list)
            System.out.println(el);{ }

        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
