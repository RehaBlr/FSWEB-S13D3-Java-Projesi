package com.workintech.oop.model;

public class Person {
    String firstName;
            String lastName;
            int age;
            boolean male;
            double salary;
    String phone;
            String country;
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }
    public Person(String firstName ,String lastName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName ,String lastName,int age,boolean male) {
        //constructor chaining
        this(firstName,lastName,age);

        this.male = male;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){

            return (age>=13 && age<=19);
    }

    @Override
    public String toString() {
        return (String.format("firstName : %s, lastName : %s, age : %d , male : %b ,salary : %.2f",
                firstName,lastName,age,male,salary)) ;
    }
}
