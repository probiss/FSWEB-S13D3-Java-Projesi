package com.workintech.s13d3;

public class Person {
    //instance variable
    String firstName;
    String lastName;
    int age;
    String city;
    double weight;
    String color;

    //Constructor
    public Person(String firstname, String lastName, int age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    //Constructor overloading
    public Person(String firstname, String lastName, int age, String city, double weight, String color) {

        this(firstname, lastName, age);
        this.city = city;
        this.weight = weight;
        this.color = color;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
