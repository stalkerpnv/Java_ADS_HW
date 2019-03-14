package homework5;

/**
 * Java. Algorithm and Data Structures of Java. Lesson 5. Homework 5
 *
 * @author Petrov Nikolay
 * @version dated March 14, 2019
 */
/*
   1. Возведение числа в степень.
   2. Написать программу "Задача о рюкзаке" с помощью рекурсии.
 */

import java.util.ArrayList;

public class MainClass {

    /**
     * Возведение числа x в степень n
     */
    public static double pow(double x, double n){
        if(n==0) return 1;
        if(n==1) return x;

        return x*pow(x,(n-1));

    }

    public static void showItems(ArrayList <Item> items){
        for(Item i: items){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        System.out.println(pow(9,2));

        ArrayList <Item> items = new ArrayList<Item>();
        
        Item phone = new Item("phone", 100,200);
        Item notebook = new Item("notebook", 150, 320);
        Item lamp = new Item("lamp", 50,50);
        Item wristwatch = new Item("wristwatch", 15, 60);
        Item compass = new Item("compass", 25, 80);

        items.add(phone);
        items.add(notebook);
        items.add(lamp);
        items.add(wristwatch);

        System.out.println("Все вещи:");
        showItems(items);

        Bag bag = new Bag(200);
        System.out.println(bag);

        bag.makeAllSets(items);
        ArrayList <Item> solve = bag.getBestSet();

        if(solve == null){
            System.out.println("Нет решения!");
        }
        else{
            System.out.println("Выбранные вещи:");
            showItems(bag.bestItems);
        }
    }
}
