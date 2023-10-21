package ru.netology.services;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RestServices services = new RestServices();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        System.out.println(services.calcRest(income,expenses,threshold));

    }
}
