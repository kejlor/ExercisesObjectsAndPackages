package com.company;

//Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost,
// imię i płeć. Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale
public class Human {

    int age;
    double weight;
    double height;
    String name;
    String gender;

    public Human(int age, double weight, double height, String name, String gender) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    boolean isMale(){
        if (gender.equals("MALE")){
            return true;
        } else {
            return false;
        }
    }
}
