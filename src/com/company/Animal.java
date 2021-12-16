package com.company;

public class Animal {
    private String Name;
    private int Speed;
    private int Age;

    Animal (String Name,int Speed,int Age){
        this.Name=Name;
        this.Speed=Speed;
        this.Age=Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return
                "Назва тварини = " + Name  + ",Швидкість тварини = " + Speed +"км/год"+ ",Вік тварини = " + Age ;
    }
}
