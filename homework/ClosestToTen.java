package com.telran.org.homework;

public class ClosestToTen {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;

        double target = 10.0;

        double diffM = Math.abs(target - m);
        double diffN = Math.abs(target - n);

        if (diffM < diffN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (diffN < diffM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
        }
    }

}
