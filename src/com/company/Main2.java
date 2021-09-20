package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        // #1

        System.out.println("Result of task №1:\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("JAVA HOME");
        }

        // #2
        Man man = new Man();
        Woman woman = new Woman();

        man.wife = woman.name;
        woman.husband = man.name;

        System.out.println("\n\nResult of task №2:\n");
        System.out.println(man.name + " " +"wife's name is " + man.wife);
        System.out.println(woman.name + " " +"husband's name is " + woman.husband);


        // #3
        System.out.println("\n\nResult of task №3:\n");
        System.out.println(ComparisonMin.min(12, 33));
        System.out.println(ComparisonMin.min(-20, 0));
        System.out.println(ComparisonMin.min(-10, -20));

        // #4
        System.out.println("\n\nResult of task №4:\n");
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));

        // #5
        System.out.println("\n\nResult of task №5:\n");
        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));

        // #6
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("\n\nResult of task №6:\n");
        System.out.println("Стоимость яблок " + Apple.applesPrice);

        // #7
        Human human = new Human();
        human.setName("Макс");
        System.out.println("\n\nResult of task №7:\n");
        System.out.println(human.name);

        // #8
        System.out.println("\n\nResult of task №8:\n");
        System.out.println("Realization #1:");
        checkSeason1(12);
        checkSeason1(4);
        checkSeason1(7);
        checkSeason1(10);
        System.out.println("\nRealization #2:");
        checkSeason2(12);
        checkSeason2(4);
        checkSeason2(7);
        checkSeason2(10);

        // #11
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "The max is ";

        System.out.println("\n\nResult of task №11:\n");

        System.out.println("Please enter the first number:");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("\nPlease enter the second number:");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("\nThe largest number is - ");
        System.out.println(ComparisonMax.max(a, b));

        // #12
        System.out.println("\n\nResult of task №12:\n");
        System.out.println("Please enter the number:");
        int c = Integer.parseInt(reader.readLine());
        pairedNotPairedCounter(c);
        System.out.println("Even: " + even + " Odd: " + odd);

        // #13
        System.out.println("\n\nResult of task №12:\n");
        int[] intArray = getArray();
        int max = maxFromArray(intArray);
        System.out.println("The maximum number in the array is " + max);
    }

    // #3 Methods
    public static class ComparisonMin {
        public static int min(int a, int b) {
            if (a < b) {
                return a;
            }
                return b;
        }
    }

    // #2 Methods
    static class Man {
        String name = "Jack";
        String wife;
    }
    static class Woman {
        String name = "Angela";
        String husband;
    }

    // #4 Methods
    public static int convertToSeconds(int hour){
        int seconds = hour * 60;
        return seconds;
    }

    // #5 Methods
    public static String multiplicationTable (int number){
        String res = "";
        for (int i = 1; i <= 10; i++) {
                int num = number * i;
                res = res + " " + num;
        }
        return res;
    }

    // #6 Methods
    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice = Apple.applesPrice + applesPrice;
        }
    }

    // #7 Methods
    public static class Human {
        private String name = "человек";

        public void setName(String name) {
            this.name = name;
        }
    }

    // #8 Methods
    public static void checkSeason1(int month) {
        if(month == 12 || month >= 1 && month <= 2){
            System.out.println("Winter");
        }
        else if (month >= 3 && month <= 5){
            System.out.println("Spring");
        }
        else if (month >= 6 && month <= 8){
            System.out.println("Summer");
        }
        else if (month >= 9 && month <= 11){
            System.out.println("Autumn");
        }
        else{
            System.out.println("Month number is not correct");
        }
    }
    public static void checkSeason2(int month) {
        switch (month){
            case(1): System.out.println("Winter");
            break;
            case(2): System.out.println("Winter");
            break;
            case(3): System.out.println("Spring");
            break;
            case(4): System.out.println("Spring");
            break;
            case(5): System.out.println("Spring");
            break;
            case(6): System.out.println("Summer");
            break;
            case(7): System.out.println("Summer");
            break;
            case(8): System.out.println("Summer");
            break;
            case(9): System.out.println("Autumn");
            break;
            case(10): System.out.println("Autumn");
            break;
            case(11): System.out.println("Autumn");
            break;
            case(12): System.out.println("Winter");
            break;
            default: System.out.println("Month number is not correct");
        }
    }

    // #9 Methods
    public class Human2 {
        String name;
        int age;
        int weight;
        int strength;

        public Human2(String name, int weight, int age, int strength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

    }

    // #10 Methods
    public class Dog {
        private String name;
        private int age;

        public Dog(String name, int age){
           this.name = name;
           this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }
        public void setAge(int age){
            this.age = age;
        }

        public int getAge(){
            return age;
        }
    }

    // #11 Methods
    public static class ComparisonMax {
        public static int max(int a, int b) {
            if (a < b) {
                return b;
            }
            return a;
        }
    }
    // #12 Methods
    public static int even = 0;
    public static int odd = 0;

    public static void pairedNotPairedCounter(int c) {

        String stringValue = Integer.toString(c);
        int [] digits = new int[stringValue.length()];
        for(int i=0; i<stringValue.length(); i++){
            digits[i] = Character.getNumericValue(stringValue.charAt(i));
        }

        for (int i = 0; i <digits.length; i++) {
            if (isPaired(digits[i])){
                even++;
            }
            else odd++;
        }
    }
    public static boolean isPaired(int integer){
        int remainder = integer % 2;
        if (remainder > 0){
            return false;
        }
        return true;
    }

    // #13 Methods
    public static int[] getArray() throws IOException {
        int[] intArray = new int[4];
        intArray[0] = 66;
        intArray[1] = 983;
        intArray[2] = 1556;
        intArray[3] = 633;
        return intArray;
    }

    public static int maxFromArray(int[] intArray) {
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }
}