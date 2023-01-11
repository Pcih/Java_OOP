package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IsEven<Integer> isEven = new IsEven<>();
        System.out.println(isEven.isGood(2));

        IsPositive<Integer> isPositive = new IsPositive<>();
        System.out.println(isPositive.isGood(5));

        BeginsWitha<String, Character> beginsWitha = new BeginsWitha<String, Character>('А');
        System.out.println(beginsWitha.isGood("Армагедон"));

        BeginsWith<String> beginsWith = new BeginsWith<>("Арм");
        System.out.println(beginsWith.isGood("Армагедон"));

        List<Integer> lst = new ArrayList<>(); 
        lst.add(6); lst.add(2); lst.add(3); lst.add(-8);
        lst.add(7); lst.add(-9); lst.add(1); lst.add(10);

        Filter<Integer> f = new Filter<>();
        System.out.println(f.filter(lst));
        
    }

}