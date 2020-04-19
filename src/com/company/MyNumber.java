package com.company;

// Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
public class MyNumber {

    double number;

    public MyNumber(double number) {
        this.number = number;
    }
// MyNumber isOdd() – true jeśli atrybut jest nieparzysty
    boolean isOdd(){
        return number % 2 == 1;
    }
// MyNumber isEven() – true jeśli atrybut jest parzysty
    boolean isEven() {
    return number % 2 == 0;
    }
// MyNumber sqrt() – pierwiastek z atrybutu
    double sqrt() {
        return Math.sqrt(number);
    }
// MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x
    double pow(MyNumber x) {
        return Math.pow(number, x.number);
    }
// MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber
    double add(MyNumber someNumber){
        return number + someNumber.number;
    }
// MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber
    double substract(MyNumber someNumber) {
        return number - someNumber.number;
    }
}
