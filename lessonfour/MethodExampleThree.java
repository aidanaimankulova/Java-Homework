package com.telran.org.lessonfour;

public class MethodExampleThree {
    public static void main(String[] args) {
        int count = getCountOfPages();
        System.out.printf("Cont of pages = " + count);

        System.out.println("Count of pages = " + getCountOfPages());
    }

    //Метод возвращает целое число
    //return - оператор возврата из метода
    public static int getCountOfPages() {
        int countOfPages = 10;
        return countOfPages;
    }
      public static void printInfo() {
              if( 10 % 2 == 0) {
                  return;
              }
              System.out.println("Hello");
          }

}