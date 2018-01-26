package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // While loops
        boolean whileCondition = true;
        int count = 0;

        while (whileCondition) {
            System.out.println("Our while condition is true. Adding 1 to our count");
            count = count + 1;
            if (count == 3) {
                System.out.println("Our count is at 3");
                whileCondition = false;
            }
        }


        //Do While
        boolean doWhileCondition = false;
        int count2 = 0;

        do {
            System.out.println("Our while condition is true. Adding 1 to our count");
            count2 = count2 + 1;
            if (count2 == 3) {
                System.out.println("Our count is at 3");
                doWhileCondition = false;
            }
        } while (false);

        //For loops

        for(int i = 0; i <= 5; i++)

        {
            System.out.println(i);
        }


        // FOR EACH LOOP

        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("orange");
        fruit.add("strawberry");
        fruit.add("grape");
        for(String food : fruit) {
            if (food.contains("b") ||  food.contains("B")){
                System.out.println(food);
            }
        }
    }
}