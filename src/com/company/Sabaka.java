package com.company;


public class Sabaka {
    public Sabaka(String name, String hozyain) {
        this.name = name;
        this.hozyain = hozyain;
    }

    private String name, hozyain;
    private int age;
    public Sabaka(String n, String h, int a){
        name = n;
        age = a;
        hozyain = h;
    }
    public Sabaka(String n){
        name = n;
        age = 0;
        hozyain = "homeless";
    }
    public Sabaka(){
        name = "Pup";
        age = 0;
        hozyain = "Panin";
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHozyain(String hozyain){
        this.hozyain = hozyain;
    }
    public String getName(String name){
        return name;
    }
    public String getHozyain(String hozyain){
        return hozyain;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name + ", age " + this.age + ". Owner is " + this.hozyain + ".";
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
