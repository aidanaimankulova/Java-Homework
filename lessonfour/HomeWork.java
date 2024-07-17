package com.telran.org.lessonfour;

public class HomeWork {
         //Work1
        // Метод для сложения
        public static double addition(double a, double b) {
            return a + b;
        }

        // Метод для вычитания
        public static double subtraction(double a, double b) {
            return a - b;
        }

        // Метод для умножения
        public static double multiplication(double a, double b) {
            return a * b;
        }

        // Метод для деления
        public static double division(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Деление на ноль невозможно");
            }
            return a / b;
        }

        public static void main(String[] args) {
            double num1 = 10.0;
            double num2 = 5.0;

            System.out.println("Сложение: " + addition(num1, num2));
            System.out.println("Вычитание: " + subtraction(num1, num2));
            System.out.println("Умножение: " + multiplication(num1, num2));
            System.out.println("Деление: " + division(num1, num2));
        }

}

