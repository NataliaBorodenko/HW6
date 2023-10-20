package ru.netology.services;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RestServices services = new RestServices();
        System.out.println(services.calcRest( int income, int expenses, int threshold, int expected));

    }
}
