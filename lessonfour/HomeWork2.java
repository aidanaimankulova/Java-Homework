package com.telran.org.lessonfour;

public class HomeWork2 {
    // Метод для преобразования строки в верхний регистр и её переворота
    public static String processString(String input) {
        // Преобразуем строку в верхний регистр
        String upperCaseString = toUpperCase(input);
        // Переворачиваем строку
        return reverseString(upperCaseString);
    }

    // Метод для преобразования строки в верхний регистр
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Метод для переворота строки
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String processedString = processString(originalString);
        System.out.println("Результат обработки строки: " + processedString);
    }

}
