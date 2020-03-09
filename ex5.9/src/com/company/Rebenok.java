package com.company;

public class Rebenok {
    Rebenok (int i)
    {
        this("зовут ");
        int God= i;
        System.out.println("Ребёнку " + i + " год ");
    }
    Rebenok (String s)
    {
        String name = s;
        System.out.println("Ребёнка " + s + "Алёна ");
    }
    void sleep()
    {
        System.out.println("уложить спать");
        feed();
    }
    void feed()
    {
        System.out.println("накормить");
    }
}
