package com.commomPrograms;

import java.util.Scanner;

public class Calculator {

    double a, b;

    public Calculator(double a, double b, String operation) {

        this.a = a;
        this.b = b;

        switch (operation) {
            case "+":
                add();
                break;
            case "-":
                sub();
                break;
            case "*":
                mul();
                break;
            case "/":
                div();
                break;
        }

    }

    private void add() {
        System.out.println(this.a + this.b);

    }

    private void sub() {
        System.out.println(this.a - this.b);

    }

    private void mul() {
        System.out.println(this.a * this.b);

    }

    private void div() {
        System.out.println(this.a / this.b);

    }


    public static void main(String[] args) {

        Calculator obj1 = new Calculator(100, 10, "+");

        Calculator obj2 = new Calculator(100, 10, "-");

        Calculator obj3 = new Calculator(100, 10, "*");

        Calculator obj4 = new Calculator(100, 10, "/");


    }

}
