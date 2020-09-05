package com.company;

public class TestSabaka {
    public static void main(String[] args) {
        Sabaka s1 = new Sabaka("Sharik","Petya", 2);
        Sabaka s2 = new Sabaka("Pryanik", "Kirill", 6);
        Sabaka s3 = new Sabaka();
        s3.setAge(3);
        s3.setName("Bobik");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.intoHumanAge();
        s2.intoHumanAge();
        s3.intoHumanAge();
    }
}
